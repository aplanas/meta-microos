SUMMARY = "JSON for Modern C++"
DESCRIPTION = "Development files for a header-only library \
to make JSON a first-class datatype for C++11"
LICENSE = "MIT"

PV = "3.11.2"

RPM_NAME = "nlohmann_json-devel-3.11.2-1.3.aarch64.rpm"
RPM_HASH = "755ef9e02d2cb4a8a804ff626abf5b7fe3c1d7492cb606d47b1a06be9ff5a14a24bb9ddd45ff1b065bf6fe4d8d5ed80b0366ee93ade48c47c01de5465c9219be"

RPROVIDES:${PN} += "cmake(nlohmann_json) \
nlohmann_json-devel \
nlohmann_json-devel(aarch-64) \
pkgconfig(nlohmann_json)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstdc++-devel"

inherit rpm
