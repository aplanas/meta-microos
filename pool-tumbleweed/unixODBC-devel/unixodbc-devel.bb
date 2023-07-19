SUMMARY = "Includes for ODBC Development"
DESCRIPTION = "Includes for ODBC development (based on unixODBC)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.11"

RPM_NAME = "unixODBC-devel-2.3.11-3.1.aarch64.rpm"
RPM_HASH = "cc57adfded5984abd0453bd839c2d38902d52487ec5b7f717abf195dc59fbf61abce8b0b405f865bb2ddbc6cd42d0a5cb162e2c7dd2d5a55e3dd45388c4def42"

RPROVIDES:${PN} += "pkgconfig-odbc \
pkgconfig-odbccr \
pkgconfig-odbcinst \
unixODBC-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libodbc2 \
pkgconfig-odbc \
unixODBC"

inherit rpm
