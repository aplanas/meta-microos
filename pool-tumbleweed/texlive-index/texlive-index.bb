SUMMARY = "Extended index for LaTeX including multiple indexes"
DESCRIPTION = "This is a reimplementation of LaTeX's indexing macros to \
provide better support for indexing. For example, it supports \
multiple indexes in a single document and provides a more \
robust \\index command. It supplies short hand notations for the \
\\index command (^{word}) and a * variation of \\index \
(abbreviated _{word}) that prints the word being indexed, as \
well as creating an index entry for it."
LICENSE = "LPPL-1.0"

PV = "2023.208.4.1betasvn24099"

RPM_NAME = "texlive-index-2023.208.4.1betasvn24099-53.1.noarch.rpm"
RPM_HASH = "c6e87b9c9035ed7fb565465d8e6b27c9de281f1867f334f16819d9776538a0167c2b31dfc427b2096e1aabff9e15ff242d6d6dc7b6ebd95fac28962355bbf272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-autind.sty \
tex-bibref.sty \
tex-index.sty \
texlive-index"

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
