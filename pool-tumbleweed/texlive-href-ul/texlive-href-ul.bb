SUMMARY = "Underscored LaTeX hyperlinks"
DESCRIPTION = "This LaTeX package makes hyperlinks underscored, just like on \
the web. The package uses hyperref and ulem."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn64880"

RPM_NAME = "texlive-href-ul-2023.201.0.0.3.0svn64880-53.2.noarch.rpm"
RPM_HASH = "880f33e3a4a1cde6db2d2942b9b91c63ee2ddcf805fa92504009922fbb9a8e6c87b718d3d6ce7d48891d07b52e6d99359883762cf54a25964a07734689a22103"
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
