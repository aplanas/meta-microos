SUMMARY = "BibLaTeX style for the Australasian Journal of Combinatorics"
DESCRIPTION = "This is an unofficial BibLaTeX style for the Australasian \
Journal of Combinatorics. Note that the journal (as for 01 \
March 2020) does not accept BibLaTeX, so you probably want to \
use biblatex2bibitem."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.0svn54401"

RPM_NAME = "texlive-biblatex-ajc2020unofficial-2023.201.0.0.2.0svn54401-53.1.noarch.rpm"
RPM_HASH = "1a422ad9c400a2faa65b61929cb7a90348fa4b98d7b47f2e94ee413523dd93d373ff6f474e47527e74d3ef788892e34b3d3a4189b10f1846ce3c2aa8db40faa1"
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
