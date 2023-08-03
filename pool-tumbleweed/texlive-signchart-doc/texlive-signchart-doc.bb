SUMMARY = "Documentation for texlive-signchart"
DESCRIPTION = "This package includes the documentation for texlive-signchart"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn39707"

RPM_NAME = "texlive-signchart-doc-2023.209.1.01svn39707-54.1.noarch.rpm"
RPM_HASH = "30751a7049e18ede2de0a4133d45796ebb919e4532fb4985e7ce463e9cf1e44818f3b6c57343aa6cfc382f48ed1b98d74bcbfeac818350ee51a9b1c483149420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-signchart-doc"

RDEPENDS:${PN} += ""

inherit rpm
