SUMMARY = "Osmocom SIGTRAN library"
DESCRIPTION = "Osmocom implementation of (parts of) SIGTRAN."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-sigtran7-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "35c972bba5c060d442dd71baec6bc3a6bcf26f17f3f9c510ebd26bb9840faac69e79ec6d39081bae12fcb997597a6fc02964fbb987c480bee9b2f8147b06ef59"

RPROVIDES:${PN} += "libosmo-sigtran.so.7()(64bit) \
libosmo-sigtran7 \
libosmo-sigtran7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libosmocore.so.20()(64bit) \
libosmogsm.so.18()(64bit) \
libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) \
libosmonetif.so.11()(64bit) \
libosmovty.so.9()(64bit) \
libsctp.so.1()(64bit) \
libsctp.so.1(VERS_1)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
