SUMMARY = "An Sqlite3 manager"
DESCRIPTION = "Sqliteman is a graphical frontend for querying and editing SQLite3 databases."
LICENSE = "GPL-2.0+ & LGPL-2.0+"

PV = "1.2.2"

RPM_NAME = "sqliteman-1.2.2-3.28.aarch64.rpm"
RPM_HASH = "0fdf6ecf0ff1bf5128ef497460fcd46c97747d7933d8e133d7f90366702bfb9d7b0600e2970da7036f183d61bc9adb594503d57d135430513451216f095e7860"

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
