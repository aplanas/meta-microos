SUMMARY = "Command Line tools for Managing Berkeley DB Databases"
DESCRIPTION = "The Berkeley DB Database is a programmatic toolkit that provides \
database support for applications. \
 \
This package contains the command line tools for managing Berkeley DB \
databases."
LICENSE = "Sleepycat"

PV = "4.8.30"

RPM_NAME = "db48-utils-4.8.30-41.1.aarch64.rpm"
RPM_HASH = "077509e05e0c7af1545b66ec98fc4cb8c454cfe203da15583509a8e601ea79e134fed70ea822bedacc7bf79746ed5664b4d8720778859765cf082fcf768f74ba"

RPROVIDES:${PN} += "db-utils \
db48-utils \
db48-utils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdb-4.8.so()(64bit) \
update-alternatives"

inherit rpm
