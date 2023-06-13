SUMMARY = "Documentation for texlive-modernposter"
DESCRIPTION = "This package includes the documentation for texlive-modernposter"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03.1svn47269"

RPM_NAME = "texlive-modernposter-doc-2023.201.1.03.1svn47269-54.1.noarch.rpm"
RPM_HASH = "248e207f5461c3a3ffc4ff80018082d95760d2275cf49e1f49947a100550ed76a5acb8b5c613bb7075b141e9df94361ca5213a9bc5c9612aa1bb0e248ea3a4f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modernposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
