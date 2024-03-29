SUMMARY = "The Gudea font face with support for LaTeX and pdfLaTeX"
DESCRIPTION = "This package provides the Gudea family of fonts designed by \
Agustina Mingote, with support for LaTeX and pdfLaTeX."
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.0.1svn57359"

RPM_NAME = "texlive-gudea-2023.209.0.0.0.1svn57359-54.2.noarch.rpm"
RPM_HASH = "2aa9b4a5a773b912d0eec04ce147b610cc4506610d77d3a65f46b6a748fe6bd2a73d3f249927cb56a114fe0baf363ebf0f03a77beae6692a2f34ddbdcc3f75c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Gudea-Bold-tlf-ly1--base.tfm \
tex-Gudea-Bold-tlf-ly1--lcdfj.tfm \
tex-Gudea-Bold-tlf-ly1.tfm \
tex-Gudea-Bold-tlf-ly1.vf \
tex-Gudea-Bold-tlf-ot1--base.tfm \
tex-Gudea-Bold-tlf-ot1--lcdfj.tfm \
tex-Gudea-Bold-tlf-ot1.tfm \
tex-Gudea-Bold-tlf-ot1.vf \
tex-Gudea-Bold-tlf-t1--base.tfm \
tex-Gudea-Bold-tlf-t1--lcdfj.tfm \
tex-Gudea-Bold-tlf-t1.tfm \
tex-Gudea-Bold-tlf-t1.vf \
tex-Gudea-Bold-tlf-ts1--base.tfm \
tex-Gudea-Bold-tlf-ts1.tfm \
tex-Gudea-Bold-tlf-ts1.vf \
tex-Gudea-Italic-tlf-ly1--base.tfm \
tex-Gudea-Italic-tlf-ly1--lcdfj.tfm \
tex-Gudea-Italic-tlf-ly1.tfm \
tex-Gudea-Italic-tlf-ly1.vf \
tex-Gudea-Italic-tlf-ot1--base.tfm \
tex-Gudea-Italic-tlf-ot1--lcdfj.tfm \
tex-Gudea-Italic-tlf-ot1.tfm \
tex-Gudea-Italic-tlf-ot1.vf \
tex-Gudea-Italic-tlf-t1--base.tfm \
tex-Gudea-Italic-tlf-t1--lcdfj.tfm \
tex-Gudea-Italic-tlf-t1.tfm \
tex-Gudea-Italic-tlf-t1.vf \
tex-Gudea-Italic-tlf-ts1--base.tfm \
tex-Gudea-Italic-tlf-ts1.tfm \
tex-Gudea-Italic-tlf-ts1.vf \
tex-Gudea-tlf-ly1--base.tfm \
tex-Gudea-tlf-ly1--lcdfj.tfm \
tex-Gudea-tlf-ly1.tfm \
tex-Gudea-tlf-ly1.vf \
tex-Gudea-tlf-ot1--base.tfm \
tex-Gudea-tlf-ot1--lcdfj.tfm \
tex-Gudea-tlf-ot1.tfm \
tex-Gudea-tlf-ot1.vf \
tex-Gudea-tlf-t1--base.tfm \
tex-Gudea-tlf-t1--lcdfj.tfm \
tex-Gudea-tlf-t1.tfm \
tex-Gudea-tlf-t1.vf \
tex-Gudea-tlf-ts1--base.tfm \
tex-Gudea-tlf-ts1.tfm \
tex-Gudea-tlf-ts1.vf \
tex-Gudea.map \
tex-Gudea.sty \
tex-LY1Gudea-TLF.fd \
tex-OT1Gudea-TLF.fd \
tex-T1Gudea-TLF.fd \
tex-TS1Gudea-TLF.fd \
tex-a-i65yxe.enc \
tex-a-lksl5v.enc \
tex-a-qnu4g5.enc \
tex-a-ys4752.enc \
texlive-gudea"

RDEPENDS:${PN} += "/usr/bin/sh \
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
texlive-filesystem \
texlive-gudea-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
