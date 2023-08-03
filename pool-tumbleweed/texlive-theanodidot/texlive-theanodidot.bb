SUMMARY = "TheanoDidot fonts with LaTeX support"
DESCRIPTION = "This package provides the TheanoDidot font designed by Alexey \
Kryukov, in both TrueType and Type1 formats, with support for \
both traditional and modern LaTeX processors. An \
artificially-emboldened variant has been provided but there are \
no italic variants. The package is named after Theano, a famous \
Ancient Greek woman philosopher, who was first a student of \
Pythagoras, and supposedly became his wife. The Didot family \
were active as designers for about 100 years in the 18th and \
19th centuries. They were printers, publishers, typeface \
designers, inventors and intellectuals. Around 1800 the Didot \
family owned the most important print shop and font foundry in \
France. Pierre Didot, the printer, published a document with \
the typefaces of his brother, Firmin Didot, the typeface \
designer. The strong clear forms of this alphabet display \
objective, rational characteristics and are representative of \
the time and philosophy of the Enlightenment."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64518"

RPM_NAME = "texlive-theanodidot-2023.209.svn64518-55.1.noarch.rpm"
RPM_HASH = "0205a9720070fad17e3228a43cf2d8579928ff998837eec79e7cb3ea0fe1e310588947e94afee639231a30404a169e4477f1c9ebf8dd196df10b352c95669cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LGRTheanoDidot-TLF.fd \
tex-LGRTheanoDidot-TOsF.fd \
tex-LY1TheanoDidot-TLF.fd \
tex-LY1TheanoDidot-TOsF.fd \
tex-OT1TheanoDidot-TLF.fd \
tex-OT1TheanoDidot-TOsF.fd \
tex-T1TheanoDidot-TLF.fd \
tex-T1TheanoDidot-TOsF.fd \
tex-TS1TheanoDidot-TLF.fd \
tex-TS1TheanoDidot-TOsF.fd \
tex-TheanoDidot-Bold-tlf-lgr.tfm \
tex-TheanoDidot-Bold-tlf-ly1.tfm \
tex-TheanoDidot-Bold-tlf-ot1.tfm \
tex-TheanoDidot-Bold-tlf-t1--base.tfm \
tex-TheanoDidot-Bold-tlf-t1.tfm \
tex-TheanoDidot-Bold-tlf-t1.vf \
tex-TheanoDidot-Bold-tlf-ts1--base.tfm \
tex-TheanoDidot-Bold-tlf-ts1.tfm \
tex-TheanoDidot-Bold-tlf-ts1.vf \
tex-TheanoDidot-Bold-tosf-lgr.tfm \
tex-TheanoDidot-Bold-tosf-ly1.tfm \
tex-TheanoDidot-Bold-tosf-ot1.tfm \
tex-TheanoDidot-Bold-tosf-t1--base.tfm \
tex-TheanoDidot-Bold-tosf-t1.tfm \
tex-TheanoDidot-Bold-tosf-t1.vf \
tex-TheanoDidot-Bold-tosf-ts1--base.tfm \
tex-TheanoDidot-Bold-tosf-ts1.tfm \
tex-TheanoDidot-Bold-tosf-ts1.vf \
tex-TheanoDidot-Regular-tlf-lgr.tfm \
tex-TheanoDidot-Regular-tlf-ly1.tfm \
tex-TheanoDidot-Regular-tlf-ot1.tfm \
tex-TheanoDidot-Regular-tlf-t1--base.tfm \
tex-TheanoDidot-Regular-tlf-t1.tfm \
tex-TheanoDidot-Regular-tlf-t1.vf \
tex-TheanoDidot-Regular-tlf-ts1--base.tfm \
tex-TheanoDidot-Regular-tlf-ts1.tfm \
tex-TheanoDidot-Regular-tlf-ts1.vf \
tex-TheanoDidot-Regular-tosf-lgr.tfm \
tex-TheanoDidot-Regular-tosf-ly1.tfm \
tex-TheanoDidot-Regular-tosf-ot1.tfm \
tex-TheanoDidot-Regular-tosf-t1--base.tfm \
tex-TheanoDidot-Regular-tosf-t1.tfm \
tex-TheanoDidot-Regular-tosf-t1.vf \
tex-TheanoDidot-Regular-tosf-ts1--base.tfm \
tex-TheanoDidot-Regular-tosf-ts1.tfm \
tex-TheanoDidot-Regular-tosf-ts1.vf \
tex-TheanoDidot.map \
tex-TheanoDidot.sty \
tex-thdid-alkcdl.enc \
tex-thdid-ertqq3.enc \
tex-thdid-f66p55.enc \
tex-thdid-izaajv.enc \
tex-thdid-k6ngqv.enc \
tex-thdid-lqxlns.enc \
tex-thdid-oiucyb.enc \
tex-thdid-whuz6y.enc \
tex-thdid-xgfkyc.enc \
tex-thdid-zj2gif.enc \
texlive-theanodidot"

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
texlive-theanodidot-fonts"

inherit rpm
