SUMMARY = "Documentation for texlive-pst-pdf"
DESCRIPTION = "This package includes the documentation for texlive-pst-pdf"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2fsvn56622"

RPM_NAME = "texlive-pst-pdf-doc-2023.201.1.2fsvn56622-53.2.noarch.rpm"
RPM_HASH = "ba31430235f227ae76c7df4b8355fb18fe8d48cc59cade94ef5d5547cc09a10ae6c376fe68ce0049b80fa9b166b6a6cecbab2538d791edb93022a5d6d2f6a97a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-pdf-doc-de;en \
texlive-pst-pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
