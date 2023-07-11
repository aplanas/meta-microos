SUMMARY = "Berkeley DB Database Library Version 4.8"
DESCRIPTION = "The Berkeley DB Database is a programmatic toolkit that provides \
database support for applications. \
 \
This package contains the necessary runtime libraries."
LICENSE = "BSD-3-Clause & Sleepycat"

PV = "4.8.30"

RPM_NAME = "libdb-4_8-4.8.30-42.1.aarch64.rpm"
RPM_HASH = "8b76ffb0744a9dc50d7495068a73368eef983a98f56324377d1aaf5928f7caa600fc1355036e161259cd2c9431f044fa2caa1522482b85e3795c1e9fdeac3fa4"

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
