SUMMARY = "Osmocom Message Transfer Part 2 User Adaptation library"
DESCRIPTION = "M2UA (RFC 3331) provides an SCTP (RFC 3873) adaptation layer for the \
seamless backhaul of MTP Level 2 user messages and service interface \
across an IP network."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-xua-1_7_0-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "595c75c46c208791f440f7cd74080802c2bc8b3f66687a28d52be3570e6610dad1e2935082e5237217b158da355579051dd488b063a89bcdb294cdea3b558d99"

RPROVIDES:${PN} += "libosmo-xua-1-7-0 \
libosmo-xua-1.7.0.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libtalloc.so.2"

inherit rpm
