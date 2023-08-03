SUMMARY = "Typeset formal grammars"
DESCRIPTION = "This package provides a new environment and associated commands \
to typeset BNF grammars. It allows to easily write formal \
grammars. Its original motivation was to typeset grammars for \
beamer presentations, therefore, there are macros to emphasize \
or downplay some parts of the grammar (which is the main \
novelty compared to other BNF packages)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61955"

RPM_NAME = "texlive-formal-grammar-2023.209.1.2svn61955-53.1.noarch.rpm"
RPM_HASH = "1e9624291dd3e5623c03eec8542ea02afe4a45a1b700f57d7334856f18445724a89ec64c4ae4587f91e1a6faaf5bda0fabf457471ba3f9b4764f4411ad2d03f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-formal-grammar.sty \
texlive-formal-grammar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-colortbl.sty \
tex-newfloat.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
