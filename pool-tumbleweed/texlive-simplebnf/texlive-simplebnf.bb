SUMMARY = "A simple package to format Backus-Naur form (BNF)"
DESCRIPTION = "This package provides a simple way to format Backus-Naur form \
(BNF). The included bnfgrammar environment parses BNF \
expressions (possibly annotated), so users can write readable \
BNF expressions in their documents. The package requires expl3, \
xparse, and mathtools."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.2svn65485"

RPM_NAME = "texlive-simplebnf-2023.209.0.0.3.2svn65485-54.1.noarch.rpm"
RPM_HASH = "f6741eae3103e7557fb0319e44a059635d57ed1ab87751a33abfebbb6f320c0e4541c97cdb7fdcd35544d6170bf1515dc50e27ad31602c590ea7c5f18d75bf56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplebnf.sty \
texlive-simplebnf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-mathtools.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
