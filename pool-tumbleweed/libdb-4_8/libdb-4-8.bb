SUMMARY = "Berkeley DB Database Library Version 4.8"
DESCRIPTION = "The Berkeley DB Database is a programmatic toolkit that provides \
database support for applications. \
 \
This package contains the necessary runtime libraries."
LICENSE = "Sleepycat"

PV = "4.8.30"

RPM_NAME = "libdb-4_8-4.8.30-41.1.aarch64.rpm"
RPM_HASH = "684b933cac9dca0c1ffd5c2845653835071e9818ebbe9334ab6515a992ba25cceb6e76e29a7cdfc411ca1e4701233d2ac4935696d3d9d607f688a29dffe1a3b6"

RPROVIDES:${PN} += "db \
libdb-4-8 \
libdb-4.8.so \
libdb-cxx-4.8.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
