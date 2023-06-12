SUMMARY = "Documentation for texlive-nnext"
DESCRIPTION = "This package includes the documentation for texlive-nnext"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0svn56575"

RPM_NAME = "texlive-nnext-doc-2023.201.0.0.0svn56575-54.1.noarch.rpm"
RPM_HASH = "4111f83fe5bb70837da0e764ababbf065a9f217555f991e9022126e58baf6ff8a080f493562d3eefca164677a222149fbc11614ec59b1aa577800e9bef9fe11f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nnext-doc"
RDEPENDS:${PN} += ""

inherit rpm
