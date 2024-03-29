SUMMARY = "Universal titlepages with configuration options and predefined styles"
DESCRIPTION = "Creation of title pages is something most authors should not \
have to do. But reality is not perfect, so a lot of authors \
have to do it. This package not only provides several pages for \
the title instead of only one -- at least five are typical for \
a thesis! --, it also provides a bunch of predefined titlepage \
styles with several standard elements, and optionally \
additional elements."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn64306"

RPM_NAME = "texlive-uni-titlepage-2023.209.1.1asvn64306-54.1.noarch.rpm"
RPM_HASH = "0bfbc9bf255f0fda4c0115df7a6d51c2172dfcfc5594eecd2506ec98337ef9bcc35ac0b87feb0989e9bc1a012b5860467e761952754fc647edaecf59c3f9c757"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-title-DHBW.def \
tex-title-JT-Aufsaetze.def \
tex-title-JT-Geschichte.def \
tex-title-JT-Typography.def \
tex-title-KIT.def \
tex-title-KOMAScript.def \
tex-title-Markus-1.def \
tex-title-Markus-2.def \
tex-title-Spacer.def \
tex-title-TU-DD.def \
tex-title-TU-HH.def \
tex-title-UKoLa.def \
tex-title-WWUM.def \
tex-uni-titlepage.sty \
texlive-uni-titlepage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-scrbase.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
