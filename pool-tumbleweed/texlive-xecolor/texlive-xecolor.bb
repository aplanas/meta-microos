SUMMARY = "Support for color in XeLaTeX"
DESCRIPTION = "This is a simple package which defines about 140 different \
colours using XeTeX's colour feature. The colours can be used \
in bidirectional texts without any problem."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn29660"

RPM_NAME = "texlive-xecolor-2023.201.0.0.1svn29660-52.1.noarch.rpm"
RPM_HASH = "46f50cf1439d9eb031788cacd9d7e56c706346b7d149dd288d689bca77926ed397d568ef4a726fd6796360b56ba816c7133d1cf1cfa28592dbfc0d6264a887d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xecolor.sty \
texlive-xecolor"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
