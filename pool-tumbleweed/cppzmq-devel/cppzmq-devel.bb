SUMMARY = "Header-only C++ binding for libzmq"
DESCRIPTION = "cppzmq is a header-only C++ binding for libzmq."
LICENSE = "MIT"

PV = "4.8.1"

RPM_NAME = "cppzmq-devel-4.8.1-1.6.aarch64.rpm"
RPM_HASH = "5f72b3f7829775181e9942536a1157ca341372e3a3decd838a55b6392f4562d8e926668208aa0801115f93f283f08b40f917d51119a02b9bbe92dd36698553d9"

RPROVIDES:${PN} += "cmake-cppzmq \
cppzmq-devel"

RDEPENDS:${PN} += "pkgconfig-libzmq"

inherit rpm
