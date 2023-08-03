SUMMARY = "Courier 10 Pitch BT with LaTeX support"
DESCRIPTION = "This is the font Courier 10 Pitch BT, with LaTeX support and an \
OpenType conversion as well."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55436"

RPM_NAME = "texlive-courierten-2023.209.svn55436-55.1.noarch.rpm"
RPM_HASH = "a9522df494941f129b361414f913435a4beca4a678397d262cd41fdfbcf965efed7ae0cf0813ea2e6d4a940b901557d7fddc4ba0748d4867e89daa93bb8a73ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Courier10PitchBT-Bold-tlf-ly1--base.tfm \
tex-Courier10PitchBT-Bold-tlf-ly1--lcdfj.tfm \
tex-Courier10PitchBT-Bold-tlf-ly1.tfm \
tex-Courier10PitchBT-Bold-tlf-ly1.vf \
tex-Courier10PitchBT-Bold-tlf-ot1--base.tfm \
tex-Courier10PitchBT-Bold-tlf-ot1--lcdfj.tfm \
tex-Courier10PitchBT-Bold-tlf-ot1.tfm \
tex-Courier10PitchBT-Bold-tlf-ot1.vf \
tex-Courier10PitchBT-Bold-tlf-t1--base.tfm \
tex-Courier10PitchBT-Bold-tlf-t1--lcdfj.tfm \
tex-Courier10PitchBT-Bold-tlf-t1.tfm \
tex-Courier10PitchBT-Bold-tlf-t1.vf \
tex-Courier10PitchBT-Bold-tlf-ts1--base.tfm \
tex-Courier10PitchBT-Bold-tlf-ts1.tfm \
tex-Courier10PitchBT-Bold-tlf-ts1.vf \
tex-Courier10PitchBT-BoldItalic-tlf-ly1--base.tfm \
tex-Courier10PitchBT-BoldItalic-tlf-ly1--lcdfj.tfm \
tex-Courier10PitchBT-BoldItalic-tlf-ly1.tfm \
tex-Courier10PitchBT-BoldItalic-tlf-ly1.vf \
tex-Courier10PitchBT-BoldItalic-tlf-ot1--base.tfm \
tex-Courier10PitchBT-BoldItalic-tlf-ot1--lcdfj.tfm \
tex-Courier10PitchBT-BoldItalic-tlf-ot1.tfm \
tex-Courier10PitchBT-BoldItalic-tlf-ot1.vf \
tex-Courier10PitchBT-BoldItalic-tlf-t1--base.tfm \
tex-Courier10PitchBT-BoldItalic-tlf-t1--lcdfj.tfm \
tex-Courier10PitchBT-BoldItalic-tlf-t1.tfm \
tex-Courier10PitchBT-BoldItalic-tlf-t1.vf \
tex-Courier10PitchBT-BoldItalic-tlf-ts1--base.tfm \
tex-Courier10PitchBT-BoldItalic-tlf-ts1.tfm \
tex-Courier10PitchBT-BoldItalic-tlf-ts1.vf \
tex-Courier10PitchBT-Italic-tlf-ly1--base.tfm \
tex-Courier10PitchBT-Italic-tlf-ly1--lcdfj.tfm \
tex-Courier10PitchBT-Italic-tlf-ly1.tfm \
tex-Courier10PitchBT-Italic-tlf-ly1.vf \
tex-Courier10PitchBT-Italic-tlf-ot1--base.tfm \
tex-Courier10PitchBT-Italic-tlf-ot1--lcdfj.tfm \
tex-Courier10PitchBT-Italic-tlf-ot1.tfm \
tex-Courier10PitchBT-Italic-tlf-ot1.vf \
tex-Courier10PitchBT-Italic-tlf-t1--base.tfm \
tex-Courier10PitchBT-Italic-tlf-t1--lcdfj.tfm \
tex-Courier10PitchBT-Italic-tlf-t1.tfm \
tex-Courier10PitchBT-Italic-tlf-t1.vf \
tex-Courier10PitchBT-Italic-tlf-ts1--base.tfm \
tex-Courier10PitchBT-Italic-tlf-ts1.tfm \
tex-Courier10PitchBT-Italic-tlf-ts1.vf \
tex-Courier10PitchBT-Roman-tlf-ly1--base.tfm \
tex-Courier10PitchBT-Roman-tlf-ly1--lcdfj.tfm \
tex-Courier10PitchBT-Roman-tlf-ly1.tfm \
tex-Courier10PitchBT-Roman-tlf-ly1.vf \
tex-Courier10PitchBT-Roman-tlf-ot1--base.tfm \
tex-Courier10PitchBT-Roman-tlf-ot1--lcdfj.tfm \
tex-Courier10PitchBT-Roman-tlf-ot1.tfm \
tex-Courier10PitchBT-Roman-tlf-ot1.vf \
tex-Courier10PitchBT-Roman-tlf-t1--base.tfm \
tex-Courier10PitchBT-Roman-tlf-t1--lcdfj.tfm \
tex-Courier10PitchBT-Roman-tlf-t1.tfm \
tex-Courier10PitchBT-Roman-tlf-t1.vf \
tex-Courier10PitchBT-Roman-tlf-ts1--base.tfm \
tex-Courier10PitchBT-Roman-tlf-ts1.tfm \
tex-Courier10PitchBT-Roman-tlf-ts1.vf \
tex-CourierOneZeroPitch.map \
tex-LY1CourierOneZeroPitch-TLF.fd \
tex-OT1CourierOneZeroPitch-TLF.fd \
tex-T1CourierOneZeroPitch-TLF.fd \
tex-TS1CourierOneZeroPitch-TLF.fd \
tex-a-2hg32y.enc \
tex-a-5k4rzj.enc \
tex-a-keoqme.enc \
tex-a-n2okah.enc \
tex-courierten.sty \
texlive-courierten"

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
texlive-courierten-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
