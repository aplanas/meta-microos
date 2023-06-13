SUMMARY = "Development headers for Boost.Serialization library"
DESCRIPTION = "This package contains development headers for Boost.Serialization \
library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_serialization1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "8afab8483b59ff7fe0c1ac5d3cc1cc319d7ba6689f6047df0a36b95ab82ab3628e5dc8ad4810da5092bba4a04e5429c753162d8da140655b4dad64d1fe73d51f"

RPROVIDES:${PN} += "libboost_serialization-devel-impl \
libboost_serialization1_82_0-devel \
libboost_serialization1_82_0-devel(aarch-64)"

RDEPENDS:${PN} += "libboost_headers1_82_0-devel \
libboost_serialization1_82_0"

inherit rpm
