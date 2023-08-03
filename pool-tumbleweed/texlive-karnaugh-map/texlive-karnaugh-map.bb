SUMMARY = "LaTeX package for drawing karnaugh maps with up to 6 variables"
DESCRIPTION = "This package draws karnaugh maps with 2, 3, 4, 5, and 6 \
variables. It also contains commands for filling the karnaugh \
map with terms semi-automatically or manually. Last but not \
least it contains commands for drawing implicants on top of the \
map. This package depends on the keyval, kvoptions, TikZ, \
xparse, and xstring packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn61614"

RPM_NAME = "texlive-karnaugh-map-2023.209.2.0svn61614-56.1.noarch.rpm"
RPM_HASH = "c5c96f9ef9a14052bf84ad1ed8fc94e5ad267f13a910478ba2c5051afa3c4e5f8191dbe57e8be8208d739d8af87962be3cb5e051f3ac45424bd8e7d8efbe5b60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-karnaugh-map.sty \
texlive-karnaugh-map"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-kvoptions.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
