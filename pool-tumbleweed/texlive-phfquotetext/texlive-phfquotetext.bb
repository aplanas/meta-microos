SUMMARY = "Quote verbatim text without white space formatting"
DESCRIPTION = "This package provides an environment for displaying block text \
with special characters, such as verbatim quotes from a referee \
report which may contain pseudo-(La)TeX code. This behaves like \
a verbatim environment, except that it displays its content as \
normal paragraph content, ignoring any white space \
preformatting."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn41869"

RPM_NAME = "texlive-phfquotetext-2023.201.1.0svn41869-51.1.noarch.rpm"
RPM_HASH = "3ccd07583313784d5f33dc4f55b2d118c2f46ed4dfa7bd2dee62c13a32fe81a31a1c494031377553dce09cf02638c17a9cee562a60fbdf9e52318a3a7a2c7675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(phfquotetext.sty) \
texlive-phfquotetext"

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
