SUMMARY = "Documentation for texlive-eledmac"
DESCRIPTION = "This package includes the documentation for texlive-eledmac"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.24.12svn45418"

RPM_NAME = "texlive-eledmac-doc-2023.209.1.24.12svn45418-54.1.noarch.rpm"
RPM_HASH = "d31709ce71bc9984778f2b9b08f1e430e5e0db9132bd01cf76ee5741c992a18f1a55ed1058fe28b7dac0f115aecc8dff62f13e4948fb51f72327b2ae46e007b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eledmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
