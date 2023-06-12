SUMMARY = "Math support for Noto fonts"
DESCRIPTION = "Math support via newtxmath for Google's NotoSerif and NotoSans. \
(Regular and Bold weights only.)"
LICENSE = "OFL-1.1"

PV = "2023.201.1.02svn58726"

RPM_NAME = "texlive-notomath-2023.201.1.02svn58726-54.1.noarch.rpm"
RPM_HASH = "2d5a851ba8245e1478c2869f977887e3e540c846aab673ff02ee36d38991d1189808649114586297035a436c5e5052c7d1e93511cadbbb384b82850b7e1ee295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(NotoMath.map) \
tex(NotoMathBMI.tfm) \
tex(NotoMathBRM.tfm) \
tex(NotoMathMI.tfm) \
tex(NotoMathRM.tfm) \
tex(NotoSansMathBMI.tfm) \
tex(NotoSansMathBRM.tfm) \
tex(NotoSansMathMI.tfm) \
tex(NotoSansMathRM.tfm) \
tex(notobmi.tfm) \
tex(notobmi.vf) \
tex(notobmia.tfm) \
tex(notobmia.vf) \
tex(notomath.sty) \
tex(notomi.tfm) \
tex(notomi.vf) \
tex(notomia.tfm) \
tex(notomia.vf) \
tex(notosansbmi.tfm) \
tex(notosansbmi.vf) \
tex(notosansbmia.tfm) \
tex(notosansbmia.vf) \
tex(notosansmi.tfm) \
tex(notosansmi.vf) \
tex(notosansmia.tfm) \
tex(notosansmia.vf) \
tex(omlnotomi.fd) \
tex(omlnotosansmi.fd) \
texlive-notomath"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontaxes.sty) \
tex(fontenc.sty) \
tex(mweights.sty) \
tex(newtxmath.sty) \
tex(noto-mono.sty) \
tex(noto-sans.sty) \
tex(noto-serif.sty) \
tex(stxscr.tfm) \
tex(textcomp.sty) \
tex(txbmiaSTbb.tfm) \
tex(txbmiaX.tfm) \
tex(txmiaSTbb.tfm) \
tex(txmiaX.tfm) \
tex(updmap.cfg) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-notomath-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
