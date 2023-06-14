SUMMARY = "Marcellus fonts with LaTeX support"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX \
support for the Marcellus family of fonts, designed by Brian J. \
Bonislawsky. Marcellus is a flared-serif family, inspired by \
classic Roman inscription letterforms. There is currently just \
a regular weight and small-caps. The regular weight will be \
silently substituted for bold."
LICENSE = "OFL-1.1"

PV = "2023.201.svn64451"

RPM_NAME = "texlive-marcellus-2023.201.svn64451-52.1.noarch.rpm"
RPM_HASH = "88e53399b13f31804a39ef8fe9de720ed485f40efbafe1bc9bd800fcaa5c810941429a2c0a82fa3f281df72ae15d191f19f5a52f2590bf45cc5344e74e8bff94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LY1Mrcls-LF.fd \
tex-LY1Mrcls-Sup.fd \
tex-Mrcls-Regular-lf-ly1--base.tfm \
tex-Mrcls-Regular-lf-ly1.tfm \
tex-Mrcls-Regular-lf-ly1.vf \
tex-Mrcls-Regular-lf-ot1.tfm \
tex-Mrcls-Regular-lf-t1--base.tfm \
tex-Mrcls-Regular-lf-t1.tfm \
tex-Mrcls-Regular-lf-t1.vf \
tex-Mrcls-Regular-lf-ts1--base.tfm \
tex-Mrcls-Regular-lf-ts1.tfm \
tex-Mrcls-Regular-lf-ts1.vf \
tex-Mrcls-Regular-sup-ly1--base.tfm \
tex-Mrcls-Regular-sup-ly1.tfm \
tex-Mrcls-Regular-sup-ly1.vf \
tex-Mrcls-Regular-sup-ot1.tfm \
tex-Mrcls-Regular-sup-t1--base.tfm \
tex-Mrcls-Regular-sup-t1.tfm \
tex-Mrcls-Regular-sup-t1.vf \
tex-MrclsSC-Regular-lf-sc-ly1--base.tfm \
tex-MrclsSC-Regular-lf-sc-ly1.tfm \
tex-MrclsSC-Regular-lf-sc-ly1.vf \
tex-MrclsSC-Regular-lf-sc-ot1.tfm \
tex-MrclsSC-Regular-lf-sc-t1--base.tfm \
tex-MrclsSC-Regular-lf-sc-t1.tfm \
tex-MrclsSC-Regular-lf-sc-t1.vf \
tex-MrclsSC-Regular-sup-sc-ly1--base.tfm \
tex-MrclsSC-Regular-sup-sc-ly1.tfm \
tex-MrclsSC-Regular-sup-sc-ly1.vf \
tex-MrclsSC-Regular-sup-sc-ot1.tfm \
tex-MrclsSC-Regular-sup-sc-t1--base.tfm \
tex-MrclsSC-Regular-sup-sc-t1.tfm \
tex-MrclsSC-Regular-sup-sc-t1.vf \
tex-OT1Mrcls-LF.fd \
tex-OT1Mrcls-Sup.fd \
tex-T1Mrcls-LF.fd \
tex-T1Mrcls-Sup.fd \
tex-TS1Mrcls-LF.fd \
tex-marcellus.map \
tex-marcellus.sty \
tex-mrcls-37huou.enc \
tex-mrcls-5az7w7.enc \
tex-mrcls-cvodtw.enc \
tex-mrcls-rfafok.enc \
tex-mrcls-rwr7kk.enc \
tex-mrcls-rzkwvt.enc \
tex-mrcls-stzmvz.enc \
texlive-marcellus"

RDEPENDS:${PN} += "/bin/sh \
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
texlive-marcellus-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
