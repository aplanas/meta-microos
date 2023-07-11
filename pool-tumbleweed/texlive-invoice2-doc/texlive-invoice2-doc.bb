SUMMARY = "Documentation for texlive-invoice2"
DESCRIPTION = "This package includes the documentation for texlive-invoice2"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.svn46364"

RPM_NAME = "texlive-invoice2-doc-2023.208.svn46364-53.1.noarch.rpm"
RPM_HASH = "8de694b6f0ebb568d638436b453377b0403a1983b5b91be78d1dbc285a962261e0ef05bd543e1d2896bdb46ed4cecc945e675e5c6b56f18f7a169dfdcf98547d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-invoice2-doc"

RDEPENDS:${PN} += ""

inherit rpm
