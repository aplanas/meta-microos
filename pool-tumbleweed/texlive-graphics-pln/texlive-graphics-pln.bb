SUMMARY = "LaTeX-style graphics for Plain TeX users"
DESCRIPTION = "The Plain TeX graphics package is mostly a thin shell around \
the LaTeX graphicx and color packages, with support of the \
LaTeX-isms in those packages provided by miniltx (which is the \
largest part of the bundle). The bundle also contains a file \
'picture.tex', which is a wrapper around the autopict.sty, and \
provides the LaTeX picture mode to Plain TeX users."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65187"

RPM_NAME = "texlive-graphics-pln-2023.201.svn65187-53.2.noarch.rpm"
RPM_HASH = "03cbd427781759e43bbe5e7829f24ad19750e559f06d8b6a02049af308276b9392c00aa87d351af53e8c8b2ac4346fe5e46b7873b68b8054f70d188bff583d92"
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
