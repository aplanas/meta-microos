SUMMARY = "Development files for libluksde"
DESCRIPTION = "libluksde is a library to access the New Technology File System (NTFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libluksde."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "libluksde-devel-20221103-3.12.aarch64.rpm"
RPM_HASH = "306f5ef5060129832cd61abf63c3e5487425fa6259f1666122dfe3bf0070474f1b1110d224a43c85cec3805264812da71f6a34205c150ebb5b2e5c86cda6e1bf"

RPROVIDES:${PN} += "libluksde-devel \
pkgconfig-libluksde"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libluksde1"

inherit rpm
