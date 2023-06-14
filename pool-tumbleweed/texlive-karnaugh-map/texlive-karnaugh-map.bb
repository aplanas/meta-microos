SUMMARY = "LaTeX package for drawing karnaugh maps with up to 6 variables"
DESCRIPTION = "This package draws karnaugh maps with 2, 3, 4, 5, and 6 \
variables. It also contains commands for filling the karnaugh \
map with terms semi-automatically or manually. Last but not \
least it contains commands for drawing implicants on top of the \
map. This package depends on the keyval, kvoptions, TikZ, \
xparse, and xstring packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn61614"

RPM_NAME = "texlive-karnaugh-map-2023.201.2.0svn61614-55.1.noarch.rpm"
RPM_HASH = "19cdf2acc275d0ebfc07ccac6a008130bda50785ed17c841258acb87519389f41ba93eb0f1142bc28b0f71221702f1b2c8038f08c7958cd27fe79dd97336f175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-karnaugh-map.sty \
texlive-karnaugh-map"

RDEPENDS:${PN} += "/bin/sh \
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
