SUMMARY = "Spanish"
DESCRIPTION = "Support for Spanish."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54141"

RPM_NAME = "texlive-collection-langspanish-2023.208.svn54141-58.1.noarch.rpm"
RPM_HASH = "1b50eb4bfb2d426b052713b4de4f30e5be3b791cfec8b839f03aecb62d8fd01d4168cdfd0e52737bd2c11440b56fcb21b3139c29020502682b213981877c8121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langspanish"
RDEPENDS:${PN} += "texlive-babel-catalan \
texlive-babel-galician \
texlive-babel-spanish \
texlive-collection-basic \
texlive-es-tex-faq \
texlive-hyphen-catalan \
texlive-hyphen-galician \
texlive-hyphen-spanish \
texlive-l2tabu-spanish \
texlive-latex2e-help-texinfo-spanish \
texlive-latexcheat-esmx \
texlive-lshort-spanish \
texlive-texlive-es"

inherit rpm
