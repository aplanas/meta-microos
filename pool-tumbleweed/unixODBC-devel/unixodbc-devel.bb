SUMMARY = "Includes for ODBC Development"
DESCRIPTION = "Includes for ODBC development (based on unixODBC)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.12"

RPM_NAME = "unixODBC-devel-2.3.12-1.1.aarch64.rpm"
RPM_HASH = "b71916fdeedf235f153811a7ff4a6c54b4dde327b489c30112d71ffc5098b0977c9a5eb0d7cd91c01ccc307b5e36dd700f0205ed40c93d9df82b55bc58e98506"

RPROVIDES:${PN} += "pkgconfig-odbc \
pkgconfig-odbccr \
pkgconfig-odbcinst \
unixODBC-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libodbc2 \
pkgconfig-odbc \
unixODBC"

inherit rpm
