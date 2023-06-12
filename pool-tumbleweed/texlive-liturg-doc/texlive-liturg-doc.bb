SUMMARY = "Documentation for texlive-liturg"
DESCRIPTION = "This package includes the documentation for texlive-liturg"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-liturg-doc-2023.201.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "175c24c5362a3fd1a13d4a49ec14aef2d27dff58aa7f58dc6a86ac1afc24588d1aa73c5df11b5bbbe248bc9e6811b23783c61baf80f23385e74b6d6456698fb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-liturg-doc"
RDEPENDS:${PN} += ""

inherit rpm
