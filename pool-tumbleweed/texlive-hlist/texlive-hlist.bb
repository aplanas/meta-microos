SUMMARY = "Horizontal and columned lists"
DESCRIPTION = "This plain TeX and LaTeX package provides the 'hlist' \
environment in which \\hitem starts a horizontal and columned \
item. It depends upon the simplekv package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn44983"

RPM_NAME = "texlive-hlist-2023.201.0.0.11svn44983-53.1.noarch.rpm"
RPM_HASH = "29ec42a41b6d63879071c1b1919f781535e34acb59a7ae75dd16e69c30cccc507abc3640b13e97e50fed302f46f5e583c3a1b1485ab60f0d3e232027847c1fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hlist.sty \
tex-hlist.tex \
texlive-hlist"

RDEPENDS:${PN} += "/bin/sh \
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
