SUMMARY = "A set of fonts supporting chess diagrams"
DESCRIPTION = "The fonts are provided as Metafont source."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn20619"

RPM_NAME = "texlive-bartel-chess-fonts-2023.201.svn20619-53.1.noarch.rpm"
RPM_HASH = "1ad3b4447d559dd0ff726d144af93711089dc96dd367da4f41a15c0d0f12fed624077e7f99a76c0b4bde7222f3a893073750332917b957d491cc656bdb736cd1"
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
