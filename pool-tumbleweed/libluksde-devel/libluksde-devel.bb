SUMMARY = "Development files for libluksde"
DESCRIPTION = "libluksde is a library to access the New Technology File System (NTFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libluksde."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "libluksde-devel-20221103-3.11.aarch64.rpm"
RPM_HASH = "c0a3447531e62040cc1fdad1a76636b6d5c09360a002e8dd193b3f198b429ea8c97432a9af2bc073209ca6ef0e090575ffd92ce9bbc67b29dd781969f5a6494a"

RPROVIDES:${PN} += "libluksde-devel \
pkgconfig-libluksde"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libluksde1"

inherit rpm
