SUMMARY = "Command Line tools for Managing Berkeley DB Databases"
DESCRIPTION = "The Berkeley DB Database is a programmatic toolkit that provides \
database support for applications. \
 \
This package contains the command line tools for managing Berkeley DB \
databases."
LICENSE = "BSD-3-Clause & Sleepycat"

PV = "4.8.30"

RPM_NAME = "db48-utils-4.8.30-42.1.aarch64.rpm"
RPM_HASH = "4a02d79103079e1e34e5d3f9736213e0a75a6911bb695f7182297f08d94c843acfdecacf4b75aef97b7359c3bc1808270a6496c5ed89b5a17fbdbf37774ef835"

RPROVIDES:${PN} += "db-utils \
db48-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
update-alternatives"

inherit rpm
