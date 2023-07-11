SUMMARY = "An Sqlite3 manager"
DESCRIPTION = "Sqliteman is a graphical frontend for querying and editing SQLite3 databases."
LICENSE = "GPL-2.0+ & LGPL-2.0+"

PV = "1.2.2"

RPM_NAME = "sqliteman-1.2.2-3.29.aarch64.rpm"
RPM_HASH = "5f95cd3946b2663631c1f85d0c4f1cbd30630a0a49fa8f84cb85b6708de4a5ed059f29b66046e99a25bae3a6c5f7e0e06cf08516362f9036a0413dce6d8b078a"

RPROVIDES:${PN} += "sqliteman"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libqscintilla2-qt5.so.15 \
libstdc++.so.6"

inherit rpm
