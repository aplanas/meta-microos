SUMMARY = "Documentation for texlive-suppose"
DESCRIPTION = "This package includes the documentation for texlive-suppose"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.2svn59281"

RPM_NAME = "texlive-suppose-doc-2023.209.1.2.2svn59281-58.1.noarch.rpm"
RPM_HASH = "beb47c493e623324cd3fba65f67972ae3a7faf7d2106d68333132a98f248b3d33d329b5c3b95ed4cb03ce08cd7d60ea3ad918e34cc00cdeee4b4b7ed331bd341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-suppose-doc"

RDEPENDS:${PN} += ""

inherit rpm
