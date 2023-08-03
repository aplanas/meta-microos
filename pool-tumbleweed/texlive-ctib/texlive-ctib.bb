SUMMARY = "Tibetan for TeX and LaTeX2e"
DESCRIPTION = "A package using a modified version of Sirlin's Tibetan font. An \
advantage of this Tibetan implementation is that all consonant \
clusters are formed by TeX and Metafont. No external \
preprocessor is needed."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-ctib-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "e4ec744cbafc42903ad42a2a9aa5801b2ca3e517615e91d78946aaba48de7802cb7a7aa80fba07613af49505058a4015b7a6b78a14e535d8999a4bbae57b52ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ctib.sty \
tex-ctib.tex \
tex-ctib.tfm \
tex-lctctib.fd \
tex-lctenc.def \
texlive-ctib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
