SUMMARY = "Enclose the document body with some pieces of code"
DESCRIPTION = "The package enables authors to designate in the preamble to \
make the document body enclosed with the given pieces of code. \
As is known, there are already various mechanisms provided by \
LaTeX kernel or packages that attach hooks at the beginning and \
end of documents."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn40213"

RPM_NAME = "texlive-bxenclose-2023.209.0.0.2svn40213-53.1.noarch.rpm"
RPM_HASH = "905cf88095d2ab5ba82dc0ff57f05266d702ff1df6240dddc16769af57ea77ce3537b85b6764e65645f53a943aa9701c2e01e1c6dc14b3a38a6448dc2be5bc46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxenclose.sty \
texlive-bxenclose"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
