SUMMARY = "X Color Management Implementation"
DESCRIPTION = "The libXcmX11 library is a reference implementation of the X Color Management specification. \
It allows to attach color regions to X windows to communicate with color \
+servers."
LICENSE = "MIT"

PV = "0.5.4"

RPM_NAME = "libXcmX11-0-0.5.4-1.22.aarch64.rpm"
RPM_HASH = "d703f16ae7c92c3b6c701cec06f79a92fea7393849936253e8daa8cc69a5ed7d966be2af8428c8a3d0871410f3e274607665b3640b61813df52960b6e87d8677"

RPROVIDES:${PN} += "libXcmX11-0 \
libXcmX11-0(aarch-64) \
libXcmX11.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXcmEDID.so.0()(64bit) \
libXfixes.so.3()(64bit) \
libXmu.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit)"

inherit rpm
