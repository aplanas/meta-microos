SUMMARY = "Data files for Avogadro2 and Avogadro2libs"
DESCRIPTION = "This package contains: \
  * Crystallographic files of common materials, elements, oxides, for visualization in Avogadro. \
  * Common molecule fragments for visualization in Avogadro"
LICENSE = "BSD-3-Clause"

PV = "1.97.0"

RPM_NAME = "avogadro2-data-1.97.0-2.3.noarch.rpm"
RPM_HASH = "fc15755267c5c3d69a2ace6c3ca0014dc3d645d2e490141f67051591dc5a26792749a3ff284b6ec0a5c402f13076a400abce9f9076633f57205bdbf229bacf4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avogadro2-data"

RDEPENDS:${PN} += ""

inherit rpm
