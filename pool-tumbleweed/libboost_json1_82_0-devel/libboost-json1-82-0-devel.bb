SUMMARY = "Development headers for Boost.JSON library"
DESCRIPTION = "This package contains development headers for Boost.JSON library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_json1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "06cd6e33614b2b8e3bdf1b425ed6033510a0fe800b2251dae1209fe54bf2b4a70e2d02480a08e40b5af4faeb1fc3b8bc49f56c093bcda1afed83fe2be6aa0030"

RPROVIDES:${PN} += "libboost-json-devel-impl \
libboost-json1-82-0-devel"

RDEPENDS:${PN} += "libboost-container1-82-0-devel \
libboost-json1-82-0"

inherit rpm
