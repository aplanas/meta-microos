SUMMARY = "Almendra fonts with LaTeX support"
DESCRIPTION = "This package provides LaTeX, pdfLaTeX, XeLaTeX, and LuaLaTeX \
support for the Almendra family of fonts, designed by Ana \
Sanfelippo. Almendra is a typeface design based on calligraphy. \
Its style is related to the chancery and gothic hands. There \
are regular and bold weights with matching italics. There is \
also a regular-weight small-caps."
LICENSE = "OFL-1.1"

PV = "2023.209.svn64539"

RPM_NAME = "texlive-almendra-2023.209.svn64539-55.1.noarch.rpm"
RPM_HASH = "65c7dec6713f1ad27f8be7ee51dc835670bdbea5f7032217eaca253d314007b3b84d726c56d0cc2b611c1bfdea4ba7932427447b301a7f79697cbc9f00fffad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Almndr-Bold-osf-ly1--base.tfm \
tex-Almndr-Bold-osf-ly1.tfm \
tex-Almndr-Bold-osf-ly1.vf \
tex-Almndr-Bold-osf-ot1--base.tfm \
tex-Almndr-Bold-osf-ot1.tfm \
tex-Almndr-Bold-osf-ot1.vf \
tex-Almndr-Bold-osf-t1--base.tfm \
tex-Almndr-Bold-osf-t1.tfm \
tex-Almndr-Bold-osf-t1.vf \
tex-Almndr-Bold-osf-ts1--base.tfm \
tex-Almndr-Bold-osf-ts1.tfm \
tex-Almndr-Bold-osf-ts1.vf \
tex-Almndr-BoldItalic-osf-ly1--base.tfm \
tex-Almndr-BoldItalic-osf-ly1.tfm \
tex-Almndr-BoldItalic-osf-ly1.vf \
tex-Almndr-BoldItalic-osf-ot1--base.tfm \
tex-Almndr-BoldItalic-osf-ot1.tfm \
tex-Almndr-BoldItalic-osf-ot1.vf \
tex-Almndr-BoldItalic-osf-t1--base.tfm \
tex-Almndr-BoldItalic-osf-t1.tfm \
tex-Almndr-BoldItalic-osf-t1.vf \
tex-Almndr-BoldItalic-osf-ts1--base.tfm \
tex-Almndr-BoldItalic-osf-ts1.tfm \
tex-Almndr-BoldItalic-osf-ts1.vf \
tex-Almndr-Italic-osf-ly1--base.tfm \
tex-Almndr-Italic-osf-ly1.tfm \
tex-Almndr-Italic-osf-ly1.vf \
tex-Almndr-Italic-osf-ot1--base.tfm \
tex-Almndr-Italic-osf-ot1.tfm \
tex-Almndr-Italic-osf-ot1.vf \
tex-Almndr-Italic-osf-t1--base.tfm \
tex-Almndr-Italic-osf-t1.tfm \
tex-Almndr-Italic-osf-t1.vf \
tex-Almndr-Italic-osf-ts1--base.tfm \
tex-Almndr-Italic-osf-ts1.tfm \
tex-Almndr-Italic-osf-ts1.vf \
tex-Almndr-Regular-osf-ly1--base.tfm \
tex-Almndr-Regular-osf-ly1.tfm \
tex-Almndr-Regular-osf-ly1.vf \
tex-Almndr-Regular-osf-ot1--base.tfm \
tex-Almndr-Regular-osf-ot1.tfm \
tex-Almndr-Regular-osf-ot1.vf \
tex-Almndr-Regular-osf-t1--base.tfm \
tex-Almndr-Regular-osf-t1.tfm \
tex-Almndr-Regular-osf-t1.vf \
tex-Almndr-Regular-osf-ts1--base.tfm \
tex-Almndr-Regular-osf-ts1.tfm \
tex-Almndr-Regular-osf-ts1.vf \
tex-AlmndrSC-Regular-osf-sc-ly1--base.tfm \
tex-AlmndrSC-Regular-osf-sc-ly1.tfm \
tex-AlmndrSC-Regular-osf-sc-ly1.vf \
tex-AlmndrSC-Regular-osf-sc-ot1.tfm \
tex-AlmndrSC-Regular-osf-sc-t1--base.tfm \
tex-AlmndrSC-Regular-osf-sc-t1.tfm \
tex-AlmndrSC-Regular-osf-sc-t1.vf \
tex-LY1Almndr-OsF.fd \
tex-OT1Almndr-OsF.fd \
tex-T1Almndr-OsF.fd \
tex-TS1Almndr-OsF.fd \
tex-almendra.map \
tex-almendra.sty \
tex-almndr-2bmcpz.enc \
tex-almndr-aphd5h.enc \
tex-almndr-d2g35l.enc \
tex-almndr-fqyk3x.enc \
tex-almndr-gd2dkq.enc \
tex-almndr-jcmsbq.enc \
tex-almndr-ktaaad.enc \
tex-almndr-ncjtqa.enc \
tex-almndr-piphgo.enc \
tex-almndr-x2ojwl.enc \
tex-almndr-xs7q5m.enc \
tex-almndr-yxs7h5.enc \
tex-almndr-zt62bd.enc \
texlive-almendra"

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
texlive-almendra-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
