SUMMARY = "Display bibitem tags in the margins"
DESCRIPTION = "The package redefines the 'thebibliography' environment to \
place the citation key into the margin."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0csvn15878"

RPM_NAME = "texlive-margbib-2023.201.1.0csvn15878-52.1.noarch.rpm"
RPM_HASH = "3c6e539a7b4398b2ea6bb2892dcbe60dbc1827cb902ef630a686e83c3466d080802e9560edf401072ee9a337c67eed31421fa288f25c30b600fc120b81e35130"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(margbib.sty) \
texlive-margbib"

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
