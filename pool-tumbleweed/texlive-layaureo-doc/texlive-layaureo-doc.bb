SUMMARY = "Documentation for texlive-layaureo"
DESCRIPTION = "This package includes the documentation for texlive-layaureo"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn19087"

RPM_NAME = "texlive-layaureo-doc-2023.201.0.0.2svn19087-54.1.noarch.rpm"
RPM_HASH = "1198e37195c2a0d5ade376cca29fbe14f48e13bb9a4d4ded5d60250e349d8317422b7194fa98c46101c0e08ed295e14866cfb0fa8a4b4fcefdba036f4669cdd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-layaureo-doc:it) \
texlive-layaureo-doc"
RDEPENDS:${PN} += ""

inherit rpm
