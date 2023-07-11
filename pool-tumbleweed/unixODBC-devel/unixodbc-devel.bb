SUMMARY = "Includes for ODBC Development"
DESCRIPTION = "Includes for ODBC development (based on unixODBC)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.11"

RPM_NAME = "unixODBC-devel-2.3.11-2.5.aarch64.rpm"
RPM_HASH = "0e06e54ea903b0d9422e924027636be05445adb865feea614b2423575db1a07a2548ea9e130848939bdeca6e2a8b5472f41bf49bee564c6bedb3f72f573832a6"

RPROVIDES:${PN} += "pkgconfig-odbc \
pkgconfig-odbccr \
pkgconfig-odbcinst \
unixODBC-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libodbc2 \
pkgconfig-odbc \
unixODBC"

inherit rpm
