SUMMARY = "Documentation for texlive-mongolian-babel"
DESCRIPTION = "This package includes the documentation for texlive-mongolian-babel"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-mongolian-babel-doc-2023.209.1.2svn15878-55.1.noarch.rpm"
RPM_HASH = "ce1f51839b5c5516a726971be13289c13ffdfb15641850e5b61f72c67ffb745c25730616671895619e6ad078af249f59383041a7fe30a43c07ca9596d57d65fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mongolian-babel-doc"

RDEPENDS:${PN} += ""

inherit rpm
