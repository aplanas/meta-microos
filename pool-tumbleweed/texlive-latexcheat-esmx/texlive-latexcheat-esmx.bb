SUMMARY = "A LaTeX cheat sheet, in Spanish"
DESCRIPTION = "This is a translation to Spanish (Castellano) of Winston \
Chang's LaTeX cheat sheet (a reference sheet for writing \
scientific papers)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.00svn36866"

RPM_NAME = "texlive-latexcheat-esmx-2023.209.2.00svn36866-55.1.noarch.rpm"
RPM_HASH = "5f8e8930e732a74af734e7d2d9846ad14c8f6d2d9eb36bd5ee75cac69a0c5b683cdaeedbfa32e539592aef384638e166b8b0b723be8a91085edaabfc50fe8c6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexcheat-esmx"

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
