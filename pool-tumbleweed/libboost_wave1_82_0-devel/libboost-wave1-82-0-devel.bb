SUMMARY = "Development headers for Boost.Wave library"
DESCRIPTION = "This package contains development headers for Boost.Wave library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_wave1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "48d1cf6dd0bbcf6695a044f0ed47155d45daf84cf576748e17ed705fa29474b7c699ee316e5d620416cf20d57fefc8f59cb5455bbb53266c9de3aca7e4f0f0ba"

RPROVIDES:${PN} += "libboost-wave-devel-impl \
libboost-wave1-82-0-devel"

RDEPENDS:${PN} += "libboost-chrono1-82-0-devel \
libboost-date-time1-82-0-devel \
libboost-filesystem1-82-0-devel \
libboost-headers1-82-0-devel \
libboost-serialization1-82-0-devel \
libboost-thread1-82-0-devel \
libboost-wave1-82-0"

inherit rpm
