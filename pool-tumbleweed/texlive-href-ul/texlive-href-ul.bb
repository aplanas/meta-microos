SUMMARY = "Underscored LaTeX hyperlinks"
DESCRIPTION = "This LaTeX package makes hyperlinks underscored, just like on \
the web. The package uses hyperref and ulem."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn64880"

RPM_NAME = "texlive-href-ul-2023.209.0.0.3.0svn64880-54.2.noarch.rpm"
RPM_HASH = "64c4140254ffbb7be73aaf9cf88aa656fa7be567d87b5230f11dc3fcd84a244b810b5d1ff41dee51877ff567d1d089b0970708906aabb3e846a83c5ee81cfeed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-href-ul.sty \
texlive-href-ul"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-hyperref \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-ulem"

inherit rpm
