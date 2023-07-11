SUMMARY = "Wayland compositor image grabber"
DESCRIPTION = "This tool can grab images from a Wayland compositor."
LICENSE = "MIT"

PV = "1.4.1"

RPM_NAME = "grim-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "326bd2a73e70e257a0baf3956116f917a71db4ccf04af852f936c3ad5bff901d3f4b478d067c2c9e6e85d840d392e204824cdc12d0656487e9210d9e61fa175f"

RPROVIDES:${PN} += "grim"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpixman-1.so.0 \
libpng16.so.16 \
libwayland-client.so.0"

inherit rpm
