SUMMARY = "Demo of X11 Double Buffer Extension"
DESCRIPTION = "xdbedizzy is a demo of the X11 Double Buffer Extension (DBE) \
creating a double buffered spinning scene."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "xdbedizzy-1.1.0-9.26.aarch64.rpm"
RPM_HASH = "e2bad7fd5c2c00744908d0ee9591cf22405b0d832606e2a71cfc6a8d5152ae00d963008a933ed61eb89963f1e95c315cb74fca3ec8ba65d018c671018e3aca21"

RPROVIDES:${PN} += "xdbedizzy \
xdbedizzy(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
