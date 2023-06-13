SUMMARY = "Development files for libesedb, a EDB file format library"
DESCRIPTION = "libesedb is a library to access EDB files.  ESEDB is used in many different \
applications like Windows Search, Windows Mail, Exchange, Active Directory, etc. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libesedb."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "libesedb-devel-20230318-1.2.aarch64.rpm"
RPM_HASH = "4526f0f256c99ed18455298c9313db672b90a20a981a9a3271fc6a123abcbaf55f0b7e7697242441d2a0fbfc1617148b48ece67eeab881d2c1de87c3e7a97cd9"

RPROVIDES:${PN} += "libesedb-devel \
libesedb-devel(aarch-64) \
pkgconfig(libesedb)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libesedb1"

inherit rpm
