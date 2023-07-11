SUMMARY = "Development files for libesedb, a EDB file format library"
DESCRIPTION = "libesedb is a library to access EDB files.  ESEDB is used in many different \
applications like Windows Search, Windows Mail, Exchange, Active Directory, etc. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libesedb."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230318"

RPM_NAME = "libesedb-devel-20230318-1.5.aarch64.rpm"
RPM_HASH = "20be398ed5d19c5d3e97e54490cb84937485a8eaebae1cd6d47bfee0061a5a0e542daa967dca5551b9ca10617dd26966133d78ccbf9368e3aa7f6cf7cb57f4aa"

RPROVIDES:${PN} += "libesedb-devel \
pkgconfig-libesedb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libesedb1"

inherit rpm
