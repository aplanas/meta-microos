SUMMARY = "Lobster Two fonts, with support for all LaTeX engines"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX \
support for the Lobster Two family of fonts, designed by Pablo \
Impallari. This is a family of script fonts with many ligatures \
and terminal forms; for the best results, use XeLaTeX or \
LuaLaTeX. There are two weights and italic variants for both."
LICENSE = "OFL-1.1"

PV = "2023.209.svn64442"

RPM_NAME = "texlive-lobster2-2023.209.svn64442-55.1.noarch.rpm"
RPM_HASH = "4b83f44db613f3c36131a90805ee44e304e03913c7085c04385b82ce382b709794f23e1645e3b4fc0025e8f2137be6dc053900abb6f5a2c4a5525e7c7cc1629d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LY1Lbstr-LF.fd \
tex-Lbstr-Bold-lf-ly1--base.tfm \
tex-Lbstr-Bold-lf-ly1--lcdfj.tfm \
tex-Lbstr-Bold-lf-ly1.tfm \
tex-Lbstr-Bold-lf-ly1.vf \
tex-Lbstr-Bold-lf-ot1--base.tfm \
tex-Lbstr-Bold-lf-ot1--lcdfj.tfm \
tex-Lbstr-Bold-lf-ot1.tfm \
tex-Lbstr-Bold-lf-ot1.vf \
tex-Lbstr-Bold-lf-t1--base.tfm \
tex-Lbstr-Bold-lf-t1--lcdfj.tfm \
tex-Lbstr-Bold-lf-t1.tfm \
tex-Lbstr-Bold-lf-t1.vf \
tex-Lbstr-Bold-lf-ts1--base.tfm \
tex-Lbstr-Bold-lf-ts1.tfm \
tex-Lbstr-Bold-lf-ts1.vf \
tex-Lbstr-BoldItalic-lf-ly1--base.tfm \
tex-Lbstr-BoldItalic-lf-ly1--lcdfj.tfm \
tex-Lbstr-BoldItalic-lf-ly1.tfm \
tex-Lbstr-BoldItalic-lf-ly1.vf \
tex-Lbstr-BoldItalic-lf-ot1--base.tfm \
tex-Lbstr-BoldItalic-lf-ot1--lcdfj.tfm \
tex-Lbstr-BoldItalic-lf-ot1.tfm \
tex-Lbstr-BoldItalic-lf-ot1.vf \
tex-Lbstr-BoldItalic-lf-t1--base.tfm \
tex-Lbstr-BoldItalic-lf-t1--lcdfj.tfm \
tex-Lbstr-BoldItalic-lf-t1.tfm \
tex-Lbstr-BoldItalic-lf-t1.vf \
tex-Lbstr-BoldItalic-lf-ts1--base.tfm \
tex-Lbstr-BoldItalic-lf-ts1.tfm \
tex-Lbstr-BoldItalic-lf-ts1.vf \
tex-Lbstr-Italic-lf-ly1--base.tfm \
tex-Lbstr-Italic-lf-ly1--lcdfj.tfm \
tex-Lbstr-Italic-lf-ly1.tfm \
tex-Lbstr-Italic-lf-ly1.vf \
tex-Lbstr-Italic-lf-ot1--base.tfm \
tex-Lbstr-Italic-lf-ot1--lcdfj.tfm \
tex-Lbstr-Italic-lf-ot1.tfm \
tex-Lbstr-Italic-lf-ot1.vf \
tex-Lbstr-Italic-lf-t1--base.tfm \
tex-Lbstr-Italic-lf-t1--lcdfj.tfm \
tex-Lbstr-Italic-lf-t1.tfm \
tex-Lbstr-Italic-lf-t1.vf \
tex-Lbstr-Italic-lf-ts1--base.tfm \
tex-Lbstr-Italic-lf-ts1.tfm \
tex-Lbstr-Italic-lf-ts1.vf \
tex-Lbstr-Regular-lf-ly1--base.tfm \
tex-Lbstr-Regular-lf-ly1--lcdfj.tfm \
tex-Lbstr-Regular-lf-ly1.tfm \
tex-Lbstr-Regular-lf-ly1.vf \
tex-Lbstr-Regular-lf-ot1--base.tfm \
tex-Lbstr-Regular-lf-ot1--lcdfj.tfm \
tex-Lbstr-Regular-lf-ot1.tfm \
tex-Lbstr-Regular-lf-ot1.vf \
tex-Lbstr-Regular-lf-t1--base.tfm \
tex-Lbstr-Regular-lf-t1--lcdfj.tfm \
tex-Lbstr-Regular-lf-t1.tfm \
tex-Lbstr-Regular-lf-t1.vf \
tex-Lbstr-Regular-lf-ts1--base.tfm \
tex-Lbstr-Regular-lf-ts1.tfm \
tex-Lbstr-Regular-lf-ts1.vf \
tex-LobsterTwo.map \
tex-LobsterTwo.sty \
tex-OT1Lbstr-LF.fd \
tex-T1Lbstr-LF.fd \
tex-TS1Lbstr-LF.fd \
tex-lbstr-2rydtx.enc \
tex-lbstr-bucufw.enc \
tex-lbstr-pvoz5h.enc \
tex-lbstr-t7yaon.enc \
texlive-lobster2"

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
texlive-lobster2-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
