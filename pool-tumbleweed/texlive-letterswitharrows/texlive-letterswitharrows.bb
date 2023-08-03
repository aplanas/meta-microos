SUMMARY = "Draw arrows over math letters"
DESCRIPTION = "This package provides LaTeX math-mode commands for setting left \
and right arrows over mathematical symbols so that the arrows \
dynamically scale with the symbols. While it is possible to set \
arrows over longer strings of symbols, the focus lies on single \
characters."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59993"

RPM_NAME = "texlive-letterswitharrows-2023.209.svn59993-55.1.noarch.rpm"
RPM_HASH = "0d868318c3ae0a4f3721f76690bad9f245fca76f794fe30ed5514ad6e597e1dd7a37eac625255e5a19a15c874e7e7749ba6a8307f7baf8069816b9d6d327d5cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-letterswitharrows.sty \
texlive-letterswitharrows"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-mathtools.sty \
tex-pgf.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
