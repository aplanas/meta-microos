SUMMARY = "Print a BibTeX database"
DESCRIPTION = "The package provides the means of listing an entire BibTeX \
database, avoiding the potentially large (macro) impact \
associated with \\nocite{*}."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn17116"

RPM_NAME = "texlive-biblist-2023.201.svn17116-53.1.noarch.rpm"
RPM_HASH = "5e9b7d7761c6b5867534eff518699be8b6cbad1272b43847e59021531f8cc16641f81369415ab0387eeb066754cf7f2ff1434671bd11334cd8f0841b0e868877"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(biblist.sty) \
texlive-biblist"

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
