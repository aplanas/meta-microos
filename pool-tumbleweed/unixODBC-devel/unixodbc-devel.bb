SUMMARY = "Includes for ODBC Development"
DESCRIPTION = "Includes for ODBC development (based on unixODBC)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.3.11"

RPM_NAME = "unixODBC-devel-2.3.11-2.4.aarch64.rpm"
RPM_HASH = "2a8fbbb952f796db1780076bcae92c35a9fe9f7622f5de2e4c85a639699d7a990db8ff104449d343ff79c7787aaf5838515358bcd244531815ea9552574c5ad6"

RPROVIDES:${PN} += "pkgconfig-odbc \
pkgconfig-odbccr \
pkgconfig-odbcinst \
unixODBC-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libodbc2 \
pkgconfig-odbc \
unixODBC"

inherit rpm
