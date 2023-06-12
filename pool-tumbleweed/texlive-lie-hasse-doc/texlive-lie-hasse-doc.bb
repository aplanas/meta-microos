SUMMARY = "Documentation for texlive-lie-hasse"
DESCRIPTION = "This package includes the documentation for texlive-lie-hasse"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-lie-hasse-doc-2023.201.1.0svn61719-54.1.noarch.rpm"
RPM_HASH = "fcbeab424558b05518bca30436a193b6a6c13f72d8e5b364e2fa800ca5b3f7c0fbea7d1d56671374d3bf187e1dd0a36527de68612143d454f23107490a578584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lie-hasse-doc"
RDEPENDS:${PN} += ""

inherit rpm
