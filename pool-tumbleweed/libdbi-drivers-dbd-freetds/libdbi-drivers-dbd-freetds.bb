SUMMARY = "FreeTDS driver for libdbi"
DESCRIPTION = "This driver provides connectivity to FreeTDS database servers \
through the libdbi database independent abstraction layer. Switching \
a program's driver does not require recompilation or rewriting source \
code."
LICENSE = "LGPL-2.1+"

PV = "0.9.0.g53"

RPM_NAME = "libdbi-drivers-dbd-freetds-0.9.0.g53-3.19.aarch64.rpm"
RPM_HASH = "a1941a64d77d5e59cb98d201bb7816ea2968c6a23a0977e0e5f7a3dacb02f86462db34102bce10a9b65abd5af090339e319f5834ff21f40bc2550c21488a7930"

RPROVIDES:${PN} += "libdbdfreetds.so \
libdbi-drivers-dbd-freetds"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libct.so.4 \
libdbi.so.3"

inherit rpm
