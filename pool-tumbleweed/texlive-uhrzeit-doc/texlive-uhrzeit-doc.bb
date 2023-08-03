SUMMARY = "Documentation for texlive-uhrzeit"
DESCRIPTION = "This package includes the documentation for texlive-uhrzeit"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2csvn39570"

RPM_NAME = "texlive-uhrzeit-doc-2023.209.0.0.2csvn39570-54.1.noarch.rpm"
RPM_HASH = "55695ca8b4897de05f81ee6f7b78cf09dfc62a39f02b9f7b8805374c60390fef994999fbf997df5318f873cd325ec272358887a31a674410faec2372efba07dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uhrzeit-doc"

RDEPENDS:${PN} += ""

inherit rpm
