SUMMARY = "Theano OldStyle fonts with LaTeX support"
DESCRIPTION = "This package provides the Theano OldStyle font designed by \
Alexey Kryukov, in both TrueType and Type1 formats, with \
support for both traditional and modern LaTeX processors. An \
artificially-emboldened variant has been provided but there are \
no italic variants. The package is named after Theano, a famous \
Ancient Greek woman philosopher, who was first a student of \
Pythagoras, and supposedly became his wife."
LICENSE = "OFL-1.1"

PV = "2023.209.svn64519"

RPM_NAME = "texlive-theanooldstyle-2023.209.svn64519-55.1.noarch.rpm"
RPM_HASH = "4a3785268a3f232e1bce805ce5649cb0bf1b3f31126d767ef1c4f796a9ca0818e43886e42b989cfd51902b58e6095b43c38f4d49af2f470d7a89360dfadae53b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LGRTheanoOldStyle-TLF.fd \
tex-LGRTheanoOldStyle-TOsF.fd \
tex-LY1TheanoOldStyle-TLF.fd \
tex-LY1TheanoOldStyle-TOsF.fd \
tex-OT1TheanoOldStyle-TLF.fd \
tex-OT1TheanoOldStyle-TOsF.fd \
tex-T1TheanoOldStyle-TLF.fd \
tex-T1TheanoOldStyle-TOsF.fd \
tex-TS1TheanoOldStyle-TLF.fd \
tex-TS1TheanoOldStyle-TOsF.fd \
tex-TheanoOldStyle-Bold-tlf-lgr.tfm \
tex-TheanoOldStyle-Bold-tlf-ly1.tfm \
tex-TheanoOldStyle-Bold-tlf-ot1.tfm \
tex-TheanoOldStyle-Bold-tlf-t1--base.tfm \
tex-TheanoOldStyle-Bold-tlf-t1.tfm \
tex-TheanoOldStyle-Bold-tlf-t1.vf \
tex-TheanoOldStyle-Bold-tlf-ts1--base.tfm \
tex-TheanoOldStyle-Bold-tlf-ts1.tfm \
tex-TheanoOldStyle-Bold-tlf-ts1.vf \
tex-TheanoOldStyle-Bold-tosf-lgr.tfm \
tex-TheanoOldStyle-Bold-tosf-ly1.tfm \
tex-TheanoOldStyle-Bold-tosf-ot1.tfm \
tex-TheanoOldStyle-Bold-tosf-t1--base.tfm \
tex-TheanoOldStyle-Bold-tosf-t1.tfm \
tex-TheanoOldStyle-Bold-tosf-t1.vf \
tex-TheanoOldStyle-Bold-tosf-ts1--base.tfm \
tex-TheanoOldStyle-Bold-tosf-ts1.tfm \
tex-TheanoOldStyle-Bold-tosf-ts1.vf \
tex-TheanoOldStyle-Regular-tlf-lgr.tfm \
tex-TheanoOldStyle-Regular-tlf-ly1.tfm \
tex-TheanoOldStyle-Regular-tlf-ot1.tfm \
tex-TheanoOldStyle-Regular-tlf-t1--base.tfm \
tex-TheanoOldStyle-Regular-tlf-t1.tfm \
tex-TheanoOldStyle-Regular-tlf-t1.vf \
tex-TheanoOldStyle-Regular-tlf-ts1--base.tfm \
tex-TheanoOldStyle-Regular-tlf-ts1.tfm \
tex-TheanoOldStyle-Regular-tlf-ts1.vf \
tex-TheanoOldStyle-Regular-tosf-lgr.tfm \
tex-TheanoOldStyle-Regular-tosf-ly1.tfm \
tex-TheanoOldStyle-Regular-tosf-ot1.tfm \
tex-TheanoOldStyle-Regular-tosf-t1--base.tfm \
tex-TheanoOldStyle-Regular-tosf-t1.tfm \
tex-TheanoOldStyle-Regular-tosf-t1.vf \
tex-TheanoOldStyle-Regular-tosf-ts1--base.tfm \
tex-TheanoOldStyle-Regular-tosf-ts1.tfm \
tex-TheanoOldStyle-Regular-tosf-ts1.vf \
tex-TheanoOldStyle.map \
tex-TheanoOldStyle.sty \
tex-thost-alkcdl.enc \
tex-thost-ertqq3.enc \
tex-thost-f66p55.enc \
tex-thost-izaajv.enc \
tex-thost-ogssaz.enc \
tex-thost-oiucyb.enc \
tex-thost-whuz6y.enc \
tex-thost-xf32t5.enc \
tex-thost-xgfkyc.enc \
tex-thost-zj2gif.enc \
texlive-theanooldstyle"

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
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-theanooldstyle-fonts"

inherit rpm
