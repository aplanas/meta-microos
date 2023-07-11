SUMMARY = "Osmocom GPRS Gb Interface (NS/BSSGP) library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmogb library contains a GPRS BSSGP protocol implementation."
LICENSE = "AGPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmogb14-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "80102d71441e75c6d76bc6c192a5e84f1fae4057dc4bf8c6c2a903eeb0e1971cb7f55e94d068dbc69639a17f3d9eaa3ae85a8cdef6415192bc16553ca7d61c4c"

RPROVIDES:${PN} += "libosmogb.so.14 \
libosmogb14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libosmogsm.so.18 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm
