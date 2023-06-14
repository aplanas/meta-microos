SUMMARY = "Development headers for Boost"
DESCRIPTION = "A collection of header-only libraries for Boost."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_headers1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "7a238e2be8adddfafdd2f5df39277a21f0056ee2795196b445d94daf7c57e26614b31e3eda05d6f53e3333e55f9436c54c28ca9494034f5b7befc4db96dc8a0c"

RPROVIDES:${PN} += "libboost-headers-devel-impl \
libboost-headers1-82-0-devel"

RDEPENDS:${PN} += "boost-license1-82-0 \
libstdc++-devel"

inherit rpm
