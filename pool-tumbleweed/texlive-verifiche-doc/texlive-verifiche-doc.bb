SUMMARY = "Documentation for texlive-verifiche"
DESCRIPTION = "This package includes the documentation for texlive-verifiche"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.0svn64425"

RPM_NAME = "texlive-verifiche-doc-2023.201.6.0svn64425-53.1.noarch.rpm"
RPM_HASH = "affcc5cd463327a4b659c3e995ead7bf71a6e396245523ff3e2b0b4e4e40b0370b6d1658217adbc1b11b451627257c2723e1e17f62aa329acfe71c5827afed18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-verifiche-doc:it) \
texlive-verifiche-doc"

RDEPENDS:${PN} += ""

inherit rpm
