SUMMARY = "LaTeX support for Cinzel and Cinzel Decorative fonts"
DESCRIPTION = "Cinzel and Cinzel Decorative fonts, designed by Natanael Gama \
Natanael Gama), find their inspiration in first century roman \
inscriptions, and are based on classical proportions. Cinzel is \
all-caps (similar to Trajan and Michelangelo), but is available \
in three weights (Regular, Bold, Black). There are no italic \
fonts, but there are Decorative variants, which can be selected \
by the usual italic-selection commands in the package's LaTeX \
support."
LICENSE = "OFL-1.1"

PV = "2023.201.svn64550"

RPM_NAME = "texlive-cinzel-2023.201.svn64550-53.1.noarch.rpm"
RPM_HASH = "2e6b0f39d6076e28da1beff28cbaf538a97ac44926573bb5fe889944ccdb52101d4d7d01d4c27258c58657fafe58bd965afce2877434806cd6ef50eb892b7785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Cinzel-Black-lf-ly1--base.tfm \
tex-Cinzel-Black-lf-ly1.tfm \
tex-Cinzel-Black-lf-ly1.vf \
tex-Cinzel-Black-lf-ot1.tfm \
tex-Cinzel-Black-lf-t1--base.tfm \
tex-Cinzel-Black-lf-t1.tfm \
tex-Cinzel-Black-lf-t1.vf \
tex-Cinzel-Black-lf-ts1--base.tfm \
tex-Cinzel-Black-lf-ts1.tfm \
tex-Cinzel-Black-lf-ts1.vf \
tex-Cinzel-Bold-lf-ly1--base.tfm \
tex-Cinzel-Bold-lf-ly1.tfm \
tex-Cinzel-Bold-lf-ly1.vf \
tex-Cinzel-Bold-lf-ot1.tfm \
tex-Cinzel-Bold-lf-t1--base.tfm \
tex-Cinzel-Bold-lf-t1.tfm \
tex-Cinzel-Bold-lf-t1.vf \
tex-Cinzel-Bold-lf-ts1--base.tfm \
tex-Cinzel-Bold-lf-ts1.tfm \
tex-Cinzel-Bold-lf-ts1.vf \
tex-Cinzel-Regular-lf-ly1--base.tfm \
tex-Cinzel-Regular-lf-ly1.tfm \
tex-Cinzel-Regular-lf-ly1.vf \
tex-Cinzel-Regular-lf-ot1.tfm \
tex-Cinzel-Regular-lf-t1--base.tfm \
tex-Cinzel-Regular-lf-t1.tfm \
tex-Cinzel-Regular-lf-t1.vf \
tex-Cinzel-Regular-lf-ts1--base.tfm \
tex-Cinzel-Regular-lf-ts1.tfm \
tex-Cinzel-Regular-lf-ts1.vf \
tex-CinzelDecorative-Black-lf-ly1--base.tfm \
tex-CinzelDecorative-Black-lf-ly1.tfm \
tex-CinzelDecorative-Black-lf-ly1.vf \
tex-CinzelDecorative-Black-lf-ot1.tfm \
tex-CinzelDecorative-Black-lf-t1--base.tfm \
tex-CinzelDecorative-Black-lf-t1.tfm \
tex-CinzelDecorative-Black-lf-t1.vf \
tex-CinzelDecorative-Black-lf-ts1--base.tfm \
tex-CinzelDecorative-Black-lf-ts1.tfm \
tex-CinzelDecorative-Black-lf-ts1.vf \
tex-CinzelDecorative-Bold-lf-ly1--base.tfm \
tex-CinzelDecorative-Bold-lf-ly1.tfm \
tex-CinzelDecorative-Bold-lf-ly1.vf \
tex-CinzelDecorative-Bold-lf-ot1.tfm \
tex-CinzelDecorative-Bold-lf-t1--base.tfm \
tex-CinzelDecorative-Bold-lf-t1.tfm \
tex-CinzelDecorative-Bold-lf-t1.vf \
tex-CinzelDecorative-Bold-lf-ts1--base.tfm \
tex-CinzelDecorative-Bold-lf-ts1.tfm \
tex-CinzelDecorative-Bold-lf-ts1.vf \
tex-CinzelDecorative-Regular-lf-ly1--base.tfm \
tex-CinzelDecorative-Regular-lf-ly1.tfm \
tex-CinzelDecorative-Regular-lf-ly1.vf \
tex-CinzelDecorative-Regular-lf-ot1.tfm \
tex-CinzelDecorative-Regular-lf-t1--base.tfm \
tex-CinzelDecorative-Regular-lf-t1.tfm \
tex-CinzelDecorative-Regular-lf-t1.vf \
tex-CinzelDecorative-Regular-lf-ts1--base.tfm \
tex-CinzelDecorative-Regular-lf-ts1.tfm \
tex-CinzelDecorative-Regular-lf-ts1.vf \
tex-LY1Cinzel-LF.fd \
tex-LY1CinzelDecorative-LF.fd \
tex-OT1Cinzel-LF.fd \
tex-OT1CinzelDecorative-LF.fd \
tex-T1Cinzel-LF.fd \
tex-T1CinzelDecorative-LF.fd \
tex-TS1Cinzel-LF.fd \
tex-TS1CinzelDecorative-LF.fd \
tex-cinzel.map \
tex-cinzel.sty \
tex-cnzl-7luz43.enc \
tex-cnzl-7t2zcj.enc \
tex-cnzl-aakhvz.enc \
tex-cnzl-k6z3ge.enc \
texlive-cinzel"

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
texlive-cinzel-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
