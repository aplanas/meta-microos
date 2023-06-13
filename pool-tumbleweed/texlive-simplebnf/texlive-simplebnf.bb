SUMMARY = "A simple package to format Backus-Naur form (BNF)"
DESCRIPTION = "This package provides a simple way to format Backus-Naur form \
(BNF). The included bnfgrammar environment parses BNF \
expressions (possibly annotated), so users can write readable \
BNF expressions in their documents. The package requires expl3, \
xparse, and mathtools."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.2svn65485"

RPM_NAME = "texlive-simplebnf-2023.201.0.0.3.2svn65485-53.1.noarch.rpm"
RPM_HASH = "26e1b85c96ec37cc5ea5df69a327f53ff6585bdaf3f323e8709f45771c490d1ae0d30c70c0f025d63ef3b94b4c2fe5da0dcc77b6f05eb2fc624bc6fc126b66c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(simplebnf.sty) \
texlive-simplebnf"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expl3.sty) \
tex(mathtools.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
