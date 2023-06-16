SUMMARY = "Organize document columns into PDF 'article thread'"
DESCRIPTION = "The package combines a document's columns into a PDF 'article \
thread'. PDF readers that support this mechanism (probably \
Adobe Acrobat/Reader only) can be instructed to scroll \
automatically from column to column, which facilitates \
on-screen reading of two-column documents. Even for \
single-column documents, threadcol supports the creation of \
multiple article threads, which help organize discontiguous but \
logically related regions of text into a form that the user can \
scroll through as if its contents were contiguous."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn28754"

RPM_NAME = "texlive-threadcol-2023.201.1.0svn28754-54.1.noarch.rpm"
RPM_HASH = "107590b01d74a9a8cf4875cb43364574fcdbfdc96cf9a6b76bba42dcc5b8a236f631b8d8d9a666b6a240575b38f186748dfd0bcf6d3ad55ad0718ec73f0f0e4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-threadcol.sty \
texlive-threadcol"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifpdf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
