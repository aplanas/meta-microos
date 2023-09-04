SUMMARY = "Typeset sequences with justification pointers"
DESCRIPTION = "This package lets you typeset justified sequences, also called \
pointing strings. It's used for instance, in research papers \
about Game Semantics to represent sequence of game moves with \
their associated justification pointers. Depending on wether \
using LaTeX or pdfLaTeX, the package uses PSTricks and pst-node \
respectively pgf/TikZ."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn42857"

RPM_NAME = "texlive-pstring-2023.209.svn42857-54.2.noarch.rpm"
RPM_HASH = "2b933d6439f9cfef0869a951e76dfa2837156e77e64efcccebd10582fdd4844624f55419e539e6c20ee944c74ef741822203f08572ac36ecfa75672047bba444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pstring.sty \
texlive-pstring"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
tex-pgfcore.sty \
tex-pst-node.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
