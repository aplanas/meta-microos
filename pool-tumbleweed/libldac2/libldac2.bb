SUMMARY = "A lossy audio codec for Bluetooth connections"
DESCRIPTION = "LDAC is an audio coding technology developed by Sony. \
It enables the transmission of High-Resolution Audio content, \
even over a Bluetooth connection."
LICENSE = "Apache-2.0"

PV = "2.0.2.3"

RPM_NAME = "libldac2-2.0.2.3-4.10.aarch64.rpm"
RPM_HASH = "5c1eb5f47c722fd5470f159e6a3e188951be5f29092da86dae3abacb386306495a3cc1b450f11b8817432be68c81117db36bb15e015c9fdf4015e8d2c14f4e99"

RPROVIDES:${PN} += "libldac2 \
libldacBT-abr.so.2 \
libldacBT-enc.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
