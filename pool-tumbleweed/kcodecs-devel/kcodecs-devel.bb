SUMMARY = "Header files for kcodecs, a method collection for string manipulation"
DESCRIPTION = "Development files for KCodecs, a method collection to manipulate \
strings using various encodings."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kcodecs-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "508aa22347ecfcccb1b3594756615f947dbdddc970472f819552ad953215989872198899d943a9d9f5460c2830ae71a94379871ea091305cc2d4e76d615f2427"

RPROVIDES:${PN} += "cmake-KF5Codecs \
kcodecs-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
extra-cmake-modules \
libKF5Codecs5"

inherit rpm
