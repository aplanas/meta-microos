SUMMARY = "Development files for libesedb, a EDB file format library"
DESCRIPTION = "libesedb is a library to access EDB files.  ESEDB is used in many different \
applications like Windows Search, Windows Mail, Exchange, Active Directory, etc. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libesedb."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "libesedb-devel-20230318-1.6.aarch64.rpm"
RPM_HASH = "cfc505047b71ac4905168c23242d5687469de9af670583d78679401cb0f221168bc93a2165c7ca2669d0ddba2c907417df4b600dd77eef00a84bd0b4f00d6f02"

RPROVIDES:${PN} += "libesedb-devel \
pkgconfig-libesedb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libesedb1"

inherit rpm
