SUMMARY = "GNU Ada Runtime Libraries"
DESCRIPTION = "This package contains the shared libraries required to run programs \
compiled with the GNU Ada compiler (GNAT) if they are compiled to use \
shared libraries. It also contains the shared libraries for the \
Implementation of the Ada Semantic Interface Specification (ASIS), the \
implementation of Distributed Systems Programming (GLADE) and the Posix \
1003.5 Binding (Florist)."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "12.3.0+git1204"

RPM_NAME = "libada12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "4d891cef72ac0cab83b878e801dc5ee776ab7fd75655bab1e1640c6203bc5d0037d4cf72550c9317269ffaba494ef0ecb529d118dce5eb7095d152f803713d36"

RPROVIDES:${PN} += "libada12 \
libada12(aarch-64) \
libgnarl-12 \
libgnarl-12.so()(64bit) \
libgnat-12 \
libgnat-12.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit)"

inherit rpm
