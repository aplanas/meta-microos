SUMMARY = "Maildir indexer and searcher"
DESCRIPTION = "Set of utilities to index and search Maildirs. Upstream name is mu."
LICENSE = "GPL-3.0-or-later"

PV = "1.10.5"

RPM_NAME = "maildir-utils-1.10.5-1.1.aarch64.rpm"
RPM_HASH = "eafe5bc400818f683280ad5206112a18e7daf2cd37cb4b2bc23af7059644a4e18df6d3e9ea1da5eaaaa51ccbf513172d508538db3b6e1f7ee44fd2019af3c2d2"

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
