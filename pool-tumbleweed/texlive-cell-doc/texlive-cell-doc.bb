SUMMARY = "Documentation for texlive-cell"
DESCRIPTION = "This package includes the documentation for texlive-cell"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn42428"

RPM_NAME = "texlive-cell-doc-2023.209.svn42428-53.1.noarch.rpm"
RPM_HASH = "fb15af3fa7c0a7933189010ccb2a89e58ac669daa4a0b70b2a7a3b067577750bbcce494ea968d3a0dab3b523910ac7067453b2fb5bec70069356ab52ad2f6f5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cell-doc"

RDEPENDS:${PN} += ""

inherit rpm
