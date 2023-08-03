SUMMARY = "Arimo sans serif fonts with LaTeX support"
DESCRIPTION = "The Arimo family, designed by Steve Matteson, is an innovative, \
refreshing sans serif design which is metrically compatible \
with Arial."
LICENSE = "Apache-1.0"

PV = "2023.209.svn64548"

RPM_NAME = "texlive-arimo-2023.209.svn64548-55.1.noarch.rpm"
RPM_HASH = "c4324bc0ef6e1d2251a7a064574f4b015c18b8d41f48a4daadcc063efd8bccdd481e5b4fb72f9acdbc9eb6689736a5b9f08dc08d78c835ef915db712e873f2c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Arimo-Bold-tlf-ly1.tfm \
tex-Arimo-Bold-tlf-ot1.tfm \
tex-Arimo-Bold-tlf-t1--base.tfm \
tex-Arimo-Bold-tlf-t1.tfm \
tex-Arimo-Bold-tlf-t1.vf \
tex-Arimo-Bold-tlf-ts1--base.tfm \
tex-Arimo-Bold-tlf-ts1.tfm \
tex-Arimo-Bold-tlf-ts1.vf \
tex-Arimo-BoldItalic-tlf-ly1.tfm \
tex-Arimo-BoldItalic-tlf-ot1.tfm \
tex-Arimo-BoldItalic-tlf-t1--base.tfm \
tex-Arimo-BoldItalic-tlf-t1.tfm \
tex-Arimo-BoldItalic-tlf-t1.vf \
tex-Arimo-BoldItalic-tlf-ts1--base.tfm \
tex-Arimo-BoldItalic-tlf-ts1.tfm \
tex-Arimo-BoldItalic-tlf-ts1.vf \
tex-Arimo-Italic-tlf-ly1.tfm \
tex-Arimo-Italic-tlf-ot1.tfm \
tex-Arimo-Italic-tlf-t1--base.tfm \
tex-Arimo-Italic-tlf-t1.tfm \
tex-Arimo-Italic-tlf-t1.vf \
tex-Arimo-Italic-tlf-ts1--base.tfm \
tex-Arimo-Italic-tlf-ts1.tfm \
tex-Arimo-Italic-tlf-ts1.vf \
tex-Arimo-tlf-ly1.tfm \
tex-Arimo-tlf-ot1.tfm \
tex-Arimo-tlf-t1--base.tfm \
tex-Arimo-tlf-t1.tfm \
tex-Arimo-tlf-t1.vf \
tex-Arimo-tlf-ts1--base.tfm \
tex-Arimo-tlf-ts1.tfm \
tex-Arimo-tlf-ts1.vf \
tex-LY1Arimo-TLF.fd \
tex-OT1Arimo-TLF.fd \
tex-T1Arimo-TLF.fd \
tex-TS1Arimo-TLF.fd \
tex-arimo.map \
tex-arimo.sty \
tex-arm-7miqnq.enc \
tex-arm-c3z4r2.enc \
tex-arm-f4duzd.enc \
tex-arm-l3opzb.enc \
texlive-arimo"

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
texlive-arimo-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
