SUMMARY = "International Phonetic Alphabet fonts"
DESCRIPTION = "The package provides a 7-bit IPA font, as Metafont source, and \
macros for support under TeXt1 and LaTeX. The fonts (and \
macros) are now largely superseded by the tipa fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25469"

RPM_NAME = "texlive-wsuipa-2023.209.svn25469-53.1.noarch.rpm"
RPM_HASH = "181400703cd115ed5f4f26f59d3349526c243e5f4cbd79f8f500dd40e165737216806fdf28fdbd87ec2379d98082e7183647eb43565b0807495266b3b665f7c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ipa.sty \
tex-ipalmacs.sty \
tex-uipa.fd \
tex-wbxipa10.tfm \
tex-wbxipa11.tfm \
tex-wbxipa12.tfm \
tex-wbxipa17.tfm \
tex-wbxipa8.tfm \
tex-wbxipa9.tfm \
tex-wslipa10.tfm \
tex-wslipa11.tfm \
tex-wslipa12.tfm \
tex-wslipa17.tfm \
tex-wslipa8.tfm \
tex-wslipa9.tfm \
tex-wsuipa10.tfm \
tex-wsuipa11.tfm \
tex-wsuipa12.tfm \
tex-wsuipa17.tfm \
tex-wsuipa8.tfm \
tex-wsuipa9.tfm \
texlive-wsuipa"

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
