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

PV = "2023.209.1.0svn28754"

RPM_NAME = "texlive-threadcol-2023.209.1.0svn28754-55.1.noarch.rpm"
RPM_HASH = "213699e6d7c2b963437b3f1a7d844085fa04919cd783d2cc246fb68f0f27f358a86d5bae5f3bc80565587f2dc7373e807cd72b50a0b2e8e8b58bb59c174edf52"
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
