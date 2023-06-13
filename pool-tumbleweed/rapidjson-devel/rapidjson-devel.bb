SUMMARY = "Header files for rapidjson, a JSON parser and generator for C++"
DESCRIPTION = "RapidJSON is a header-only JSON parser and generator for C++. \
This package contains development headers and examples."
LICENSE = "MIT"

PV = "1.1.0+git20211015.4d6cb081"

RPM_NAME = "rapidjson-devel-1.1.0+git20211015.4d6cb081-1.5.aarch64.rpm"
RPM_HASH = "05ba2bb45879ca48e17d6b77dbec4d4f183e08edff0c6cd6d820492b876542b65095b6fe911be69a3a9ffdbe8ae90c7ab1791e7b81c55353f8af2de68cc66bf2"

RPROVIDES:${PN} += "cmake(RapidJSON) \
pkgconfig(RapidJSON) \
rapidjson \
rapidjson-devel \
rapidjson-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
