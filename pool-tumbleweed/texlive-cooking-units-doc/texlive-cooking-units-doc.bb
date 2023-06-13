SUMMARY = "Documentation for texlive-cooking-units"
DESCRIPTION = "This package includes the documentation for texlive-cooking-units"
LICENSE = "LPPL-1.0"

PV = "2023.204.3.00svn65241"

RPM_NAME = "texlive-cooking-units-doc-2023.204.3.00svn65241-54.1.noarch.rpm"
RPM_HASH = "acca6fe736e07208e84f7b0cbdac850c62d90b220255536a9f17c196d41d102c569531c8b7581dd1d59be53acee1dc8ed496cada48819cf4229f2ab582e30088"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cooking-units-doc"

RDEPENDS:${PN} += ""

inherit rpm
