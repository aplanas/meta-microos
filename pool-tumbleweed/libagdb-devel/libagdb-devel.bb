SUMMARY = "Development files for libagdb"
DESCRIPTION = "libagdb is a library to access the SuperFetch database format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libagdb."
LICENSE = "LGPL-3.0-or-later"

PV = "20210429"

RPM_NAME = "libagdb-devel-20210429-3.8.aarch64.rpm"
RPM_HASH = "5135ed2b068c149caba97be3e5227084ec7e0b57e375e8814713643ba8c515bca4ecf3c14d69df68262dbb73c7c2716109e07ec6bef65dd1a5ef539b887fca37"

RPROVIDES:${PN} += "libagdb-devel \
pkgconfig-libagdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libagdb1 \
libbfio-devel"

inherit rpm
