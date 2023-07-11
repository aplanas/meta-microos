SUMMARY = "Data files for Avogadro2 and Avogadro2libs"
DESCRIPTION = "This package contains: \
  * Crystallographic files of common materials, elements, oxides, for visualization in Avogadro. \
  * Common molecule fragments for visualization in Avogadro"
LICENSE = "BSD-3-Clause"

PV = "1.97.0"

RPM_NAME = "avogadro2-data-1.97.0-2.4.noarch.rpm"
RPM_HASH = "ff4192db834275c1c0a4ee5157268d1bdf9a1878fc40a1a52362d8c2874423c5245399e004a1bd50d883bc87877cf89b62297bf04ee1ccdcca1f1a99c7a57c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avogadro2-data"

RDEPENDS:${PN} += ""

inherit rpm
