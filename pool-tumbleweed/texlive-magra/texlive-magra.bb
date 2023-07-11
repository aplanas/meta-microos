SUMMARY = "The Magra font face with support for LaTeX and pdfLaTeX"
DESCRIPTION = "This package provides the Magra family of fonts designed by \
FontFuror, with support for LaTeX and pdfLaTeX."
LICENSE = "OFL-1.1"

PV = "2023.208.0.0.0.1svn57373"

RPM_NAME = "texlive-magra-2023.208.0.0.0.1svn57373-53.1.noarch.rpm"
RPM_HASH = "bad532125741f3e4a6f1f085fb95f7898538cafe837f5c4dbf8bad51662f634225250fec242ebcd07419247f3b861833de97af1b0748f29a7b6ab9c9d1614999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LY1Magra-TLF.fd \
tex-Magra-Bold-tlf-ly1--base.tfm \
tex-Magra-Bold-tlf-ly1.tfm \
tex-Magra-Bold-tlf-ly1.vf \
tex-Magra-Bold-tlf-ot1.tfm \
tex-Magra-Bold-tlf-t1--base.tfm \
tex-Magra-Bold-tlf-t1.tfm \
tex-Magra-Bold-tlf-t1.vf \
tex-Magra-Bold-tlf-ts1--base.tfm \
tex-Magra-Bold-tlf-ts1.tfm \
tex-Magra-Bold-tlf-ts1.vf \
tex-Magra-tlf-ly1--base.tfm \
tex-Magra-tlf-ly1.tfm \
tex-Magra-tlf-ly1.vf \
tex-Magra-tlf-ot1.tfm \
tex-Magra-tlf-t1--base.tfm \
tex-Magra-tlf-t1.tfm \
tex-Magra-tlf-t1.vf \
tex-Magra-tlf-ts1--base.tfm \
tex-Magra-tlf-ts1.tfm \
tex-Magra-tlf-ts1.vf \
tex-Magra.map \
tex-Magra.sty \
tex-OT1Magra-TLF.fd \
tex-T1Magra-TLF.fd \
tex-TS1Magra-TLF.fd \
tex-a-dip3eq.enc \
tex-a-jqnft2.enc \
tex-a-radyzq.enc \
tex-a-va7yvq.enc \
texlive-magra"

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
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-magra-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
