SUMMARY = "Forum fonts with LaTeX support"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX and LuaLaTeX \
support for the Forum font, designed by Denis Masharov. Forum \
has antique, classic 'Roman' proportions. It can be used to set \
body texts and works well in titles and headlines too. It is \
truly multilingual, with glyphs for Central and Eastern Europe, \
Baltics, Cyrillic and Asian Cyrillic communities. There is \
currently just a regular weight and an artificially emboldened \
bold."
LICENSE = "OFL-1.1"

PV = "2023.201.svn64566"

RPM_NAME = "texlive-forum-2023.201.svn64566-52.1.noarch.rpm"
RPM_HASH = "cb5932e4612a430f864f1dede51f16e73dd8777b025c68788dda8a8d1c097e931096d61501c9e589df7090b2e9d2f88f86a4f93fe4bdd19ff9baae64e708ca65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Frm-Bold-lf-ly1--base.tfm \
tex-Frm-Bold-lf-ly1--lcdfj.tfm \
tex-Frm-Bold-lf-ly1.tfm \
tex-Frm-Bold-lf-ly1.vf \
tex-Frm-Bold-lf-ot1--base.tfm \
tex-Frm-Bold-lf-ot1--lcdfj.tfm \
tex-Frm-Bold-lf-ot1.tfm \
tex-Frm-Bold-lf-ot1.vf \
tex-Frm-Bold-lf-t1--base.tfm \
tex-Frm-Bold-lf-t1--lcdfj.tfm \
tex-Frm-Bold-lf-t1.tfm \
tex-Frm-Bold-lf-t1.vf \
tex-Frm-Bold-lf-t2a--base.tfm \
tex-Frm-Bold-lf-t2a--lcdfj.tfm \
tex-Frm-Bold-lf-t2a.tfm \
tex-Frm-Bold-lf-t2a.vf \
tex-Frm-Bold-lf-t2b--base.tfm \
tex-Frm-Bold-lf-t2b--lcdfj.tfm \
tex-Frm-Bold-lf-t2b.tfm \
tex-Frm-Bold-lf-t2b.vf \
tex-Frm-Bold-lf-t2c--base.tfm \
tex-Frm-Bold-lf-t2c--lcdfj.tfm \
tex-Frm-Bold-lf-t2c.tfm \
tex-Frm-Bold-lf-t2c.vf \
tex-Frm-Bold-lf-ts1--base.tfm \
tex-Frm-Bold-lf-ts1.tfm \
tex-Frm-Bold-lf-ts1.vf \
tex-Frm-lf-ly1--base.tfm \
tex-Frm-lf-ly1--lcdfj.tfm \
tex-Frm-lf-ly1.tfm \
tex-Frm-lf-ly1.vf \
tex-Frm-lf-ot1--base.tfm \
tex-Frm-lf-ot1--lcdfj.tfm \
tex-Frm-lf-ot1.tfm \
tex-Frm-lf-ot1.vf \
tex-Frm-lf-t1--base.tfm \
tex-Frm-lf-t1--lcdfj.tfm \
tex-Frm-lf-t1.tfm \
tex-Frm-lf-t1.vf \
tex-Frm-lf-t2a--base.tfm \
tex-Frm-lf-t2a--lcdfj.tfm \
tex-Frm-lf-t2a.tfm \
tex-Frm-lf-t2a.vf \
tex-Frm-lf-t2b--base.tfm \
tex-Frm-lf-t2b--lcdfj.tfm \
tex-Frm-lf-t2b.tfm \
tex-Frm-lf-t2b.vf \
tex-Frm-lf-t2c--base.tfm \
tex-Frm-lf-t2c--lcdfj.tfm \
tex-Frm-lf-t2c.tfm \
tex-Frm-lf-t2c.vf \
tex-Frm-lf-ts1--base.tfm \
tex-Frm-lf-ts1.tfm \
tex-Frm-lf-ts1.vf \
tex-LY1Frm-LF.fd \
tex-OT1Frm-LF.fd \
tex-T1Frm-LF.fd \
tex-T2AFrm-LF.fd \
tex-T2BFrm-LF.fd \
tex-T2CFrm-LF.fd \
tex-TS1Frm-LF.fd \
tex-forum.map \
tex-forum.sty \
tex-frm-acf3pt.enc \
tex-frm-b5i5mx.enc \
tex-frm-brq6mf.enc \
tex-frm-e2otk2.enc \
tex-frm-fx2ufv.enc \
tex-frm-jsuphk.enc \
tex-frm-smvvub.enc \
tex-frm-ylkcu6.enc \
texlive-forum"

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
texlive-forum-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
