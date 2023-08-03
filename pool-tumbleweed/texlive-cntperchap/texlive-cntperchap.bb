SUMMARY = "Store counter values per chapter"
DESCRIPTION = "This package stores values of counters (which have been \
registered beforehand) on a per chapter base and provides the \
values on demand in the 2nd LaTeX compilation run. In this way \
it is possible to know how many sections etc. there are lying \
ahead and to react to these counter values, if needed. This is \
a preliminary version that has been tested with book.cls, \
memoir.cls, and scrbook.cls. The packages assoccnt (by the same \
author) and xparse are needed as well."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn37572"

RPM_NAME = "texlive-cntperchap-2023.209.0.0.3svn37572-54.1.noarch.rpm"
RPM_HASH = "dd74fb19b4436e4cfdfa977a57392587f27938230fffb928d9b17cd97b586505371da4a624976c7e2a7c86e319f26b59d34210dc7662c4dacdc53b4d5cb5c0b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cntperchap.sty \
texlive-cntperchap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-assoccnt.sty \
tex-ifthen.sty \
tex-morewrites.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
