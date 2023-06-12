SUMMARY = "Developer documentation for sdbus-cpp"
DESCRIPTION = "READMEs and generated doxygen documentation for sdbus-cpp"
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "sdbus-cpp-devel-doc-1.2.0-1.5.noarch.rpm"
RPM_HASH = "4964cedad7bab873f78f64f29a40ee36a809c8d21ce0b77884ba122ce6b3983bbfc938115b49926b9a321bc1e28d25d753f8a218928e611efda9aea8aa16d67c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdbus-cpp-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
