SUMMARY = "FreeTDS driver for libdbi"
DESCRIPTION = "This driver provides connectivity to FreeTDS database servers \
through the libdbi database independent abstraction layer. Switching \
a program's driver does not require recompilation or rewriting source \
code."
LICENSE = "LGPL-2.1+"

PV = "0.9.0.g53"

RPM_NAME = "libdbi-drivers-dbd-freetds-0.9.0.g53-3.18.aarch64.rpm"
RPM_HASH = "79eb30dc7c936441972cb38cf644d6b04a10b78ebf480e978ce1711d6b3ee3ef04ad2916a0d5045d673b3e39d2d63c5762d8b366b130970aed72d647c3772ae4"

RPROVIDES:${PN} += "libdbdfreetds.so \
libdbi-drivers-dbd-freetds"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libct.so.4 \
libdbi.so.3"

inherit rpm
