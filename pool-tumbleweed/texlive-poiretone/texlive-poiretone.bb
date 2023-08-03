SUMMARY = "PoiretOne family of fonts with LaTeX support"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX \
support for the PoiretOne family of fonts, designed by Denis \
Masharov. PoiretOne is a decorative geometric grotesque with a \
hint of Art Deco and constructivism. There is currently just a \
regular weight and an artificially emboldened bold."
LICENSE = "OFL-1.1"

PV = "2023.209.svn64856"

RPM_NAME = "texlive-poiretone-2023.209.svn64856-53.1.noarch.rpm"
RPM_HASH = "6c1228091372a1ad6a35c328f7270bd0ef1a9b62c6e239ec8708fceafe8f2b987642f4191c42999179b5293d328f3f0758d6edb0c07fdfbbdfa02cdb8d85a3da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LY1PoiretOne-LF.fd \
tex-OT1PoiretOne-LF.fd \
tex-PoiretOne-Bold-lf-ly1--base.tfm \
tex-PoiretOne-Bold-lf-ly1.tfm \
tex-PoiretOne-Bold-lf-ly1.vf \
tex-PoiretOne-Bold-lf-ot1.tfm \
tex-PoiretOne-Bold-lf-t1--base.tfm \
tex-PoiretOne-Bold-lf-t1.tfm \
tex-PoiretOne-Bold-lf-t1.vf \
tex-PoiretOne-Bold-lf-ts1--base.tfm \
tex-PoiretOne-Bold-lf-ts1.tfm \
tex-PoiretOne-Bold-lf-ts1.vf \
tex-PoiretOne-Regular-lf-ly1--base.tfm \
tex-PoiretOne-Regular-lf-ly1.tfm \
tex-PoiretOne-Regular-lf-ly1.vf \
tex-PoiretOne-Regular-lf-ot1.tfm \
tex-PoiretOne-Regular-lf-t1--base.tfm \
tex-PoiretOne-Regular-lf-t1.tfm \
tex-PoiretOne-Regular-lf-t1.vf \
tex-PoiretOne-Regular-lf-ts1--base.tfm \
tex-PoiretOne-Regular-lf-ts1.tfm \
tex-PoiretOne-Regular-lf-ts1.vf \
tex-PoiretOne.map \
tex-PoiretOne.sty \
tex-T1PoiretOne-LF.fd \
tex-TS1PoiretOne-LF.fd \
tex-prtn-2rdbwn.enc \
tex-prtn-bjsotj.enc \
tex-prtn-nt5tbh.enc \
tex-prtn-opucty.enc \
texlive-poiretone"

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
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-poiretone-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
