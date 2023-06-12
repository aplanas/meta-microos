SUMMARY = "Documentation for texlive-bashful"
DESCRIPTION = "This package includes the documentation for texlive-bashful"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.93svn25597"

RPM_NAME = "texlive-bashful-doc-2023.201.0.0.93svn25597-53.1.noarch.rpm"
RPM_HASH = "bc3ebcebf0673c71036b6985a34d5d1604e003db9490eeb55e3a8a1c277f053b48798cd48c8a618ddca48ebaf7087c60fddf9de331484a5cf1952219cb25e268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bashful-doc"
RDEPENDS:${PN} += ""

inherit rpm
