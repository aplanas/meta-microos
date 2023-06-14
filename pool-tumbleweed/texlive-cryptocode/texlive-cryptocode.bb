SUMMARY = "Typesetting pseudocode, protocols, game-based proofs and black-box reductions in cryptography"
DESCRIPTION = "The cryptocode package provides a set of macros to ease the \
typesetting of pseudocode, algorithms and protocols. In \
addition it comes with a wide range of tools to typeset \
cryptographic papers. This includes simple predefined commands \
for concepts such as a security parameter or advantage terms \
but also flexible and powerful environments to layout \
game-based proofs or black-box reductions."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.44svn60249"

RPM_NAME = "texlive-cryptocode-2023.204.0.0.44svn60249-54.1.noarch.rpm"
RPM_HASH = "41fbb6448ec53d55595b08535c3f3fcca9d82a95d18ee04ede59560f34b795fb20f5a74764e16b44e71f83175e572cfc61a1d47aef371efa49fec14388f4c5d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cryptocode-2018-11-11.sty \
tex-cryptocode-2020-04-24.sty \
tex-cryptocode.sty \
texlive-cryptocode"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-array.sty \
tex-calc.sty \
tex-centernot.sty \
tex-environ.sty \
tex-etex.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-forloop.sty \
tex-ifthen.sty \
tex-mathtools.sty \
tex-pbox.sty \
tex-pgf.sty \
tex-suffix.sty \
tex-tikz.sty \
tex-varwidth.sty \
tex-xargs.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
