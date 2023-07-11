SUMMARY = "Development Files and Libraries for the Berkeley DB library Version 4.8"
DESCRIPTION = "The Berkeley DB Database is a programmatic toolkit that provides \
database support for applications. \
 \
This package contains the header files and libraries."
LICENSE = "BSD-3-Clause & Sleepycat"

PV = "4.8.30"

RPM_NAME = "libdb-4_8-devel-4.8.30-42.1.aarch64.rpm"
RPM_HASH = "0e09faf4d1324858dba8090ec7708267ad9554bec8ffc12a0a8f11f47e64c0e6771af40f79c60e895468d59c0b7c7f40217c2a4edf40716113532a029838bb08"

RPROVIDES:${PN} += "db-devel \
libdb-4-8-devel"

RDEPENDS:${PN} += "glibc-devel \
libdb-4-8"

inherit rpm
