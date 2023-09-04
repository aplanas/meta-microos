SUMMARY = "Extended index for LaTeX including multiple indexes"
DESCRIPTION = "This is a reimplementation of LaTeX's indexing macros to \
provide better support for indexing. For example, it supports \
multiple indexes in a single document and provides a more \
robust \\index command. It supplies short hand notations for the \
\\index command (^{word}) and a * variation of \\index \
(abbreviated _{word}) that prints the word being indexed, as \
well as creating an index entry for it."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.1betasvn24099"

RPM_NAME = "texlive-index-2023.209.4.1betasvn24099-54.1.noarch.rpm"
RPM_HASH = "f5b0ddc001dd05db511a904d87194bd24800bbb5d9a2d55cc9ae873dad89528616683cd86bb2410d19fcb915a751c7ff6422de128ea2a1f94b28ad7620ca1758"
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
