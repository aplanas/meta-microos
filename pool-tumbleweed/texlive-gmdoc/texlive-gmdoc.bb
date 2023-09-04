SUMMARY = "Documentation of LaTeX packages"
DESCRIPTION = "A LaTeX package and an example class for documenting (La)TeX \
packages, document classes, .dtx etc., providing hyperlinks. \
The package is believed to be compatible with doc and permits \
minimal markup of code (the macrocode environment is no longer \
necessary). The package provides automatic detection of \
definitions (detecting such things as \\def, \\newcommand, \
\\DeclareOption etc.). The package needs hyperref and the \
author's three 'basic' packages: gmutils, gmverb and gmiflink. \
As a bonus (and as an example of doc compatibility) driver \
files are provided that may be used to typeset the LaTeX Base."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.993svn21292"

RPM_NAME = "texlive-gmdoc-2023.209.0.0.993svn21292-54.2.noarch.rpm"
RPM_HASH = "c71a7aaf21c970cfc80894076ccdccdfc4d9026fe4eb6ec8d03f5e4c21d23b1559104436ebdc04861c510daacc6835bd1da0db683b905448abb12195de02b4c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmdoc.sty \
tex-gmdocc.cls \
tex-gmoldcomm.sty \
texlive-gmdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-article.cls \
tex-fontenc.sty \
tex-geometry.sty \
tex-gmiflink.sty \
tex-gmutils.sty \
tex-gmverb.sty \
tex-lmodern.sty \
tex-makeidx.sty \
tex-multicol.sty \
tex-tikz.sty \
tex-trace.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
