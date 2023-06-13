SUMMARY = "An Sqlite3 manager"
DESCRIPTION = "Sqliteman is a graphical frontend for querying and editing SQLite3 databases."
LICENSE = "GPL-2.0+ & LGPL-2.0+"

PV = "1.2.2"

RPM_NAME = "sqliteman-1.2.2-3.28.aarch64.rpm"
RPM_HASH = "0fdf6ecf0ff1bf5128ef497460fcd46c97747d7933d8e133d7f90366702bfb9d7b0600e2970da7036f183d61bc9adb594503d57d135430513451216f095e7860"

RPROVIDES:${PN} += "application() \
application(sqliteman.desktop) \
mimehandler(application/x-sqlite3) \
sqliteman \
sqliteman(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Sql.so.5()(64bit) \
libQt5Sql.so.5(Qt_5)(64bit) \
libQt5Sql5-sqlite \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libqscintilla2_qt5.so.15()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
