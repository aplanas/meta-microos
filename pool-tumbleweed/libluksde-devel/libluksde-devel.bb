SUMMARY = "Development files for libluksde"
DESCRIPTION = "libluksde is a library to access the New Technology File System (NTFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libluksde."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "libluksde-devel-20221103-4.1.aarch64.rpm"
RPM_HASH = "d0c89c6ba5efe1909b8858dd17777768ebf55af92037ffc7e66f172a5fd8d3c269f81528754ae11437ece75dc884528855bc04dfb533d5f5bb0093d4f1c0d679"

RPROVIDES:${PN} += "libluksde-devel \
pkgconfig-libluksde"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libluksde1"

inherit rpm
