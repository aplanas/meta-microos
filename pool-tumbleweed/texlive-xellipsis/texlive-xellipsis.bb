SUMMARY = "Extremely configurable ellipses with formats for various style manuals"
DESCRIPTION = "The xellipsis package provides a system for configuring \
(almomst) every possible aspect of ellipses, including \
preceding and proceeding characters; the character itself; \
distances before and after each of these; and number of \
characters. It comes with both a compatibility option for \
standard LaTeX \\ldots as well as preset package options for the \
Chicago Manual of Style (Turabian); the Bluebook; and MLA \
guidelines."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn47546"

RPM_NAME = "texlive-xellipsis-2023.209.2.0svn47546-53.1.noarch.rpm"
RPM_HASH = "a355b752683579c602210502867f17342cd58a6a3189ac4fb96ab23306287607dd3f54b5f676fe5a3d24865a436a34885c3cc6aeb88638ea754bbf201b45303f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xellipsis.sty \
texlive-xellipsis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
