SUMMARY = "Documentation for texlive-graphics-cfg"
DESCRIPTION = "This package includes the documentation for texlive-graphics-cfg"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn41448"

RPM_NAME = "texlive-graphics-cfg-doc-2023.209.svn41448-54.2.noarch.rpm"
RPM_HASH = "6c1587ead8ec74559e52740a476f3738a135e40c14732e9787429e04a97119b2a17fab6808ba6c5fa1020f3c455b132721fa54b2738cd2db75fb925fbc523174"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-cfg-doc"

RDEPENDS:${PN} += ""

inherit rpm
