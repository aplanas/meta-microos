SUMMARY = "GNU Ada Runtime Libraries"
DESCRIPTION = "This package contains the shared libraries required to run programs \
compiled with the GNU Ada compiler (GNAT) if they are compiled to use \
shared libraries. It also contains the shared libraries for the \
Implementation of the Ada Semantic Interface Specification (ASIS), the \
implementation of Distributed Systems Programming (GLADE) and the Posix \
1003.5 Binding (Florist)."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libada7-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "1162c54a7aee936e9b874fbfa3cef4502cdbdb10268f5a44f27301fc1f525ccd8a17fc07117ba04216ee25d6da08b26ef5287c2f5a9cacdc6324a42dd3283ea2"

RPROVIDES:${PN} += "libada7 \
libada7(aarch-64) \
libgnarl-7 \
libgnarl-7.so()(64bit) \
libgnat-7 \
libgnat-7.so()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
