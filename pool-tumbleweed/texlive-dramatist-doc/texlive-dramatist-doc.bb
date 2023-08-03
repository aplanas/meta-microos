SUMMARY = "Documentation for texlive-dramatist"
DESCRIPTION = "This package includes the documentation for texlive-dramatist"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.2esvn35866"

RPM_NAME = "texlive-dramatist-doc-2023.209.1.2esvn35866-53.1.noarch.rpm"
RPM_HASH = "1f085e05ac86b4d79a54cf00434aa0cf4fba86bf05e174c684299998005902509b1518c7950b61df05f93834946b99078a999cec62004b5ed434d7e1abcb5682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dramatist-doc"

RDEPENDS:${PN} += ""

inherit rpm
