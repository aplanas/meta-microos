SUMMARY = "Wayland cursor library"
DESCRIPTION = "The purpose of this library is to be the equivalent of libXcursor in \
the X world. This library is compatible with X cursor themes and \
loads them directly into an shm pool making it easy for the clients \
to get buffer for each cursor image."
LICENSE = "MIT"

PV = "1.22.0"

RPM_NAME = "libwayland-cursor0-1.22.0-1.1.aarch64.rpm"
RPM_HASH = "f461cc5d927d9fd884573c0af0e3c84a9735aa95cec11d8161db64bed53015863cf58a34bedb77f711da8e870192bc148931b17b12bc94c53548803c8d2b29da"

RPROVIDES:${PN} += "libwayland-cursor.so.0()(64bit) \
libwayland-cursor0 \
libwayland-cursor0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
