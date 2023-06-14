SUMMARY = "Development headers for Boost.Random library"
DESCRIPTION = "This package contains Boost.Random development headers."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_random1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "7e8ec7f94dd410af3f47f44c1f470ba20a51e0ef9eeb095e8d3c291d2a733909f82dccf693a5e1ff9c8cebc3bcdf9c75d9365f6568abbeb5dd8529d8d1b4649e"

RPROVIDES:${PN} += "libboost-random-devel-impl \
libboost-random1-82-0-devel"

RDEPENDS:${PN} += "libboost-headers1-82-0-devel \
libboost-random1-82-0 \
libboost-system1-82-0-devel"

inherit rpm
