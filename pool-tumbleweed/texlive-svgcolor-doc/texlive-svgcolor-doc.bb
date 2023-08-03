SUMMARY = "Documentation for texlive-svgcolor"
DESCRIPTION = "This package includes the documentation for texlive-svgcolor"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-svgcolor-doc-2023.209.1.0svn15878-58.1.noarch.rpm"
RPM_HASH = "762eafe66a06b3de361af5b48622a54710f024df279daa0eb4b2de24eb5a47f3b95eeba8317609ea44d4762839a00ac4681d909983f6e7cffe7f7d416c8284a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svgcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
