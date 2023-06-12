SUMMARY = "A LaTeX cheat sheet, in Spanish"
DESCRIPTION = "This is a translation to Spanish (Castellano) of Winston \
Chang's LaTeX cheat sheet (a reference sheet for writing \
scientific papers)."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.00svn36866"

RPM_NAME = "texlive-latexcheat-esmx-2023.201.2.00svn36866-54.1.noarch.rpm"
RPM_HASH = "b58df6d6cf866ccb74d20683d2e15151da6bb2feced3b74db584a1bd47bb0d4ad126afa35bbf01c652eed93860680d569a5ace691208e79ca88f157468ce41fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcheat-esmx"
RDEPENDS:${PN} += "/bin/sh \
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
