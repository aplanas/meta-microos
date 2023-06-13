SUMMARY = "Documentation for texlive-piechartmp"
DESCRIPTION = "This package includes the documentation for texlive-piechartmp"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn19440"

RPM_NAME = "texlive-piechartmp-doc-2023.201.0.0.3.0svn19440-51.1.noarch.rpm"
RPM_HASH = "27da0a9997d433c5b58ab9cf8a256937cd79cd471e91e8d1c05a511c04394e8c7beb88dbfb508c549e14481c3eb61a6c9ba81b2e54a44d48f7105ee076c420b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-piechartmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
