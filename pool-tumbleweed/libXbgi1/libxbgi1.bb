SUMMARY = "BGI-compatible 2D graphics C library"
DESCRIPTION = "libXbgi is a Borland Graphics Interface (BGI) emulation library for \
X11. This library strictly emulates most BGI functions, making it \
possible to compile X11 versions of programs written for \
Turbo/Borland C. RGB extensions and basic mouse support are also \
implemented."
LICENSE = "MIT"

PV = "365"

RPM_NAME = "libXbgi1-365-1.12.aarch64.rpm"
RPM_HASH = "7337e79d26802ccd58e7cf8fd2262edc88723d84016560dd53e4fd2efe7efb582fa2f2596241221d80075ed5bd41d2c90542cea80be0673de6e73139bd40c2e8"

RPROVIDES:${PN} += "libXbgi.so.1()(64bit) \
libXbgi1 \
libXbgi1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
