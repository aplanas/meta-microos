SUMMARY = "Documentation for texlive-ekaia"
DESCRIPTION = "This package includes the documentation for texlive-ekaia"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn49594"

RPM_NAME = "texlive-ekaia-doc-2023.209.1.06svn49594-54.1.noarch.rpm"
RPM_HASH = "ed2c03dafd362df30537f4a4887950863054dc800651880f018a2562b2e3274b8e2e5cdf1fe57fbe932a16895bf6526dc746736fa5da5b749d9228c51e4ab537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ekaia-doc"

RDEPENDS:${PN} += ""

inherit rpm
