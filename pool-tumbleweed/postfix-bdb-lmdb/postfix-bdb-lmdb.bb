SUMMARY = "Postfix plugin to support LMDB maps"
DESCRIPTION = "Postfix plugin to support LMDB maps. This library will be loaded \
by starting postfix if you'll access a postmap which is stored in \
lmdb."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.1"

RPM_NAME = "postfix-bdb-lmdb-3.8.1-1.1.aarch64.rpm"
RPM_HASH = "fa499fc27b5e9a1e9053ab1f6125483834dcd002885317ecb2151ef49435eea1a98e650d1fc3a1d4c38bc91e4e82839c78d15622c3cd4ea684f75f60206d81e4"

RPROVIDES:${PN} += "postfix-bdb-lmdb \
postfix-lmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblmdb-0.9.30.so \
postfix-bdb"

inherit rpm
