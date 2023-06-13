SUMMARY = "Utility to edit and display the X authorization information"
DESCRIPTION = "The xauth program is used to edit and display the authorization \
information used in connecting to the X server."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "xauth-1.1.2-1.5.aarch64.rpm"
RPM_HASH = "7aac9a16e0581d757772ba1e222b1fe73c8b09edd51d9ffe0394f047651c311ee205c7a1a2da491d6f66dc1c3f95bdf52c2afc4ecc2a5369d685662c37530580"

RPROVIDES:${PN} += "xauth \
xauth(aarch-64) \
xorg-x11-xauth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXau.so.6()(64bit) \
libXext.so.6()(64bit) \
libXmuu.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
