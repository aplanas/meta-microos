SUMMARY = "Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
This is the core runtime library."
LICENSE = "MIT"

PV = "2.18.0"

RPM_NAME = "libva2-2.18.0-2.2.aarch64.rpm"
RPM_HASH = "48ef7243e50c42d482858b6b2bb1c4b2c88e529c4bc7ef9382fd069da652fef7c25aa1e422d24c10fec3dabf5be0bf3f5874e6d9b00451254d602bef419fe122"

RPROVIDES:${PN} += "libva.so.2 \
libva2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
