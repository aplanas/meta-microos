SUMMARY = "Arimo sans serif fonts with LaTeX support"
DESCRIPTION = "The Arimo family, designed by Steve Matteson, is an innovative, \
refreshing sans serif design which is metrically compatible \
with Arial."
LICENSE = "Apache-1.0"

PV = "2023.201.svn64548"

RPM_NAME = "texlive-arimo-2023.201.svn64548-54.1.noarch.rpm"
RPM_HASH = "5376491b27518df62e216aeee15141390aca1ce7db5317113da90bfbbe15e738fbb22a3af2c525d3468c2c286be19053edf31fc6e0ce81b295789479f12588a8"
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
