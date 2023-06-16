SUMMARY = "Clear Sans fonts with LaTeX support"
DESCRIPTION = "Clear Sans was designed by Daniel Ratighan at Monotype under \
the direction of the User Experience team at Intel's Open \
Source Technology Center. Clear Sans is available in three \
weights (regular, medium, and bold) with corresponding italics, \
plus light and thin upright (without italics). Clear Sans has \
minimized, unambiguous characters and slightly narrow \
proportions, making it ideal for UI design. Its strong, \
recognizable forms avoid distracting ambiguity, making Clear \
Sans comfortable for reading short UI labels and long passages \
in both screen and print. The fonts are available in both \
TrueType and Type 1 formats."
LICENSE = "Apache-1.0"

PV = "2023.201.svn64400"

RPM_NAME = "texlive-clearsans-2023.201.svn64400-53.1.noarch.rpm"
RPM_HASH = "ed4ca7a1e904d6ecc16da800e618ebc5f1ff971492ee743029333036dfd50ab138a473d71c8623af3be54478af233175bce6bfeeb488a029a60c81b880f12fb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ClearSans-Bold-tlf-ly1--base.tfm \
tex-ClearSans-Bold-tlf-ly1.tfm \
tex-ClearSans-Bold-tlf-ly1.vf \
tex-ClearSans-Bold-tlf-ot1.tfm \
tex-ClearSans-Bold-tlf-t1--base.tfm \
tex-ClearSans-Bold-tlf-t1.tfm \
tex-ClearSans-Bold-tlf-t1.vf \
tex-ClearSans-Bold-tlf-ts1--base.tfm \
tex-ClearSans-Bold-tlf-ts1.tfm \
tex-ClearSans-Bold-tlf-ts1.vf \
tex-ClearSans-BoldItalic-tlf-ly1--base.tfm \
tex-ClearSans-BoldItalic-tlf-ly1.tfm \
tex-ClearSans-BoldItalic-tlf-ly1.vf \
tex-ClearSans-BoldItalic-tlf-ot1.tfm \
tex-ClearSans-BoldItalic-tlf-t1--base.tfm \
tex-ClearSans-BoldItalic-tlf-t1.tfm \
tex-ClearSans-BoldItalic-tlf-t1.vf \
tex-ClearSans-BoldItalic-tlf-ts1--base.tfm \
tex-ClearSans-BoldItalic-tlf-ts1.tfm \
tex-ClearSans-BoldItalic-tlf-ts1.vf \
tex-ClearSans-Italic-tlf-ly1--base.tfm \
tex-ClearSans-Italic-tlf-ly1.tfm \
tex-ClearSans-Italic-tlf-ly1.vf \
tex-ClearSans-Italic-tlf-ot1.tfm \
tex-ClearSans-Italic-tlf-t1--base.tfm \
tex-ClearSans-Italic-tlf-t1.tfm \
tex-ClearSans-Italic-tlf-t1.vf \
tex-ClearSans-Italic-tlf-ts1--base.tfm \
tex-ClearSans-Italic-tlf-ts1.tfm \
tex-ClearSans-Italic-tlf-ts1.vf \
tex-ClearSans-Light-tlf-ly1--base.tfm \
tex-ClearSans-Light-tlf-ly1.tfm \
tex-ClearSans-Light-tlf-ly1.vf \
tex-ClearSans-Light-tlf-ot1.tfm \
tex-ClearSans-Light-tlf-t1--base.tfm \
tex-ClearSans-Light-tlf-t1.tfm \
tex-ClearSans-Light-tlf-t1.vf \
tex-ClearSans-Light-tlf-ts1--base.tfm \
tex-ClearSans-Light-tlf-ts1.tfm \
tex-ClearSans-Light-tlf-ts1.vf \
tex-ClearSans-Medium-tlf-ly1--base.tfm \
tex-ClearSans-Medium-tlf-ly1.tfm \
tex-ClearSans-Medium-tlf-ly1.vf \
tex-ClearSans-Medium-tlf-ot1.tfm \
tex-ClearSans-Medium-tlf-t1--base.tfm \
tex-ClearSans-Medium-tlf-t1.tfm \
tex-ClearSans-Medium-tlf-t1.vf \
tex-ClearSans-Medium-tlf-ts1--base.tfm \
tex-ClearSans-Medium-tlf-ts1.tfm \
tex-ClearSans-Medium-tlf-ts1.vf \
tex-ClearSans-MediumItalic-tlf-ly1--base.tfm \
tex-ClearSans-MediumItalic-tlf-ly1.tfm \
tex-ClearSans-MediumItalic-tlf-ly1.vf \
tex-ClearSans-MediumItalic-tlf-ot1.tfm \
tex-ClearSans-MediumItalic-tlf-t1--base.tfm \
tex-ClearSans-MediumItalic-tlf-t1.tfm \
tex-ClearSans-MediumItalic-tlf-t1.vf \
tex-ClearSans-MediumItalic-tlf-ts1--base.tfm \
tex-ClearSans-MediumItalic-tlf-ts1.tfm \
tex-ClearSans-MediumItalic-tlf-ts1.vf \
tex-ClearSans-Thin-tlf-ly1--base.tfm \
tex-ClearSans-Thin-tlf-ly1.tfm \
tex-ClearSans-Thin-tlf-ly1.vf \
tex-ClearSans-Thin-tlf-ot1.tfm \
tex-ClearSans-Thin-tlf-t1--base.tfm \
tex-ClearSans-Thin-tlf-t1.tfm \
tex-ClearSans-Thin-tlf-t1.vf \
tex-ClearSans-Thin-tlf-ts1--base.tfm \
tex-ClearSans-Thin-tlf-ts1.tfm \
tex-ClearSans-Thin-tlf-ts1.vf \
tex-ClearSans-tlf-ly1--base.tfm \
tex-ClearSans-tlf-ly1.tfm \
tex-ClearSans-tlf-ly1.vf \
tex-ClearSans-tlf-ot1.tfm \
tex-ClearSans-tlf-t1--base.tfm \
tex-ClearSans-tlf-t1.tfm \
tex-ClearSans-tlf-t1.vf \
tex-ClearSans-tlf-ts1--base.tfm \
tex-ClearSans-tlf-ts1.tfm \
tex-ClearSans-tlf-ts1.vf \
tex-ClearSans.map \
tex-ClearSans.sty \
tex-LY1ClearSans-TLF.fd \
tex-OT1ClearSans-TLF.fd \
tex-T1ClearSans-TLF.fd \
tex-TS1ClearSans-TLF.fd \
tex-clr-c5eikb.enc \
tex-clr-lz5qp4.enc \
tex-clr-nrghxx.enc \
tex-clr-zxbkm4.enc \
texlive-clearsans"

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
texlive-clearsans-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
