SUMMARY = "Run time data for hwloc"
DESCRIPTION = "This package contains the run time data for the hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.1"

RPM_NAME = "hwloc-data-2.9.1-1.1.noarch.rpm"
RPM_HASH = "1545d6e6df19de531b9bec15d95e99a02db19c690eb6f8a663b4075e509067974a73c069c1ba1c1b7d03b522928944ce783c739a041696626c56e7b07c90d60e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hwloc-data"

RDEPENDS:${PN} += ""

inherit rpm
