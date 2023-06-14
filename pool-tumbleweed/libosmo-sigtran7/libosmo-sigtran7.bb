SUMMARY = "Osmocom SIGTRAN library"
DESCRIPTION = "Osmocom implementation of (parts of) SIGTRAN."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-sigtran7-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "35c972bba5c060d442dd71baec6bc3a6bcf26f17f3f9c510ebd26bb9840faac69e79ec6d39081bae12fcb997597a6fc02964fbb987c480bee9b2f8147b06ef59"

RPROVIDES:${PN} += "libosmo-sigtran.so.7 \
libosmo-sigtran7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libosmogsm.so.18 \
libosmonetif.so.11 \
libosmovty.so.9 \
libsctp.so.1 \
libtalloc.so.2"

inherit rpm
