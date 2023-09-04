SUMMARY = "LaTeX-style graphics for Plain TeX users"
DESCRIPTION = "The Plain TeX graphics package is mostly a thin shell around \
the LaTeX graphicx and color packages, with support of the \
LaTeX-isms in those packages provided by miniltx (which is the \
largest part of the bundle). The bundle also contains a file \
'picture.tex', which is a wrapper around the autopict.sty, and \
provides the LaTeX picture mode to Plain TeX users."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65187"

RPM_NAME = "texlive-graphics-pln-2023.209.svn65187-54.2.noarch.rpm"
RPM_HASH = "92307d7c91cab622f1371a86f72fbeb95a28b6c651b80274cd3e7b63812026c5904e5ed69f3b8d723f7619a0589fdaa73be5dbc6d0e94a288d1640bf860c1d36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autopict.sty \
tex-color.tex \
tex-graphicx.tex \
tex-miniltx.tex \
tex-picture.tex \
tex-psfrag.tex \
texlive-graphics-pln"

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
