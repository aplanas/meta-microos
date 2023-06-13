SUMMARY = "Maildir indexer and searcher"
DESCRIPTION = "Set of utilities to index and search Maildirs. Upstream name is mu."
LICENSE = "GPL-3.0-or-later"

PV = "1.10.3"

RPM_NAME = "maildir-utils-1.10.3-1.1.aarch64.rpm"
RPM_HASH = "596925d48c7bc1fa45a5a68555a3fdaa8526f62e8084b2d374d57ca5ad71bf0f6a2b3419696764bdf370f94cffe3f08154f4dfd2e7bfdf1de0630823af46fd29"

RPROVIDES:${PN} += "maildir-utils \
maildir-utils(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmime-3.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libreadline.so.8()(64bit) \
libstdc++.so.6()(64bit) \
libxapian.so.30()(64bit)"

inherit rpm
