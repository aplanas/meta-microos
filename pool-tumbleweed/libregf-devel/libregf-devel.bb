SUMMARY = "Development files for libregf, a Windows REGF-type Registry file parser"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libregf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libregf-devel-20230319-1.2.aarch64.rpm"
RPM_HASH = "e598d258f2755571aaa891282962afc59e35d57fd422fe1a1b637eadb045f1194a6f22c1c9c8bdc1f48c0c552c84d959c2d4ea9436c44b60917dbfb163b81e27"

RPROVIDES:${PN} += "libregf-devel \
pkgconfig-libregf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libregf1"

inherit rpm
