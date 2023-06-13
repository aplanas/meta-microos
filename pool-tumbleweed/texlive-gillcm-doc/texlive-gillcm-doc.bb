SUMMARY = "Documentation for texlive-gillcm"
DESCRIPTION = "This package includes the documentation for texlive-gillcm"
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.1svn19878"

RPM_NAME = "texlive-gillcm-doc-2023.201.1.1svn19878-52.1.noarch.rpm"
RPM_HASH = "cabb6b459194cbd1033771d8e0ee9bd2132e0a303e9138409baa474f9aa0c9ef0c3b83c5b95e03f6e1b190f530f3493e99fa3d3a43325b9ba23f01076d0763a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gillcm-doc"

RDEPENDS:${PN} += ""

inherit rpm
