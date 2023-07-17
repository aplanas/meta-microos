SUMMARY = "Development files for libnsfdb"
DESCRIPTION = "libnsfdb is a library to access the Notes Storage Facility (NSF) \
database file format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnsfdb."
LICENSE = "LGPL-3.0-or-later"

PV = "20210419"

RPM_NAME = "libnsfdb-devel-20210419-3.8.aarch64.rpm"
RPM_HASH = "a2f6eecf1f97bed4a14e6ccfa86d05334f2593d2df02d91e0fe59815e16b4beccc053439a3cff3ce109a589527ea68e7d7b2b93e3716c68f88017ce70f5b2531"

RPROVIDES:${PN} += "libnsfdb-devel \
pkgconfig-libnsfdb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libnsfdb1"

inherit rpm
