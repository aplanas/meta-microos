SUMMARY = "Encapsulate Gnuplot sources in LaTeX documents"
DESCRIPTION = "A package to encapsulate gnuplot commands in a LaTeX source \
file, so that a document's figures are maintained in parallel \
with the document source itself."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.02asvn20617"

RPM_NAME = "texlive-egplot-2023.209.1.02asvn20617-54.1.noarch.rpm"
RPM_HASH = "cbebd11c5fb439298bff7ca93cc56707ca776eabb60ffea7e3656b957435b449156c5ab4e68b1284fd33ee362f9a9e914d801298f425aadce4e0e60b25678e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-egplot.sty \
texlive-egplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifthen.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
