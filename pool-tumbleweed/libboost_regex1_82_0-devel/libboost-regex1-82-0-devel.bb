SUMMARY = "Development headers for Boost.Regex library"
DESCRIPTION = "This package contains development headers for Boost.Regex library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_regex1_82_0-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "b268574160201b78dd534ed89488acbca88641d84126e501f766b832fc362486328ebe9fce835550ab94005afd42358d65e7da8061a2decf4417f84cba81ca85"

RPROVIDES:${PN} += "libboost-regex-devel-impl \
libboost-regex1-82-0-devel"

RDEPENDS:${PN} += "libboost-headers1-82-0-devel \
libboost-regex1-82-0 \
libicu-devel"

inherit rpm
