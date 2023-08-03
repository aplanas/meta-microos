SUMMARY = "Print a BibTeX database"
DESCRIPTION = "The package provides the means of listing an entire BibTeX \
database, avoiding the potentially large (macro) impact \
associated with \\nocite{*}."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn17116"

RPM_NAME = "texlive-biblist-2023.209.svn17116-54.1.noarch.rpm"
RPM_HASH = "0db223e3108d5f03b1020eb69deb8723c0f1d804fc9677afe62db85c013d9c28bb0bba7ad7bb25b9a32dfc894d51de8015094ca2c9f3501b2ffb6cae86d255ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblist.sty \
texlive-biblist"

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
