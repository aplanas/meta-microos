SUMMARY = "Fixed point arithmetic"
DESCRIPTION = "An extensive collection of arithmetic operations for fixed \
point real numbers of high precision."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1dsvn49719"

RPM_NAME = "texlive-fp-2023.209.2.1dsvn49719-53.1.noarch.rpm"
RPM_HASH = "58ef31be9e54008dd38157189645f4344f64121809ebd2803cf72c4cfdab454be07e35f133dfe49eb4452e23f24642719f4ba344732e0944d5d978181786f19b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-defpattern.sty \
tex-fp-addons.sty \
tex-fp-basic.sty \
tex-fp-eqn.sty \
tex-fp-eval.sty \
tex-fp-exp.sty \
tex-fp-pas.sty \
tex-fp-random.sty \
tex-fp-snap.sty \
tex-fp-trigo.sty \
tex-fp-upn.sty \
tex-fp.sty \
tex-fp.tex \
tex-lfp.sty \
texlive-fp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
