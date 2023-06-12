SUMMARY = "Development Files and Libraries for the Berkeley DB library Version 4.8"
DESCRIPTION = "The Berkeley DB Database is a programmatic toolkit that provides \
database support for applications. \
 \
This package contains the header files and libraries."
LICENSE = "Sleepycat"

PV = "4.8.30"

RPM_NAME = "libdb-4_8-devel-4.8.30-41.1.aarch64.rpm"
RPM_HASH = "8ba65703597817a654c5147b935fbd050cf578f6b912b81997f703c9f046297b119bf63fc2565b3e719f895e49d3d7e139fc761881e9e7f723e1acd1c021a972"

RPROVIDES:${PN} += "db-devel \
libdb-4_8-devel \
libdb-4_8-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel \
libdb-4_8"

inherit rpm
