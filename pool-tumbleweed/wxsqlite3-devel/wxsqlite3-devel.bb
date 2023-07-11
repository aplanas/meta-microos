SUMMARY = "C++ wrapper around SQLite 3.x - Development Files"
DESCRIPTION = "wxSQLite3 is a C++ wrapper around the public domain SQLite 3.x database \
and is specifically designed for use in programs based on the wxWidgets \
library."
LICENSE = "SUSE-wxWidgets-3.1"

PV = "4.9.1"

RPM_NAME = "wxsqlite3-devel-4.9.1-1.5.aarch64.rpm"
RPM_HASH = "9b915407de11e9ddfc4e4468211d7973236246e6eb43345e77037e7962a0cb3e237e91f9d1a31087e3e8411507eb15399d89be37b21961c43c671571509f4d35"

RPROVIDES:${PN} += "pkgconfig-wxsqlite3 \
wxsqlite3-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwxcode-gtk2u-wxsqlite3-3-2-0"

inherit rpm
