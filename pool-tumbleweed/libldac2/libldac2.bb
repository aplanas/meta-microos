SUMMARY = "A lossy audio codec for Bluetooth connections"
DESCRIPTION = "LDAC is an audio coding technology developed by Sony. \
It enables the transmission of High-Resolution Audio content, \
even over a Bluetooth connection."
LICENSE = "Apache-2.0"

PV = "2.0.2.3"

RPM_NAME = "libldac2-2.0.2.3-4.9.aarch64.rpm"
RPM_HASH = "3bbd6537b0489fd0c9eb27179c97cff5c38fccab2dff30e6fc35c0df01a838c3970f8789bc4e2912b40269746671a3f325b9262e18b41dcbf5f3cd37e0738fdb"

RPROVIDES:${PN} += "libldac2 \
libldacBT-abr.so.2 \
libldacBT-enc.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
