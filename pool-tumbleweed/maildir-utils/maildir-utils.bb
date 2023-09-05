SUMMARY = "Maildir indexer and searcher"
DESCRIPTION = "Set of utilities to index and search Maildirs. Upstream name is mu."
LICENSE = "GPL-3.0-or-later"

PV = "1.10.7"

RPM_NAME = "maildir-utils-1.10.7-1.1.aarch64.rpm"
RPM_HASH = "ee76cc49a81822898b4fc251404ead93fbfaa70a9bcce56cffa3cf03ec0d31cdf290ebb80f0f072348bc8053d6b943977dae32ed931c8bd1f3e33fd01d1aa607"

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
