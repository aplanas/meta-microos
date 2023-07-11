SUMMARY = "Documentation for texlive-hvextern"
DESCRIPTION = "This package includes the documentation for texlive-hvextern"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.33svn65670"

RPM_NAME = "texlive-hvextern-doc-2023.208.0.0.33svn65670-53.1.noarch.rpm"
RPM_HASH = "5b481311add98a069ec46fd2f713d102dad4491932cddaec6d57c104be899cc8ea6727221a8bb1f0aa641f99748324f336f6c4cf6ac0838e43bc9c383cb0f915"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvextern-doc"

RDEPENDS:${PN} += ""

inherit rpm
