SUMMARY = "The Bitter family of fonts with LaTeX support"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX, and LuaLaTeX \
support for the Bitter family of fonts, designed by Sol Matas \
for Huerta Tipografica. Bitter is a contemporary slab-serif \
typeface for text. There are regular and bold weights and an \
italic, but no bold italic."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64541"

RPM_NAME = "texlive-bitter-2023.209.svn64541-53.1.noarch.rpm"
RPM_HASH = "4b35d9eb34841050db768804e83e469df169221198ca08f7c39a80d0852ef2bafcc4554ec8a9a1ea2528aa829d1d006fd4eee9d58bb30ab2a01dab97d88557eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Bttr-Bold-tlf-ly1--base.tfm \
tex-Bttr-Bold-tlf-ly1.tfm \
tex-Bttr-Bold-tlf-ly1.vf \
tex-Bttr-Bold-tlf-ot1.tfm \
tex-Bttr-Bold-tlf-t1--base.tfm \
tex-Bttr-Bold-tlf-t1.tfm \
tex-Bttr-Bold-tlf-t1.vf \
tex-Bttr-Bold-tlf-ts1--base.tfm \
tex-Bttr-Bold-tlf-ts1.tfm \
tex-Bttr-Bold-tlf-ts1.vf \
tex-Bttr-Italic-tlf-ly1--base.tfm \
tex-Bttr-Italic-tlf-ly1.tfm \
tex-Bttr-Italic-tlf-ly1.vf \
tex-Bttr-Italic-tlf-ot1.tfm \
tex-Bttr-Italic-tlf-t1--base.tfm \
tex-Bttr-Italic-tlf-t1.tfm \
tex-Bttr-Italic-tlf-t1.vf \
tex-Bttr-Italic-tlf-ts1--base.tfm \
tex-Bttr-Italic-tlf-ts1.tfm \
tex-Bttr-Italic-tlf-ts1.vf \
tex-Bttr-Regular-tlf-ly1--base.tfm \
tex-Bttr-Regular-tlf-ly1.tfm \
tex-Bttr-Regular-tlf-ly1.vf \
tex-Bttr-Regular-tlf-ot1.tfm \
tex-Bttr-Regular-tlf-t1--base.tfm \
tex-Bttr-Regular-tlf-t1.tfm \
tex-Bttr-Regular-tlf-t1.vf \
tex-Bttr-Regular-tlf-ts1--base.tfm \
tex-Bttr-Regular-tlf-ts1.tfm \
tex-Bttr-Regular-tlf-ts1.vf \
tex-LY1Bttr-TLF.fd \
tex-OT1Bttr-TLF.fd \
tex-T1Bttr-TLF.fd \
tex-TS1Bttr-TLF.fd \
tex-bitter.map \
tex-bitter.sty \
tex-bttr-6upxhe.enc \
tex-bttr-72jdjw.enc \
tex-bttr-azarls.enc \
tex-bttr-b5i5mx.enc \
tex-bttr-f2umud.enc \
tex-bttr-gljolu.enc \
tex-bttr-ncjtqa.enc \
tex-bttr-ssdm5h.enc \
tex-bttr-vzfpnj.enc \
tex-bttr-w3wxei.enc \
tex-bttr-x2bjkb.enc \
texlive-bitter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontaxes.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-mweights.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-bitter-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
