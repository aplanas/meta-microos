SUMMARY = "Mathematical alphabets derived from the STIX fonts"
DESCRIPTION = "The package contains a number of PostScript fonts derived from \
the STIX OpenType fonts that may be used in maths mode in \
regular and bold weights for calligraphic, fraktur and \
double-struck alphabets. Virtual fonts with metrics suitable \
for maths mode are provided, as are LaTeX support files."
LICENSE = "OFL-1.1"

PV = "2023.209.1.02dsvn54512"

RPM_NAME = "texlive-boondox-2023.209.1.02dsvn54512-53.1.noarch.rpm"
RPM_HASH = "974ca84eed0c869869341433bd602b102972d33f8d9a94f40a3b45976acc8faf47e9c1f2d49085d9eb658b17c52ae87728bde9a6c1dfb006a4ca17de101375aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-BOONDOX-b-cal.tfm \
tex-BOONDOX-b-cal.vf \
tex-BOONDOX-b-calo.tfm \
tex-BOONDOX-b-calo.vf \
tex-BOONDOX-b-ds.tfm \
tex-BOONDOX-b-ds.vf \
tex-BOONDOX-b-frak.tfm \
tex-BOONDOX-b-frak.vf \
tex-BOONDOX-cal.sty \
tex-BOONDOX-calo.sty \
tex-BOONDOX-ds.sty \
tex-BOONDOX-frak.sty \
tex-BOONDOX-r-cal.tfm \
tex-BOONDOX-r-cal.vf \
tex-BOONDOX-r-calo.tfm \
tex-BOONDOX-r-calo.vf \
tex-BOONDOX-r-ds.tfm \
tex-BOONDOX-r-ds.vf \
tex-BOONDOX-r-frak.tfm \
tex-BOONDOX-r-frak.vf \
tex-BOONDOX-uprscr.sty \
tex-BOONDOXUprScr-Bold.tfm \
tex-BOONDOXUprScr-Regular.tfm \
tex-boondox.map \
tex-uboondox-cal.fd \
tex-uboondox-calo.fd \
tex-uboondox-ds.fd \
tex-uboondox-frak.fd \
tex-uboondoxuprscr.fd \
tex-zxxbf7z.tfm \
tex-zxxbf8a.tfm \
tex-zxxbl7z.tfm \
tex-zxxbl8a.tfm \
tex-zxxbow7z.tfm \
tex-zxxbw7z.tfm \
tex-zxxbw8a.tfm \
tex-zxxrf7z.tfm \
tex-zxxrf8a.tfm \
tex-zxxrl7z.tfm \
tex-zxxrl8a.tfm \
tex-zxxrow7z.tfm \
tex-zxxrw7z.tfm \
tex-zxxrw8a.tfm \
texlive-boondox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmr10.tfm \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-boondox-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
