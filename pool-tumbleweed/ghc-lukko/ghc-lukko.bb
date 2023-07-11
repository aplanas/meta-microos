SUMMARY = "File locking"
DESCRIPTION = "This package provides access to platform dependent file locking APIs: \
 \
* \
<https://www.gnu.org/software/libc/manual/html_node/Open-File-Description-Locks.html \
Open file descriptor locking> on Linux ('Lukko.OFD') * BSD-style 'flock(2)' \
locks on UNIX platforms ('Lukko.FLock') * Windows locking via \
<https://docs.microsoft.com/en-us/windows/win32/api/fileapi/nf-fileapi-lockfilee \
LockFileEx> ('Lukko.Windows') * No-op locking, which throws exceptions \
('Lukko.NoOp') * 'Lukko' module exports the best option for the target platform \
with uniform API. \
 \
There are alternative file locking packages: \
 \
* 'GHC.IO.Handle.Lock' in 'base >= 4.10' is good enough for most use cases. \
However, uses only 'Handle's so these locks cannot be used for intra-process \
locking. (You should use e.g. 'MVar' in addition). \
 \
* <https://hackage.haskell.org/package/filelock filelock> doesn't support OFD \
locking. \
 \
/Lukko/ means lock in Finnish. \
 \
Submodules 'Lukko.OFD', 'Lukko.Windows' etc are available based on following \
conditions. \
 \
' if os(windows) cpp-options: -DHAS_WINDOWS_LOCK \
 \
elif (os(linux) && flag(ofd-locking)) cpp-options: -DHAS_OFD_LOCKING \
cpp-options: -DHAS_FLOCK \
 \
elif !(os(solaris) || os(aix)) cpp-options: -DHAS_FLOCK ' \
 \
'Lukko.FLock' is available on not (Windows or Solaris or AIX). \
'Lukko.NoOp' is always available."
LICENSE = "GPL-2.0-or-later & BSD-3-Clause"

PV = "0.1.1.3"

RPM_NAME = "ghc-lukko-0.1.1.3-5.6.aarch64.rpm"
RPM_HASH = "b5400bf268fd72f6ef010ed73f0acc83a000d3ddf3a5e7746776ed719832623e61ee1534de17927a7ba547004c7f6444789b05081ba708c4f57ba8c72cae0be7"

RPROVIDES:${PN} += "ghc-lukko \
libHSlukko-0.1.1.3-7Ko9x6wnjxCV3NuL9k89V-ghc9.4.5.so"

RDEPENDS:${PN} += "libHSbase-4.17.1.0-ghc9.4.5.so \
libHSghc-bignum-1.3-ghc9.4.5.so \
libHSghc-prim-0.9.0-ghc9.4.5.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
