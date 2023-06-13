SUMMARY = "The Bitter family of fonts with LaTeX support"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX, and LuaLaTeX \
support for the Bitter family of fonts, designed by Sol Matas \
for Huerta Tipografica. Bitter is a contemporary slab-serif \
typeface for text. There are regular and bold weights and an \
italic, but no bold italic."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64541"

RPM_NAME = "texlive-bitter-2023.201.svn64541-52.1.noarch.rpm"
RPM_HASH = "90976fada6052a8c593fedc2d9c819e014da0b11edfb17f5ec7327a3baa8114294766103212ecab0b6cb2bcd06b9e8bd4a52e0eb539d3484bd64b904b83c6eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Bttr-Bold-tlf-ly1--base.tfm) \
tex(Bttr-Bold-tlf-ly1.tfm) \
tex(Bttr-Bold-tlf-ly1.vf) \
tex(Bttr-Bold-tlf-ot1.tfm) \
tex(Bttr-Bold-tlf-t1--base.tfm) \
tex(Bttr-Bold-tlf-t1.tfm) \
tex(Bttr-Bold-tlf-t1.vf) \
tex(Bttr-Bold-tlf-ts1--base.tfm) \
tex(Bttr-Bold-tlf-ts1.tfm) \
tex(Bttr-Bold-tlf-ts1.vf) \
tex(Bttr-Italic-tlf-ly1--base.tfm) \
tex(Bttr-Italic-tlf-ly1.tfm) \
tex(Bttr-Italic-tlf-ly1.vf) \
tex(Bttr-Italic-tlf-ot1.tfm) \
tex(Bttr-Italic-tlf-t1--base.tfm) \
tex(Bttr-Italic-tlf-t1.tfm) \
tex(Bttr-Italic-tlf-t1.vf) \
tex(Bttr-Italic-tlf-ts1--base.tfm) \
tex(Bttr-Italic-tlf-ts1.tfm) \
tex(Bttr-Italic-tlf-ts1.vf) \
tex(Bttr-Regular-tlf-ly1--base.tfm) \
tex(Bttr-Regular-tlf-ly1.tfm) \
tex(Bttr-Regular-tlf-ly1.vf) \
tex(Bttr-Regular-tlf-ot1.tfm) \
tex(Bttr-Regular-tlf-t1--base.tfm) \
tex(Bttr-Regular-tlf-t1.tfm) \
tex(Bttr-Regular-tlf-t1.vf) \
tex(Bttr-Regular-tlf-ts1--base.tfm) \
tex(Bttr-Regular-tlf-ts1.tfm) \
tex(Bttr-Regular-tlf-ts1.vf) \
tex(LY1Bttr-TLF.fd) \
tex(OT1Bttr-TLF.fd) \
tex(T1Bttr-TLF.fd) \
tex(TS1Bttr-TLF.fd) \
tex(bitter.map) \
tex(bitter.sty) \
tex(bttr_6upxhe.enc) \
tex(bttr_72jdjw.enc) \
tex(bttr_azarls.enc) \
tex(bttr_b5i5mx.enc) \
tex(bttr_f2umud.enc) \
tex(bttr_gljolu.enc) \
tex(bttr_ncjtqa.enc) \
tex(bttr_ssdm5h.enc) \
tex(bttr_vzfpnj.enc) \
tex(bttr_w3wxei.enc) \
tex(bttr_x2bjkb.enc) \
texlive-bitter"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontaxes.sty) \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(mweights.sty) \
tex(textcomp.sty) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-bitter-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
