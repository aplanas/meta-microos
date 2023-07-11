SUMMARY = "Developer documentation for sdbus-cpp"
DESCRIPTION = "READMEs and generated doxygen documentation for sdbus-cpp"
LICENSE = "LGPL-2.1-only"

PV = "1.2.0"

RPM_NAME = "sdbus-cpp-devel-doc-1.2.0-1.6.noarch.rpm"
RPM_HASH = "cd475a97b0e205dfab7514ce66766fcf7b4388f3fc414ca402b8c9849be94c7db7edafc4d96bcfd33f0b50d9a4e9c17464a7a8463845e2bf2f18bb2e256ccc90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdbus-cpp-devel-doc"

RDEPENDS:${PN} += ""

inherit rpm
