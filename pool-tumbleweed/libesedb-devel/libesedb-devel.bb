SUMMARY = "Development files for libesedb, a EDB file format library"
DESCRIPTION = "libesedb is a library to access EDB files.  ESEDB is used in many different \
applications like Windows Search, Windows Mail, Exchange, Active Directory, etc. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libesedb."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "libesedb-devel-20230318-2.1.aarch64.rpm"
RPM_HASH = "1277d7906ea4ba2b91ece8019ba6dc59a9762e13ae7f871589d4275bc975c6474901c632d94eec549dd995d7ffa6abc2ce07c2e2a4130b6ad057e3a377cb6000"

RPROVIDES:${PN} += "libesedb-devel \
pkgconfig-libesedb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libesedb1"

inherit rpm
