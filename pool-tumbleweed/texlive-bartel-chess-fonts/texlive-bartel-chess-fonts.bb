SUMMARY = "A set of fonts supporting chess diagrams"
DESCRIPTION = "The fonts are provided as Metafont source."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn20619"

RPM_NAME = "texlive-bartel-chess-fonts-2023.209.svn20619-54.1.noarch.rpm"
RPM_HASH = "d437f8c3f703f93064d3675bc0f297ae8e7c6763d78d2e8e9ef57287e2266920d3276c38fad0b65acbac397417141190e78add693e8255c9230a954b45579533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fselch10.tfm \
tex-fselch11.tfm \
tex-fselch12.tfm \
tex-fselch13.tfm \
tex-fselch14.tfm \
tex-fselch16.tfm \
tex-fselch17.tfm \
tex-fselch20.tfm \
tex-fselch24.tfm \
tex-fselch32.tfm \
tex-fselch36.tfm \
tex-fselch6.tfm \
tex-fselch7.tfm \
tex-fselch8.tfm \
tex-fselch9.tfm \
tex-pkelch10.tfm \
tex-pkelch11.tfm \
tex-pkelch12.tfm \
tex-pkelch14.tfm \
tex-pkelch16.tfm \
tex-pkelch8.tfm \
tex-pkelch9.tfm \
texlive-bartel-chess-fonts"

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
