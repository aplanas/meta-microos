SUMMARY = "Theano OldStyle fonts with LaTeX support"
DESCRIPTION = "This package provides the Theano OldStyle font designed by \
Alexey Kryukov, in both TrueType and Type1 formats, with \
support for both traditional and modern LaTeX processors. An \
artificially-emboldened variant has been provided but there are \
no italic variants. The package is named after Theano, a famous \
Ancient Greek woman philosopher, who was first a student of \
Pythagoras, and supposedly became his wife."
LICENSE = "OFL-1.1"

PV = "2023.201.svn64519"

RPM_NAME = "texlive-theanooldstyle-2023.201.svn64519-54.1.noarch.rpm"
RPM_HASH = "e1e80e488147352136d6511f34e9096e1a73a068fec1d8d4fac63e5092d08f9721b32e4e4325e31eb3ea1e5df63bb3cb20ce02d96045daed6c297adb835effda"
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
