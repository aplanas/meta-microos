SUMMARY = "Tinos fonts with LaTeX support"
DESCRIPTION = "Tinos, designed by Steve Matteson, is an innovative, refreshing \
serif design that is metrically compatible with Times New \
Roman."
LICENSE = "Apache-1.0"

PV = "2023.201.svn64504"

RPM_NAME = "texlive-tinos-2023.201.svn64504-52.1.noarch.rpm"
RPM_HASH = "98c7d836a448f2c71d78b70c12623cba1fa7ff8cbb375f8c03f8bd7c4b496f191049c3d6a2c10636baae06d17b5c8400180ca71a82042e884196888dbf94cefc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LY1Tinos-TLF.fd \
tex-OT1Tinos-TLF.fd \
tex-T1Tinos-TLF.fd \
tex-TS1Tinos-TLF.fd \
tex-Tinos-Bold-tlf-ly1.tfm \
tex-Tinos-Bold-tlf-ot1.tfm \
tex-Tinos-Bold-tlf-t1--base.tfm \
tex-Tinos-Bold-tlf-t1.tfm \
tex-Tinos-Bold-tlf-t1.vf \
tex-Tinos-Bold-tlf-ts1--base.tfm \
tex-Tinos-Bold-tlf-ts1.tfm \
tex-Tinos-Bold-tlf-ts1.vf \
tex-Tinos-BoldItalic-tlf-ly1.tfm \
tex-Tinos-BoldItalic-tlf-ot1.tfm \
tex-Tinos-BoldItalic-tlf-t1--base.tfm \
tex-Tinos-BoldItalic-tlf-t1.tfm \
tex-Tinos-BoldItalic-tlf-t1.vf \
tex-Tinos-BoldItalic-tlf-ts1--base.tfm \
tex-Tinos-BoldItalic-tlf-ts1.tfm \
tex-Tinos-BoldItalic-tlf-ts1.vf \
tex-Tinos-Italic-tlf-ly1.tfm \
tex-Tinos-Italic-tlf-ot1.tfm \
tex-Tinos-Italic-tlf-t1--base.tfm \
tex-Tinos-Italic-tlf-t1.tfm \
tex-Tinos-Italic-tlf-t1.vf \
tex-Tinos-Italic-tlf-ts1--base.tfm \
tex-Tinos-Italic-tlf-ts1.tfm \
tex-Tinos-Italic-tlf-ts1.vf \
tex-Tinos-tlf-ly1.tfm \
tex-Tinos-tlf-ot1.tfm \
tex-Tinos-tlf-t1--base.tfm \
tex-Tinos-tlf-t1.tfm \
tex-Tinos-tlf-t1.vf \
tex-Tinos-tlf-ts1--base.tfm \
tex-Tinos-tlf-ts1.tfm \
tex-Tinos-tlf-ts1.vf \
tex-tinos.map \
tex-tinos.sty \
tex-tns-27astb.enc \
tex-tns-s6t4vy.enc \
tex-tns-xze2cy.enc \
tex-tns-y6kixo.enc \
texlive-tinos"

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
texlive-tinos-fonts"

inherit rpm
