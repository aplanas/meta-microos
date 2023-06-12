SUMMARY = "Library to handle UPnP IGD port mapping"
DESCRIPTION = "GUPnP-IGD is a library to handle UPnP IGD port mapping. It is supposed \
to have a very simple API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.0"

RPM_NAME = "libgupnp-igd-1_6-0-1.6.0-2.1.aarch64.rpm"
RPM_HASH = "f6b205db7d8d2bcca24ca6d80d61e24b7dea906014f6e6abda45338b6dee296dceaee30b9c0b364416fa9ba01587a09e417a2c4e12b532be08b3afda459bbcb7"

RPROVIDES:${PN} += "libgupnp-igd-1.6.so.0()(64bit) \
libgupnp-igd-1_6-0 \
libgupnp-igd-1_6-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgssdp-1.6.so.0()(64bit) \
libgupnp-1.6.so.0()(64bit)"

inherit rpm