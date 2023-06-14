SUMMARY = "A Boost Make Replacement"
DESCRIPTION = "Boost Jam is a build tool based on FTJam, which in turn is based on \
Perforce Jam. It contains significant improvements made to facilitate \
its use in the Boost Build System."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost1_82_0-jam-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "a50442ff2e68a1dede037a7e41079ef68ccd4611f44c0f0f73d38dcbbdfb48da85e3571d0ae43010de69e7eed24449d01606bd5a2087f17425c247f23e6009e4"

RPROVIDES:${PN} += "boost-1-66-jam \
boost-jam-impl \
boost1-82-0-jam"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
