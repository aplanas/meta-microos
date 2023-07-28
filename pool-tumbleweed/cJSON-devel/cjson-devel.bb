SUMMARY = "Development files for the cJSON library"
DESCRIPTION = "A simple JSON parser library written in ANSI C. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcjson."
LICENSE = "MIT"

PV = "1.7.16"

RPM_NAME = "cJSON-devel-1.7.16-1.1.aarch64.rpm"
RPM_HASH = "2a1d822ccb1890cd71a17f4d5485e6642eb2e26a76257b65b7d9947b5b3a9af6a5e95a4e6602295336aab514d175435fde5134a7ba11d2a51040cc148a934fb1"

RPROVIDES:${PN} += "cJSON-devel \
cmake-cJSON \
pkgconfig-libcjson"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcjson1"

inherit rpm
