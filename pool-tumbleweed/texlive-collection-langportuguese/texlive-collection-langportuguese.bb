SUMMARY = "Portuguese"
DESCRIPTION = "Support for Portuguese."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54074"

RPM_NAME = "texlive-collection-langportuguese-2023.208.svn54074-58.1.noarch.rpm"
RPM_HASH = "ea24fd69e0c274493f362a2e5b16f377a2237a3a63b9f218cc6cfdcfb61060ec40e0e934a67691f3d13aa1aabfabaeeabf710175fab7dbe3d86eebc8fc232041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langportuguese"

RDEPENDS:${PN} += "texlive-babel-portuges \
texlive-beamer-tut-pt \
texlive-collection-basic \
texlive-cursolatex \
texlive-feupphdteses \
texlive-hyphen-portuguese \
texlive-latex-via-exemplos \
texlive-latexcheat-ptbr \
texlive-lshort-portuguese \
texlive-numberpt \
texlive-ordinalpt \
texlive-xypic-tut-pt"

inherit rpm
