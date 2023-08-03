SUMMARY = "Typesetting pseudocode, protocols, game-based proofs and black-box reductions in cryptography"
DESCRIPTION = "The cryptocode package provides a set of macros to ease the \
typesetting of pseudocode, algorithms and protocols. In \
addition it comes with a wide range of tools to typeset \
cryptographic papers. This includes simple predefined commands \
for concepts such as a security parameter or advantage terms \
but also flexible and powerful environments to layout \
game-based proofs or black-box reductions."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.44svn60249"

RPM_NAME = "texlive-cryptocode-2023.209.0.0.44svn60249-55.1.noarch.rpm"
RPM_HASH = "503b09fe2a91255fd84111118d601bed88eb23eec911d3db07ac6cbed78e06b8a33ba085725f76e08044b92fc687a467c1e51bbad36257a0c13dc7c66af04c9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cryptocode-2018-11-11.sty \
tex-cryptocode-2020-04-24.sty \
tex-cryptocode.sty \
texlive-cryptocode"

RDEPENDS:${PN} += "/usr/bin/sh \
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
