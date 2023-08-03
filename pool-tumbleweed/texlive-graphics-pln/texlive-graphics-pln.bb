SUMMARY = "LaTeX-style graphics for Plain TeX users"
DESCRIPTION = "The Plain TeX graphics package is mostly a thin shell around \
the LaTeX graphicx and color packages, with support of the \
LaTeX-isms in those packages provided by miniltx (which is the \
largest part of the bundle). The bundle also contains a file \
'picture.tex', which is a wrapper around the autopict.sty, and \
provides the LaTeX picture mode to Plain TeX users."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65187"

RPM_NAME = "texlive-graphics-pln-2023.209.svn65187-54.1.noarch.rpm"
RPM_HASH = "2d9ad733f2cd9251547e69f5c86369d99792cd0b623b50b6bb7b7e033a566f1aa24c248205fc813c8af5bb67a3c75181b346226aafd7f2be0efaa6f8240a7775"
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
