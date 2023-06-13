SUMMARY = "Documentation for texlive-smartunits"
DESCRIPTION = "This package includes the documentation for texlive-smartunits"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn39592"

RPM_NAME = "texlive-smartunits-doc-2023.201.1.2svn39592-57.1.noarch.rpm"
RPM_HASH = "cf5d3111995678b567425b248f98c861d728cd397f6229b1fb035263564df7c22ce49fdce40384bada15a022b1a4c3c9d284f36431c0644680cd3ec0ba8fdac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-smartunits-doc"

RDEPENDS:${PN} += ""

inherit rpm
