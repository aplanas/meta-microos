SUMMARY = "Using the Pygments highlighter in LaTeX"
DESCRIPTION = "A package which allows to use the Pygments highlighter inside \
LaTeX documents. Pygments supports syntax colouring of over 50 \
types of files, and ships with multiple colour schemes."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.0svn15878"

RPM_NAME = "texlive-texments-2023.209.0.0.2.0svn15878-55.1.noarch.rpm"
RPM_HASH = "4d072aaa52944412fb6670ca393b1d9ac53ad53738e853d63f044034e0f3926c19db5218183687ff8d8d7f7d68c0c0d1e54eef1f31cdc9940c5af9e67b68aaf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texments.sty \
texlive-texments"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fancyvrb.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
