SUMMARY = "Development files for libnsfdb"
DESCRIPTION = "libnsfdb is a library to access the Notes Storage Facility (NSF) \
database file format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnsfdb."
LICENSE = "LGPL-3.0-or-later"

PV = "20210419"

RPM_NAME = "libnsfdb-devel-20210419-3.7.aarch64.rpm"
RPM_HASH = "a5e45665fa4b31c959830dec2293a752d5c662ea8b05234768d0dea88762996fc9a5124c22a6482d5d7ff58dbe2cd71cf4be4f581797f9391e9affd293ac427a"

RPROVIDES:${PN} += "libnsfdb-devel \
pkgconfig-libnsfdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libnsfdb1"

inherit rpm
