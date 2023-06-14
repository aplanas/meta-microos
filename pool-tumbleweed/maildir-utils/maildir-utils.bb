SUMMARY = "Maildir indexer and searcher"
DESCRIPTION = "Set of utilities to index and search Maildirs. Upstream name is mu."
LICENSE = "GPL-3.0-or-later"

PV = "1.10.3"

RPM_NAME = "maildir-utils-1.10.3-1.1.aarch64.rpm"
RPM_HASH = "596925d48c7bc1fa45a5a68555a3fdaa8526f62e8084b2d374d57ca5ad71bf0f6a2b3419696764bdf370f94cffe3f08154f4dfd2e7bfdf1de0630823af46fd29"

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
