SUMMARY = "The Cascadia Code font with support for LaTeX and pdfLaTeX"
DESCRIPTION = "Cascadia Code is a monospaced font by Microsoft. This package \
provides the Cascadia Code family of fonts with support for \
LaTeX and pdfLaTeX. Adding \\usepackage{cascadia-code} to the \
preamble of your document will activate Cascadia Code as the \
typewriter font (\\ttdefault)."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.0.1svn57478"

RPM_NAME = "texlive-cascadia-code-2023.201.0.0.0.1svn57478-52.1.noarch.rpm"
RPM_HASH = "54b1250addac9aa147f894135ae27e531d28a1a6551bafcf19e5ccb0d1ebc914054dee6860a0cdb8efa2425173841418c83a07c94beda97871f89b4795eb5cc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-CascadiaCod3-Bold-sup-ly1--base.tfm \
tex-CascadiaCod3-Bold-sup-ly1.tfm \
tex-CascadiaCod3-Bold-sup-ly1.vf \
tex-CascadiaCod3-Bold-sup-ot1.tfm \
tex-CascadiaCod3-Bold-sup-t1--base.tfm \
tex-CascadiaCod3-Bold-sup-t1.tfm \
tex-CascadiaCod3-Bold-sup-t1.vf \
tex-CascadiaCod3-Bold-tlf-ly1--base.tfm \
tex-CascadiaCod3-Bold-tlf-ly1.tfm \
tex-CascadiaCod3-Bold-tlf-ly1.vf \
tex-CascadiaCod3-Bold-tlf-ot1.tfm \
tex-CascadiaCod3-Bold-tlf-t1--base.tfm \
tex-CascadiaCod3-Bold-tlf-t1.tfm \
tex-CascadiaCod3-Bold-tlf-t1.vf \
tex-CascadiaCod3-Bold-tlf-ts1--base.tfm \
tex-CascadiaCod3-Bold-tlf-ts1.tfm \
tex-CascadiaCod3-Bold-tlf-ts1.vf \
tex-CascadiaCod3-ExtraLight-sup-ly1--base.tfm \
tex-CascadiaCod3-ExtraLight-sup-ly1.tfm \
tex-CascadiaCod3-ExtraLight-sup-ly1.vf \
tex-CascadiaCod3-ExtraLight-sup-ot1.tfm \
tex-CascadiaCod3-ExtraLight-sup-t1--base.tfm \
tex-CascadiaCod3-ExtraLight-sup-t1.tfm \
tex-CascadiaCod3-ExtraLight-sup-t1.vf \
tex-CascadiaCod3-ExtraLight-tlf-ly1--base.tfm \
tex-CascadiaCod3-ExtraLight-tlf-ly1.tfm \
tex-CascadiaCod3-ExtraLight-tlf-ly1.vf \
tex-CascadiaCod3-ExtraLight-tlf-ot1.tfm \
tex-CascadiaCod3-ExtraLight-tlf-t1--base.tfm \
tex-CascadiaCod3-ExtraLight-tlf-t1.tfm \
tex-CascadiaCod3-ExtraLight-tlf-t1.vf \
tex-CascadiaCod3-ExtraLight-tlf-ts1--base.tfm \
tex-CascadiaCod3-ExtraLight-tlf-ts1.tfm \
tex-CascadiaCod3-ExtraLight-tlf-ts1.vf \
tex-CascadiaCod3-Light-sup-ly1--base.tfm \
tex-CascadiaCod3-Light-sup-ly1.tfm \
tex-CascadiaCod3-Light-sup-ly1.vf \
tex-CascadiaCod3-Light-sup-ot1.tfm \
tex-CascadiaCod3-Light-sup-t1--base.tfm \
tex-CascadiaCod3-Light-sup-t1.tfm \
tex-CascadiaCod3-Light-sup-t1.vf \
tex-CascadiaCod3-Light-tlf-ly1--base.tfm \
tex-CascadiaCod3-Light-tlf-ly1.tfm \
tex-CascadiaCod3-Light-tlf-ly1.vf \
tex-CascadiaCod3-Light-tlf-ot1.tfm \
tex-CascadiaCod3-Light-tlf-t1--base.tfm \
tex-CascadiaCod3-Light-tlf-t1.tfm \
tex-CascadiaCod3-Light-tlf-t1.vf \
tex-CascadiaCod3-Light-tlf-ts1--base.tfm \
tex-CascadiaCod3-Light-tlf-ts1.tfm \
tex-CascadiaCod3-Light-tlf-ts1.vf \
tex-CascadiaCod3-Regular-sup-ly1--base.tfm \
tex-CascadiaCod3-Regular-sup-ly1.tfm \
tex-CascadiaCod3-Regular-sup-ly1.vf \
tex-CascadiaCod3-Regular-sup-ot1.tfm \
tex-CascadiaCod3-Regular-sup-t1--base.tfm \
tex-CascadiaCod3-Regular-sup-t1.tfm \
tex-CascadiaCod3-Regular-sup-t1.vf \
tex-CascadiaCod3-Regular-tlf-ly1--base.tfm \
tex-CascadiaCod3-Regular-tlf-ly1.tfm \
tex-CascadiaCod3-Regular-tlf-ly1.vf \
tex-CascadiaCod3-Regular-tlf-ot1.tfm \
tex-CascadiaCod3-Regular-tlf-t1--base.tfm \
tex-CascadiaCod3-Regular-tlf-t1.tfm \
tex-CascadiaCod3-Regular-tlf-t1.vf \
tex-CascadiaCod3-Regular-tlf-ts1--base.tfm \
tex-CascadiaCod3-Regular-tlf-ts1.tfm \
tex-CascadiaCod3-Regular-tlf-ts1.vf \
tex-CascadiaCod3-SemiBold-sup-ly1--base.tfm \
tex-CascadiaCod3-SemiBold-sup-ly1.tfm \
tex-CascadiaCod3-SemiBold-sup-ly1.vf \
tex-CascadiaCod3-SemiBold-sup-ot1.tfm \
tex-CascadiaCod3-SemiBold-sup-t1--base.tfm \
tex-CascadiaCod3-SemiBold-sup-t1.tfm \
tex-CascadiaCod3-SemiBold-sup-t1.vf \
tex-CascadiaCod3-SemiBold-tlf-ly1--base.tfm \
tex-CascadiaCod3-SemiBold-tlf-ly1.tfm \
tex-CascadiaCod3-SemiBold-tlf-ly1.vf \
tex-CascadiaCod3-SemiBold-tlf-ot1.tfm \
tex-CascadiaCod3-SemiBold-tlf-t1--base.tfm \
tex-CascadiaCod3-SemiBold-tlf-t1.tfm \
tex-CascadiaCod3-SemiBold-tlf-t1.vf \
tex-CascadiaCod3-SemiBold-tlf-ts1--base.tfm \
tex-CascadiaCod3-SemiBold-tlf-ts1.tfm \
tex-CascadiaCod3-SemiBold-tlf-ts1.vf \
tex-CascadiaCod3-SemiLight-sup-ly1--base.tfm \
tex-CascadiaCod3-SemiLight-sup-ly1.tfm \
tex-CascadiaCod3-SemiLight-sup-ly1.vf \
tex-CascadiaCod3-SemiLight-sup-ot1.tfm \
tex-CascadiaCod3-SemiLight-sup-t1--base.tfm \
tex-CascadiaCod3-SemiLight-sup-t1.tfm \
tex-CascadiaCod3-SemiLight-sup-t1.vf \
tex-CascadiaCod3-SemiLight-tlf-ly1--base.tfm \
tex-CascadiaCod3-SemiLight-tlf-ly1.tfm \
tex-CascadiaCod3-SemiLight-tlf-ly1.vf \
tex-CascadiaCod3-SemiLight-tlf-ot1.tfm \
tex-CascadiaCod3-SemiLight-tlf-t1--base.tfm \
tex-CascadiaCod3-SemiLight-tlf-t1.tfm \
tex-CascadiaCod3-SemiLight-tlf-t1.vf \
tex-CascadiaCod3-SemiLight-tlf-ts1--base.tfm \
tex-CascadiaCod3-SemiLight-tlf-ts1.tfm \
tex-CascadiaCod3-SemiLight-tlf-ts1.vf \
tex-CascadiaCodThree.map \
tex-LY1CascadiaCodThree-Sup.fd \
tex-LY1CascadiaCodThree-TLF.fd \
tex-OT1CascadiaCodThree-Sup.fd \
tex-OT1CascadiaCodThree-TLF.fd \
tex-T1CascadiaCodThree-Sup.fd \
tex-T1CascadiaCodThree-TLF.fd \
tex-TS1CascadiaCodThree-TLF.fd \
tex-a-5rnmoj.enc \
tex-a-i3ioen.enc \
tex-a-lzhlbi.enc \
tex-a-r2ngzv.enc \
tex-a-rzdm5y.enc \
tex-a-vqpkf5.enc \
tex-a-zrxj4s.enc \
tex-cascadia-code.sty \
texlive-cascadia-code"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontaxes.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-mweights.sty \
tex-textcomp.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-cascadia-code-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
