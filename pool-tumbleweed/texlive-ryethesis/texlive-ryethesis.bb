SUMMARY = "Class for Ryerson Unversity Graduate School requirements"
DESCRIPTION = "The class offers support for formatting a thesis, dissertation \
or project according to Ryerson University's School of Graduate \
Studies thesis formatting regulations."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.36svn33945"

RPM_NAME = "texlive-ryethesis-2023.201.1.36svn33945-53.1.noarch.rpm"
RPM_HASH = "71346f9fb629e01a5c00a8215f4d2d85e97d79716995ae9352ae8ebe8e3ac77a83b998f63b0dc64e8db06e5a894b6aaab15acb08e211712bf1be0d50fd7845cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ryethesis.cls \
texlive-ryethesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-bookmark.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-glossaries.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-multicol.sty \
tex-nomencl.sty \
tex-setspace.sty \
tex-vmargin.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
