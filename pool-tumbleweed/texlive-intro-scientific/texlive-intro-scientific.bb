SUMMARY = "Introducing scientific/mathematical documents using LaTeX"
DESCRIPTION = "'Writing Scientific Documents Using LaTeX' is an article \
introducing the use of LaTeX in typesetting scientific \
documents. It covers the basics of creating a new LaTeX \
document, special typesetting considerations, mathematical \
typesetting and graphics. It also touches on bibliographic data \
and BibTeX."
LICENSE = "LPPL-1.0"

PV = "2023.208.5th_editionsvn15878"

RPM_NAME = "texlive-intro-scientific-2023.208.5th_editionsvn15878-53.1.noarch.rpm"
RPM_HASH = "9a49ca8bc23359d1a120f7f6876bdb3162784dbed5b0c83fe504e1bc5fee7a99072d51b249edeaf8185be7d662d6638863f63f596b3ed725d02616514064327d"
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
