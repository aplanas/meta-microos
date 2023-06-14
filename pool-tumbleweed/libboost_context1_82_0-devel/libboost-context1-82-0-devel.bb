SUMMARY = "Development headers for Boost.Context"
DESCRIPTION = "Development headers and libraries for Boost.Context, a library that \
providing cooperative multitasking support."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_context1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "c05f74e12f8121265744224edd738da1fda5886c62a2650817d6bc74c2eb5c387e566a01f99c9f7d4b66967b5e0cc76c8a56a1b0af1c163dbda7c45ae3bfafde"

RPROVIDES:${PN} += "libboost-context-devel-impl \
libboost-context1-82-0-devel"

RDEPENDS:${PN} += "libboost-context1-82-0 \
libboost-headers1-82-0-devel \
libstdc++-devel"

inherit rpm
