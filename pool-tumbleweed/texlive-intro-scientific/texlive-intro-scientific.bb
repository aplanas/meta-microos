SUMMARY = "Introducing scientific/mathematical documents using LaTeX"
DESCRIPTION = "'Writing Scientific Documents Using LaTeX' is an article \
introducing the use of LaTeX in typesetting scientific \
documents. It covers the basics of creating a new LaTeX \
document, special typesetting considerations, mathematical \
typesetting and graphics. It also touches on bibliographic data \
and BibTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.5th_editionsvn15878"

RPM_NAME = "texlive-intro-scientific-2023.209.5th_editionsvn15878-54.1.noarch.rpm"
RPM_HASH = "ef5d02b1153437193808cf9474e13fa0f8caf9069979fb839b303e30fecaa368b43b68cfcaa7bd493c384584f3452853452fe2c44a3a73b4069d2e9cecbb850e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-intro-scientific"

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
