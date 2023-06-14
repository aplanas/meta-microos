SUMMARY = "Development headers and libraries for libfastjson"
DESCRIPTION = "A JSON parsing library, a fork of json-c, developed by the rsyslog team \
and used for rsyslog and liblognorm. \
 \
This package includes header files and scripts needed for developers \
using the libfastjson library"
LICENSE = "MIT"

PV = "1.2304.0"

RPM_NAME = "libfastjson-devel-1.2304.0-1.1.aarch64.rpm"
RPM_HASH = "d1836abe18a7ed3e528e7de7be8d5cc2c60b4c999b14eefc3f5b81ec600685ed18deef1349445d21b31a292037c383bc77c0c730b87128f8dcf95b226abb518c"

RPROVIDES:${PN} += "libfastjson-devel \
pkgconfig-libfastjson"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfastjson4"

inherit rpm
