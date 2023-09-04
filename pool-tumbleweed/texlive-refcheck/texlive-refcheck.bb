SUMMARY = "Check references (in figures, table, equations, etc)"
DESCRIPTION = "The package checks references in a document, looking for \
numbered but unlabelled equations, for labels which are not \
used in the text, for unused bibliography references. It can \
also display label names in text near corresponding numbers of \
equations and/or bibliography references."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.9.1svn29128"

RPM_NAME = "texlive-refcheck-2023.209.1.9.1svn29128-54.2.noarch.rpm"
RPM_HASH = "c93367675f512fe553401bafa32252025256891de4887843e8db1dcad9a8089b95475735d61b552e0424f43370dd1af1892294f029bc5d22fcf5452eef1f61d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-refcheck.sty \
texlive-refcheck"

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
