SUMMARY = "Milter unit test utility"
DESCRIPTION = "Simulates the MTA side of an MTA-milter interaction for testing a milter-aware \
filter application.  It takes as input a script using the Lua language, \
and by exporting some utility functions, makes it possible for users to \
write scripts that exercise a filter."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "miltertest-1.6.0-7.16.aarch64.rpm"
RPM_HASH = "d9dfd487031e232115491a97f6df4fcaa4bdd75a1c8d42615788dc2f8f5d48049ce5ffc02b85e6d0c29a3e3616adbc66ae83e8e341a525a7f195dc826d6cad42"

RPROVIDES:${PN} += "miltertest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
liblua5.1.so.5"

inherit rpm
