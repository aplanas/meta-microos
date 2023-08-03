SUMMARY = "A development of Metafont for creating graphics"
DESCRIPTION = "MetaPost uses a language based on that of Metafont to produce \
precise technical illustrations. Its output is scalable \
PostScript or SVG, rather than the bitmaps Metafont creates."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.svn66264"

RPM_NAME = "texlive-metapost-2023.209.svn66264-55.1.noarch.rpm"
RPM_HASH = "bcfb063450d26f8e48efa0bfb42742c0a73379d7f7394a2ca0276ac91964357cbec7ee04eabdbb2f86c5633dd6b528bb71619552ff36580d4ca828224d5c7b72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-freeeuro.tfm \
tex-groff.enc \
tex-mproof.tex \
tex-mpsproof.tex \
tex-pagd8g.tfm \
tex-pagdo8g.tfm \
tex-pagk8g.tfm \
tex-pagko8g.tfm \
tex-pbkd8g.tfm \
tex-pbkdi8g.tfm \
tex-pbkl8g.tfm \
tex-pbkli8g.tfm \
tex-pcrb8g.tfm \
tex-pcrbo8g.tfm \
tex-pcrr8g.tfm \
tex-pcrro8g.tfm \
tex-phvb8g.tfm \
tex-phvb8gn.tfm \
tex-phvbo8g.tfm \
tex-phvbo8gn.tfm \
tex-phvr8g.tfm \
tex-phvr8gn.tfm \
tex-phvro8g.tfm \
tex-phvro8gn.tfm \
tex-pncb8g.tfm \
tex-pncbi8g.tfm \
tex-pncr8g.tfm \
tex-pncri8g.tfm \
tex-pplb8g.tfm \
tex-pplbi8g.tfm \
tex-pplr8g.tfm \
tex-pplri8g.tfm \
tex-psyrgo.tfm \
tex-ptmb8g.tfm \
tex-ptmbi8g.tfm \
tex-ptmr8g.tfm \
tex-ptmri8g.tfm \
tex-pzcmi8g.tfm \
tex-trfonts.map \
tex-troff-updmap.map \
tex-troff.map \
tex-zpzdr-reversed.tfm \
texlive-metapost"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-metapost-bin \
texlive-metapost-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
