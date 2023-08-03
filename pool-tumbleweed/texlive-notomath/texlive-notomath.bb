SUMMARY = "Math support for Noto fonts"
DESCRIPTION = "Math support via newtxmath for Google's NotoSerif and NotoSans. \
(Regular and Bold weights only.)"
LICENSE = "OFL-1.1"

PV = "2023.209.1.02svn58726"

RPM_NAME = "texlive-notomath-2023.209.1.02svn58726-55.1.noarch.rpm"
RPM_HASH = "1e09c8fc34269cc759866e6945d1e6bd05f9ce07ce930077da868c35425e0cf6388f94124a7972c0cb47eb8166d83b6d061fdadf45d51fd44fcc564d584bd30c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-NotoMath.map \
tex-NotoMathBMI.tfm \
tex-NotoMathBRM.tfm \
tex-NotoMathMI.tfm \
tex-NotoMathRM.tfm \
tex-NotoSansMathBMI.tfm \
tex-NotoSansMathBRM.tfm \
tex-NotoSansMathMI.tfm \
tex-NotoSansMathRM.tfm \
tex-notobmi.tfm \
tex-notobmi.vf \
tex-notobmia.tfm \
tex-notobmia.vf \
tex-notomath.sty \
tex-notomi.tfm \
tex-notomi.vf \
tex-notomia.tfm \
tex-notomia.vf \
tex-notosansbmi.tfm \
tex-notosansbmi.vf \
tex-notosansbmia.tfm \
tex-notosansbmia.vf \
tex-notosansmi.tfm \
tex-notosansmi.vf \
tex-notosansmia.tfm \
tex-notosansmia.vf \
tex-omlnotomi.fd \
tex-omlnotosansmi.fd \
texlive-notomath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontaxes.sty \
tex-fontenc.sty \
tex-mweights.sty \
tex-newtxmath.sty \
tex-noto-mono.sty \
tex-noto-sans.sty \
tex-noto-serif.sty \
tex-stxscr.tfm \
tex-textcomp.sty \
tex-txbmiaSTbb.tfm \
tex-txbmiaX.tfm \
tex-txmiaSTbb.tfm \
tex-txmiaX.tfm \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-notomath-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
