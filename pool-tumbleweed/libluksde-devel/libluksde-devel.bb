SUMMARY = "Development files for libluksde"
DESCRIPTION = "libluksde is a library to access the New Technology File System (NTFS). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libluksde."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "libluksde-devel-20221103-3.9.aarch64.rpm"
RPM_HASH = "61fb2d69c39e9ad7d9392a46056ae3c9200319ac8fcb3c6c958e3d8d1a02d213001c28e433f70ac810bc15d896108ff01a335e1a1a2e8aa9d0cc201bdecc0fa2"

RPROVIDES:${PN} += "libluksde-devel \
libluksde-devel(aarch-64) \
pkgconfig(libluksde)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libluksde1"

inherit rpm
