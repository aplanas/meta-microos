SUMMARY = "Display brief notes on verso pages"
DESCRIPTION = "This package allows you to place notes on the verso pages of an \
otherwise single-sided document. If, in the run of text, you \
include a call to the macro \\versonote{This is a remark}, then \
that text will be placed on the opposite (ie, 'verso') page, \
lined up with the macro call."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn55777"

RPM_NAME = "texlive-versonotes-2023.209.0.0.4svn55777-54.1.noarch.rpm"
RPM_HASH = "54ca3661d333f9349297bb0bf61a9f183837b1e923bedd81ddfd6d9fdd6adffbfda290ccdbda3168f786de46e351794539e6c974e5210587e8de38adf53fa2ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-versonotes.sty \
texlive-versonotes"

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
