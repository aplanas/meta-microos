SUMMARY = "Maildir indexer and searcher"
DESCRIPTION = "Set of utilities to index and search Maildirs. Upstream name is mu."
LICENSE = "GPL-3.0-or-later"

PV = "1.10.4"

RPM_NAME = "maildir-utils-1.10.4-1.1.aarch64.rpm"
RPM_HASH = "08a0a54fb0c604943eee175f170b9dbcec48c814419a100a68e4348f057ef12e59245c9f3fae872962478b766eca1d0b0d82fd19f06ff7fcf143d9e6dc1e55d6"

RPROVIDES:${PN} += "maildir-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libxapian.so.30"

inherit rpm
