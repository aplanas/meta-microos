SUMMARY = "Extended index for LaTeX including multiple indexes"
DESCRIPTION = "This is a reimplementation of LaTeX's indexing macros to \
provide better support for indexing. For example, it supports \
multiple indexes in a single document and provides a more \
robust \\index command. It supplies short hand notations for the \
\\index command (^{word}) and a * variation of \\index \
(abbreviated _{word}) that prints the word being indexed, as \
well as creating an index entry for it."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.1betasvn24099"

RPM_NAME = "texlive-index-2023.201.4.1betasvn24099-52.1.noarch.rpm"
RPM_HASH = "83d97091c5cbffcce115ae2fca418d764300c953f185e7ccc6117a2a2814cced287bdb88a6edb66e90932a4c52cbe0fdd1873186c08e9c7e485fb8ce27d08010"
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
