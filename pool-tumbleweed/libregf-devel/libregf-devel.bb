SUMMARY = "Development files for libregf, a Windows REGF-type Registry file parser"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libregf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libregf-devel-20230319-2.1.aarch64.rpm"
RPM_HASH = "293168f7536af5228f3008821430c994ac32085d54387f803a5d627ef4d2b00f637b2902e540f4e1f360661d68054bceba21f391a36dc426f3a0661666332721"

RPROVIDES:${PN} += "libregf-devel \
pkgconfig-libregf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libregf1"

inherit rpm
