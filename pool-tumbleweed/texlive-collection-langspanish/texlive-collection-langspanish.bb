SUMMARY = "Spanish"
DESCRIPTION = "Support for Spanish."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54141"

RPM_NAME = "texlive-collection-langspanish-2023.208.svn54141-60.1.noarch.rpm"
RPM_HASH = "47f37f8ec9a61629f9290037e447fdd123a51f04841bd84b0ef021212737b527adc4f12e047dadff46e4d8108ab52f9274a1e941969662081baf623eb7f175a7"
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
