SUMMARY = "Theano Modern fonts with LaTeX support"
DESCRIPTION = "This package provides the TheanoModern font designed by Alexey \
Kryukov, in both TrueType and Type1 formats, with support for \
both traditional and modern LaTeX processors. An \
artificially-emboldened variant has been provided but there are \
no italic variants. The package is named after Theano, a famous \
Ancient Greek woman philosopher, who was first a student of \
Pythagoras, and supposedly became his wife."
LICENSE = "OFL-1.1"

PV = "2023.201.svn64520"

RPM_NAME = "texlive-theanomodern-2023.201.svn64520-54.1.noarch.rpm"
RPM_HASH = "c4661b732e4793e19fd1198cbe3e5c210ffd1634690b1530600c4bd4aa8e8f987c92bfe55be8bba68f5008a07c409efc949c3a59ad6c12cce3cf9a8e6c9dcf9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LGRTheanoModern-TLF.fd \
tex-LGRTheanoModern-TOsF.fd \
tex-LY1TheanoModern-TLF.fd \
tex-LY1TheanoModern-TOsF.fd \
tex-OT1TheanoModern-TLF.fd \
tex-OT1TheanoModern-TOsF.fd \
tex-T1TheanoModern-TLF.fd \
tex-T1TheanoModern-TOsF.fd \
tex-TS1TheanoModern-TLF.fd \
tex-TS1TheanoModern-TOsF.fd \
tex-TheanoModern-Bold-tlf-lgr.tfm \
tex-TheanoModern-Bold-tlf-ly1.tfm \
tex-TheanoModern-Bold-tlf-ot1.tfm \
tex-TheanoModern-Bold-tlf-t1--base.tfm \
tex-TheanoModern-Bold-tlf-t1.tfm \
tex-TheanoModern-Bold-tlf-t1.vf \
tex-TheanoModern-Bold-tlf-ts1--base.tfm \
tex-TheanoModern-Bold-tlf-ts1.tfm \
tex-TheanoModern-Bold-tlf-ts1.vf \
tex-TheanoModern-Bold-tosf-lgr.tfm \
tex-TheanoModern-Bold-tosf-ly1.tfm \
tex-TheanoModern-Bold-tosf-ot1.tfm \
tex-TheanoModern-Bold-tosf-t1--base.tfm \
tex-TheanoModern-Bold-tosf-t1.tfm \
tex-TheanoModern-Bold-tosf-t1.vf \
tex-TheanoModern-Bold-tosf-ts1--base.tfm \
tex-TheanoModern-Bold-tosf-ts1.tfm \
tex-TheanoModern-Bold-tosf-ts1.vf \
tex-TheanoModern-Regular-tlf-lgr.tfm \
tex-TheanoModern-Regular-tlf-ly1.tfm \
tex-TheanoModern-Regular-tlf-ot1.tfm \
tex-TheanoModern-Regular-tlf-t1--base.tfm \
tex-TheanoModern-Regular-tlf-t1.tfm \
tex-TheanoModern-Regular-tlf-t1.vf \
tex-TheanoModern-Regular-tlf-ts1--base.tfm \
tex-TheanoModern-Regular-tlf-ts1.tfm \
tex-TheanoModern-Regular-tlf-ts1.vf \
tex-TheanoModern-Regular-tosf-lgr.tfm \
tex-TheanoModern-Regular-tosf-ly1.tfm \
tex-TheanoModern-Regular-tosf-ot1.tfm \
tex-TheanoModern-Regular-tosf-t1--base.tfm \
tex-TheanoModern-Regular-tosf-t1.tfm \
tex-TheanoModern-Regular-tosf-t1.vf \
tex-TheanoModern-Regular-tosf-ts1--base.tfm \
tex-TheanoModern-Regular-tosf-ts1.tfm \
tex-TheanoModern-Regular-tosf-ts1.vf \
tex-TheanoModern.map \
tex-TheanoModern.sty \
tex-thedid-alkcdl.enc \
tex-thedid-ertqq3.enc \
tex-thedid-f66p55.enc \
tex-thedid-izaajv.enc \
tex-thedid-k6ngqv.enc \
tex-thedid-lqxlns.enc \
tex-thedid-oiucyb.enc \
tex-thedid-whuz6y.enc \
tex-thedid-xgfkyc.enc \
tex-thedid-zj2gif.enc \
texlive-theanomodern"

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
texlive-theanomodern-fonts"

inherit rpm
