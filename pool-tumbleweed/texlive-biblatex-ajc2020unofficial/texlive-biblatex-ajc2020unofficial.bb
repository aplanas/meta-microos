SUMMARY = "BibLaTeX style for the Australasian Journal of Combinatorics"
DESCRIPTION = "This is an unofficial BibLaTeX style for the Australasian \
Journal of Combinatorics. Note that the journal (as for 01 \
March 2020) does not accept BibLaTeX, so you probably want to \
use biblatex2bibitem."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.0svn54401"

RPM_NAME = "texlive-biblatex-ajc2020unofficial-2023.209.0.0.2.0svn54401-54.1.noarch.rpm"
RPM_HASH = "b6c83b3f3cf480847a4a0b362a0250919f33faafb00bbf1cbdb2376bbff78f415828604f8655fa2db625abaaf914671a0b7b27120b005bd50213a12d31af3bae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ajc2020unofficial.bbx \
tex-ajc2020unofficial.cbx \
texlive-biblatex-ajc2020unofficial"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric.bbx \
tex-numeric.cbx \
tex-shortmathj.sty \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
