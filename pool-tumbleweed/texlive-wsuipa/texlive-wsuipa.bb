SUMMARY = "International Phonetic Alphabet fonts"
DESCRIPTION = "The package provides a 7-bit IPA font, as Metafont source, and \
macros for support under TeXt1 and LaTeX. The fonts (and \
macros) are now largely superseded by the tipa fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25469"

RPM_NAME = "texlive-wsuipa-2023.209.svn25469-53.2.noarch.rpm"
RPM_HASH = "538f802089f4d19d54ed8a3b7e1c69fa4926c3aedb87fc934a8e77d5e55860d385e7a0dad96ea080952fdcbbf8b5210a3f5e211c7d4eb5b161c820ffc834afca"
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
