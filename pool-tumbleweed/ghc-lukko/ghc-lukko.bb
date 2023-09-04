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

RPM_NAME = "ghc-lukko-0.1.1.3-5.8.aarch64.rpm"
RPM_HASH = "1f66b1c21007908db68b56afcfadac7a0a1acbd60fb425b18219d7f6b01a211b5133bff861f5d2b769f37d5012d39d392003198b9b17ca2aff2388947d83e7d9"

RPROVIDES:${PN} += "ghc-lukko \
libHSlukko-0.1.1.3-IWqFfSgydIZCIQyWjUior5-ghc9.4.6.so"

RDEPENDS:${PN} += "libHSbase-4.17.2.0-ghc9.4.6.so \
libHSghc-bignum-1.3-ghc9.4.6.so \
libHSghc-prim-0.9.1-ghc9.4.6.so \
libc.so.6 \
libgmp.so.10 \
libm.so.6"

inherit rpm
