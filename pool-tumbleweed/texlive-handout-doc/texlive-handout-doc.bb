SUMMARY = "Documentation for texlive-handout"
DESCRIPTION = "This package includes the documentation for texlive-handout"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6.0svn43962"

RPM_NAME = "texlive-handout-doc-2023.201.1.6.0svn43962-53.1.noarch.rpm"
RPM_HASH = "7319b7b05586421b37f1ed8615ccddb38a778077dcc2cac7de4fbe1b0487278fa6a7d0009ed47619da486182dd0d3fd8a499c31bd7db50c5ba822c6863f20091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-handout-doc"

RDEPENDS:${PN} += ""

inherit rpm
