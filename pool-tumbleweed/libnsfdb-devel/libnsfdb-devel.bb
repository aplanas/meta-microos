SUMMARY = "Development files for libnsfdb"
DESCRIPTION = "libnsfdb is a library to access the Notes Storage Facility (NSF) \
database file format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnsfdb."
LICENSE = "LGPL-3.0-or-later"

PV = "20210419"

RPM_NAME = "libnsfdb-devel-20210419-3.5.aarch64.rpm"
RPM_HASH = "39acc0917c85c7342dd7c8386fab43d48c7f90595b3e628510caf727b1200afd949e14143d2db56e79d0f3235ed79b93bbc46f4882ddf1180f23131d45ead241"

RPROVIDES:${PN} += "libnsfdb-devel \
libnsfdb-devel(aarch-64) \
pkgconfig(libnsfdb)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libnsfdb1"

inherit rpm
