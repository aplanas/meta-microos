SUMMARY = "Horizontal and columned lists"
DESCRIPTION = "This plain TeX and LaTeX package provides the 'hlist' \
environment in which \\hitem starts a horizontal and columned \
item. It depends upon the simplekv package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn44983"

RPM_NAME = "texlive-hlist-2023.209.0.0.11svn44983-54.2.noarch.rpm"
RPM_HASH = "159935e06284ce2ebeb0e41672629290073df8fc5dcbfe194193056e0e147d9d0c88f6e55b2bc3721058eafaa1a5dcd2d6bc1e931e6346cd56039eeb332a32bc"
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
