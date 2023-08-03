SUMMARY = "Documentation for texlive-probsoln"
DESCRIPTION = "This package includes the documentation for texlive-probsoln"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.05svn44783"

RPM_NAME = "texlive-probsoln-doc-2023.209.3.05svn44783-53.1.noarch.rpm"
RPM_HASH = "74a6d433978fc276ad1cb985e24865572644060d3eb2bc259f7419bba9bdec3a1b606cda07eb4c96d4fd997dc925cf7aa72c97cfa9b3137ceb527ba011c8cf2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-probsoln-doc"

RDEPENDS:${PN} += ""

inherit rpm
