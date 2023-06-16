SUMMARY = "A Type 1 font and LaTeX support for Libertinus Math"
DESCRIPTION = "The package provides a Type1 version of Libertinus Math, with a \
number of additions and changes, plus LaTeX support files that \
allow it to serve as a math accompaniment to Libertine under \
LaTeX. In addition, with option sansmath, it can function as a \
standalone math font with sans serif Roman and Greek letters."
LICENSE = "OFL-1.1"

PV = "2023.201.2.0.2svn61751"

RPM_NAME = "texlive-libertinust1math-2023.201.2.0.2svn61751-54.1.noarch.rpm"
RPM_HASH = "4bb6033856e7d7529058007ffa0346600cd7e4ae29dc049067fe73edfba9f905feb37dc5105e9ee7d6dea7fcf9be3f305a385c7efa9fc04faba59631881ac4c4"
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
