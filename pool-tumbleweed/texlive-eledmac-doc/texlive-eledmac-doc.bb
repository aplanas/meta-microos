SUMMARY = "Documentation for texlive-eledmac"
DESCRIPTION = "This package includes the documentation for texlive-eledmac"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.24.12svn45418"

RPM_NAME = "texlive-eledmac-doc-2023.209.1.24.12svn45418-54.2.noarch.rpm"
RPM_HASH = "60c9fa56a1d76f451916c68c066523eb04d664d9cc7c290be6e89154e4e753975aea1f3d3d387d2bee1b8e079c1cf722046ce2f9bddae7453e1f58dd0a9f76df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eledmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
