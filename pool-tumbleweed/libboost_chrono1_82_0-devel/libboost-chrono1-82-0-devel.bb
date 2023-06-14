SUMMARY = "Development headers for Boost.Chrono library"
DESCRIPTION = "This package contains Boost.Chrono development headers."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_chrono1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "d6dff1ea4b8f1d78a1f62b581b1bb8e2632e9380ef175ff40e331f1dec9f10e83bff5beb5ca315590d138aeda42dd9788e67fedfc345b9203400eb80a1a4487f"

RPROVIDES:${PN} += "libboost-chrono-devel-impl \
libboost-chrono1-82-0-devel"

RDEPENDS:${PN} += "libboost-chrono1-82-0 \
libboost-headers1-82-0-devel"

inherit rpm
