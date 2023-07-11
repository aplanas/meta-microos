SUMMARY = "RSS Feed Reader"
DESCRIPTION = "RSSTail is more or less an RSS reader: it monitors an RSS feed and if it \
detects a new entry, it will emit only that new entry."
LICENSE = "GPL-2.0"

PV = "2.1"

RPM_NAME = "rsstail-2.1-1.24.aarch64.rpm"
RPM_HASH = "c2addc0f40e72494a36276c76b4731b5846081a869b2f4b83ead4295402bc8e09393bfe9022354fabe3e0928cbf8954098ead8454a7674c84c40a79d5e8cfe0e"

RPROVIDES:${PN} += "rsstail"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmrss.so.0"

inherit rpm
