SUMMARY = "The python pandas[xml] extra"
DESCRIPTION = "This package provides the [xml] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-xml-2.0.3-1.2.noarch.rpm"
RPM_HASH = "fdefd07997582be33cc9b27a97d2198d95fe10fd319f6109d84db9e0f60c1c13c2751f5894c6e0b4be1b57bfd2d0395525779bb16fdaf99d00e4eedcdc0b3228"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-xml"

RDEPENDS:${PN} += "python310-lxml \
python310-pandas"

inherit rpm
