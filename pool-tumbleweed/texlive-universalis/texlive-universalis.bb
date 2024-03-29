SUMMARY = "Universalis font, with support"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX \
support for the UniversalisADFStd family of fonts, designed by \
Hirwin Harendal. The font is suitable as an alternative to \
fonts such as Adrian Frutiger's Univers and Frutiger."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn64505"

RPM_NAME = "texlive-universalis-2023.209.svn64505-54.1.noarch.rpm"
RPM_HASH = "a6609a8b7f71f9bf29f35fa5e2bb4d289466cfd4e0f20c19289de43115ca358a5ee2383dbcf020d894feefeb8ec73572efb2fd203b7d07c5f01d812d27b52848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LY1UniversalisADFStd-LF.fd \
tex-OT1UniversalisADFStd-LF.fd \
tex-T1UniversalisADFStd-LF.fd \
tex-TS1UniversalisADFStd-LF.fd \
tex-UniversalisADFStd-Bold-lf-ly1--base.tfm \
tex-UniversalisADFStd-Bold-lf-ly1--lcdfj.tfm \
tex-UniversalisADFStd-Bold-lf-ly1.tfm \
tex-UniversalisADFStd-Bold-lf-ly1.vf \
tex-UniversalisADFStd-Bold-lf-ot1--base.tfm \
tex-UniversalisADFStd-Bold-lf-ot1--lcdfj.tfm \
tex-UniversalisADFStd-Bold-lf-ot1.tfm \
tex-UniversalisADFStd-Bold-lf-ot1.vf \
tex-UniversalisADFStd-Bold-lf-t1--base.tfm \
tex-UniversalisADFStd-Bold-lf-t1--lcdfj.tfm \
tex-UniversalisADFStd-Bold-lf-t1.tfm \
tex-UniversalisADFStd-Bold-lf-t1.vf \
tex-UniversalisADFStd-Bold-lf-ts1--base.tfm \
tex-UniversalisADFStd-Bold-lf-ts1.tfm \
tex-UniversalisADFStd-Bold-lf-ts1.vf \
tex-UniversalisADFStd-BoldCond-lf-ly1--base.tfm \
tex-UniversalisADFStd-BoldCond-lf-ly1--lcdfj.tfm \
tex-UniversalisADFStd-BoldCond-lf-ly1.tfm \
tex-UniversalisADFStd-BoldCond-lf-ly1.vf \
tex-UniversalisADFStd-BoldCond-lf-ot1--base.tfm \
tex-UniversalisADFStd-BoldCond-lf-ot1--lcdfj.tfm \
tex-UniversalisADFStd-BoldCond-lf-ot1.tfm \
tex-UniversalisADFStd-BoldCond-lf-ot1.vf \
tex-UniversalisADFStd-BoldCond-lf-t1--base.tfm \
tex-UniversalisADFStd-BoldCond-lf-t1--lcdfj.tfm \
tex-UniversalisADFStd-BoldCond-lf-t1.tfm \
tex-UniversalisADFStd-BoldCond-lf-t1.vf \
tex-UniversalisADFStd-BoldCond-lf-ts1--base.tfm \
tex-UniversalisADFStd-BoldCond-lf-ts1.tfm \
tex-UniversalisADFStd-BoldCond-lf-ts1.vf \
tex-UniversalisADFStd-BoldCondIt-lf-ly1--base.tfm \
tex-UniversalisADFStd-BoldCondIt-lf-ly1--lcdfj.tfm \
tex-UniversalisADFStd-BoldCondIt-lf-ly1.tfm \
tex-UniversalisADFStd-BoldCondIt-lf-ly1.vf \
tex-UniversalisADFStd-BoldCondIt-lf-ot1--base.tfm \
tex-UniversalisADFStd-BoldCondIt-lf-ot1--lcdfj.tfm \
tex-UniversalisADFStd-BoldCondIt-lf-ot1.tfm \
tex-UniversalisADFStd-BoldCondIt-lf-ot1.vf \
tex-UniversalisADFStd-BoldCondIt-lf-t1--base.tfm \
tex-UniversalisADFStd-BoldCondIt-lf-t1--lcdfj.tfm \
tex-UniversalisADFStd-BoldCondIt-lf-t1.tfm \
tex-UniversalisADFStd-BoldCondIt-lf-t1.vf \
tex-UniversalisADFStd-BoldCondIt-lf-ts1--base.tfm \
tex-UniversalisADFStd-BoldCondIt-lf-ts1.tfm \
tex-UniversalisADFStd-BoldCondIt-lf-ts1.vf \
tex-UniversalisADFStd-BoldItalic-lf-ly1--base.tfm \
tex-UniversalisADFStd-BoldItalic-lf-ly1--lcdfj.tfm \
tex-UniversalisADFStd-BoldItalic-lf-ly1.tfm \
tex-UniversalisADFStd-BoldItalic-lf-ly1.vf \
tex-UniversalisADFStd-BoldItalic-lf-ot1--base.tfm \
tex-UniversalisADFStd-BoldItalic-lf-ot1--lcdfj.tfm \
tex-UniversalisADFStd-BoldItalic-lf-ot1.tfm \
tex-UniversalisADFStd-BoldItalic-lf-ot1.vf \
tex-UniversalisADFStd-BoldItalic-lf-t1--base.tfm \
tex-UniversalisADFStd-BoldItalic-lf-t1--lcdfj.tfm \
tex-UniversalisADFStd-BoldItalic-lf-t1.tfm \
tex-UniversalisADFStd-BoldItalic-lf-t1.vf \
tex-UniversalisADFStd-BoldItalic-lf-ts1--base.tfm \
tex-UniversalisADFStd-BoldItalic-lf-ts1.tfm \
tex-UniversalisADFStd-BoldItalic-lf-ts1.vf \
tex-UniversalisADFStd-Cond-lf-ly1--base.tfm \
tex-UniversalisADFStd-Cond-lf-ly1--lcdfj.tfm \
tex-UniversalisADFStd-Cond-lf-ly1.tfm \
tex-UniversalisADFStd-Cond-lf-ly1.vf \
tex-UniversalisADFStd-Cond-lf-ot1--base.tfm \
tex-UniversalisADFStd-Cond-lf-ot1--lcdfj.tfm \
tex-UniversalisADFStd-Cond-lf-ot1.tfm \
tex-UniversalisADFStd-Cond-lf-ot1.vf \
tex-UniversalisADFStd-Cond-lf-t1--base.tfm \
tex-UniversalisADFStd-Cond-lf-t1--lcdfj.tfm \
tex-UniversalisADFStd-Cond-lf-t1.tfm \
tex-UniversalisADFStd-Cond-lf-t1.vf \
tex-UniversalisADFStd-Cond-lf-ts1--base.tfm \
tex-UniversalisADFStd-Cond-lf-ts1.tfm \
tex-UniversalisADFStd-Cond-lf-ts1.vf \
tex-UniversalisADFStd-CondItalic-lf-ly1--base.tfm \
tex-UniversalisADFStd-CondItalic-lf-ly1--lcdfj.tfm \
tex-UniversalisADFStd-CondItalic-lf-ly1.tfm \
tex-UniversalisADFStd-CondItalic-lf-ly1.vf \
tex-UniversalisADFStd-CondItalic-lf-ot1--base.tfm \
tex-UniversalisADFStd-CondItalic-lf-ot1--lcdfj.tfm \
tex-UniversalisADFStd-CondItalic-lf-ot1.tfm \
tex-UniversalisADFStd-CondItalic-lf-ot1.vf \
tex-UniversalisADFStd-CondItalic-lf-t1--base.tfm \
tex-UniversalisADFStd-CondItalic-lf-t1--lcdfj.tfm \
tex-UniversalisADFStd-CondItalic-lf-t1.tfm \
tex-UniversalisADFStd-CondItalic-lf-t1.vf \
tex-UniversalisADFStd-CondItalic-lf-ts1--base.tfm \
tex-UniversalisADFStd-CondItalic-lf-ts1.tfm \
tex-UniversalisADFStd-CondItalic-lf-ts1.vf \
tex-UniversalisADFStd-Italic-lf-ly1--base.tfm \
tex-UniversalisADFStd-Italic-lf-ly1--lcdfj.tfm \
tex-UniversalisADFStd-Italic-lf-ly1.tfm \
tex-UniversalisADFStd-Italic-lf-ly1.vf \
tex-UniversalisADFStd-Italic-lf-ot1--base.tfm \
tex-UniversalisADFStd-Italic-lf-ot1--lcdfj.tfm \
tex-UniversalisADFStd-Italic-lf-ot1.tfm \
tex-UniversalisADFStd-Italic-lf-ot1.vf \
tex-UniversalisADFStd-Italic-lf-t1--base.tfm \
tex-UniversalisADFStd-Italic-lf-t1--lcdfj.tfm \
tex-UniversalisADFStd-Italic-lf-t1.tfm \
tex-UniversalisADFStd-Italic-lf-t1.vf \
tex-UniversalisADFStd-Italic-lf-ts1--base.tfm \
tex-UniversalisADFStd-Italic-lf-ts1.tfm \
tex-UniversalisADFStd-Italic-lf-ts1.vf \
tex-UniversalisADFStd-Regular-lf-ly1--base.tfm \
tex-UniversalisADFStd-Regular-lf-ly1--lcdfj.tfm \
tex-UniversalisADFStd-Regular-lf-ly1.tfm \
tex-UniversalisADFStd-Regular-lf-ly1.vf \
tex-UniversalisADFStd-Regular-lf-ot1--base.tfm \
tex-UniversalisADFStd-Regular-lf-ot1--lcdfj.tfm \
tex-UniversalisADFStd-Regular-lf-ot1.tfm \
tex-UniversalisADFStd-Regular-lf-ot1.vf \
tex-UniversalisADFStd-Regular-lf-t1--base.tfm \
tex-UniversalisADFStd-Regular-lf-t1--lcdfj.tfm \
tex-UniversalisADFStd-Regular-lf-t1.tfm \
tex-UniversalisADFStd-Regular-lf-t1.vf \
tex-UniversalisADFStd-Regular-lf-ts1--base.tfm \
tex-UniversalisADFStd-Regular-lf-ts1.tfm \
tex-UniversalisADFStd-Regular-lf-ts1.vf \
tex-UniversalisADFStd.sty \
tex-universalis.map \
tex-universalis.sty \
tex-unvsl-fe7xck.enc \
tex-unvsl-qu6a6x.enc \
tex-unvsl-sjpjw4.enc \
tex-unvsl-xtabpf.enc \
texlive-universalis"

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
texlive-scripts \
texlive-scripts-bin \
texlive-universalis-fonts"

inherit rpm
