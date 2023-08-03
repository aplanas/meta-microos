SUMMARY = "Typeset sets of pages upside-down and backwards"
DESCRIPTION = "The rotpages package allows you to format documents where small \
sets of pages are rotated by 180 degrees and rearranged, so \
that they can be read by turning the printed copy upside-down. \
It was developed for collecting exercises and solutions: using \
the package, you can print the exercise text normally and the \
solutions rotated."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn18740"

RPM_NAME = "texlive-rotpages-2023.209.3.0svn18740-54.1.noarch.rpm"
RPM_HASH = "ccc7744f0e2391a2084da0f52adf1e3c94359e62ee2d6ed716dc29a0d736b06adad84741de75edf33338f77ec6919044ce09cd5573689145592960db6a16a464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rotpages.sty \
texlive-rotpages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphics.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
