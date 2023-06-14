SUMMARY = "Development files for the MariaDB Connector C API"
DESCRIPTION = "MariaDB Connector is used to connect applications developed in \
C or C++ to MariaDB and MySQL databases. \
 \
This package holds the development files."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.5"

RPM_NAME = "libmariadb-devel-3.3.5-1.1.aarch64.rpm"
RPM_HASH = "b4fd6388781f0c68a0c43cbdf4c6c16578fc375e16a3fb5be05d6cee29b7d1c83eee2b1043d4d274ee05575ef3640e9d35be1e23cbbba51c550ecc4326a1dee1"

RPROVIDES:${PN} += "libmariadb-devel \
libmysqlclient-devel \
mysql-devel \
pkgconfig-libmariadb \
pkgconfig-mysqlclient"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmariadb3 \
pkgconfig-openssl \
pkgconfig-zlib"

inherit rpm
