SUMMARY = "Horizontal and columned lists"
DESCRIPTION = "This plain TeX and LaTeX package provides the 'hlist' \
environment in which \\hitem starts a horizontal and columned \
item. It depends upon the simplekv package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn44983"

RPM_NAME = "texlive-hlist-2023.201.0.0.11svn44983-53.2.noarch.rpm"
RPM_HASH = "303842ec2725950e384eaaf0e0b8e45bd9d8c8b280bdcc3a059c3f529dc3ef11e8f89eb338e765eed19532d9766d7fab3148512aba83c54f5c98e8ea63634e1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hlist.sty \
tex-hlist.tex \
texlive-hlist"

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
