SUMMARY = "A Boost Make Replacement"
DESCRIPTION = "Boost Jam is a build tool based on FTJam, which in turn is based on \
Perforce Jam. It contains significant improvements made to facilitate \
its use in the Boost Build System."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost1_82_0-jam-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "a50442ff2e68a1dede037a7e41079ef68ccd4611f44c0f0f73d38dcbbdfb48da85e3571d0ae43010de69e7eed24449d01606bd5a2087f17425c247f23e6009e4"

RPROVIDES:${PN} += "boost-jam-impl \
boost1_82_0-jam \
boost1_82_0-jam(aarch-64) \
boost_1_66-jam"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
