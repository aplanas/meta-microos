SUMMARY = "A Type 1 font and LaTeX support for Libertinus Math"
DESCRIPTION = "The package provides a Type1 version of Libertinus Math, with a \
number of additions and changes, plus LaTeX support files that \
allow it to serve as a math accompaniment to Libertine under \
LaTeX. In addition, with option sansmath, it can function as a \
standalone math font with sans serif Roman and Greek letters."
LICENSE = "OFL-1.1"

PV = "2023.209.2.0.2svn61751"

RPM_NAME = "texlive-libertinust1math-2023.209.2.0.2svn61751-55.1.noarch.rpm"
RPM_HASH = "e5a69b4f94d3d3264ed562036982684a61b392b5ce1038332878f5bc370cc673673ebe501602bc6a46397d37f82f9c991f02dc5891d59feebb1b61a5b459e728"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-BDXsfmi-bol.tfm \
tex-BDXsfmi-reg.tfm \
tex-BDXsfmr-bol.tfm \
tex-BDXsfmr-reg.tfm \
tex-libertinust1-mathbb.tfm \
tex-libertinust1-mathex.tfm \
tex-libertinust1-mathit-bold.tfm \
tex-libertinust1-mathit.tfm \
tex-libertinust1-mathrm-bold.tfm \
tex-libertinust1-mathrm.tfm \
tex-libertinust1-mathsf.tfm \
tex-libertinust1-mathsfb.tfm \
tex-libertinust1-mathsfi.tfm \
tex-libertinust1-mathsfit-bold.tfm \
tex-libertinust1-mathsfit-bold.vf \
tex-libertinust1-mathsfit.tfm \
tex-libertinust1-mathsfit.vf \
tex-libertinust1-mathsfrm-bold.tfm \
tex-libertinust1-mathsfrm-bold.vf \
tex-libertinust1-mathsfrm.tfm \
tex-libertinust1-mathsfrm.vf \
tex-libertinust1-mathsym.tfm \
tex-libertinust1math.map \
tex-libertinust1math.sty \
tex-libusBB.enc \
tex-libusBMI.enc \
tex-libusBMR.enc \
tex-libusEX.enc \
tex-libusFRK.enc \
tex-libusMI.enc \
tex-libusMR.enc \
tex-libusSF.enc \
tex-libusSFB.enc \
tex-libusSFI.enc \
tex-libusSYM.enc \
tex-libussfMI.enc \
tex-libussfMR.enc \
tex-ls1libertinust1math.fd \
tex-ls1libertinust1mathbb.fd \
tex-ls1libertinust1mathsf.fd \
tex-ls2libertinust1mathex.fd \
tex-ls2libertinust1mathsym.fd \
tex-ot1libertinust1mathsf.fd \
texlive-libertinust1math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amsthm.sty \
tex-etoolbox.sty \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-libertinust1math-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
