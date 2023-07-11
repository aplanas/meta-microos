SUMMARY = "Portuguese"
DESCRIPTION = "Support for Portuguese."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54074"

RPM_NAME = "texlive-collection-langportuguese-2023.208.svn54074-60.1.noarch.rpm"
RPM_HASH = "6ca1c56e2cc180ceb85545dacdfe162cb98421b3014484b157f45f1f69af272e1a66b653d29d6ba1d4fa3750fb422368a5440e6295098c11d838a408c6d1d879"
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
