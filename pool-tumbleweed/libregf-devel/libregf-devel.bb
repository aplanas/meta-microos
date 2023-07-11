SUMMARY = "Development files for libregf, a Windows REGF-type Registry file parser"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libregf."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libregf-devel-20230319-1.5.aarch64.rpm"
RPM_HASH = "33bda32cd816b069cb748461b48e68116588bbfe3c1b14c2b4b0f3b2842077c09f431eeccc69bffc44a34c563c0d226cbbfd0c49fc96e0c0e19b81fc378bf898"

RPROVIDES:${PN} += "libregf-devel \
pkgconfig-libregf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libregf1"

inherit rpm
