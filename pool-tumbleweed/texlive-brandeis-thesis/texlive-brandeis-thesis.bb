SUMMARY = "A class for Brandeis University M.A. theses"
DESCRIPTION = "brandeis-thesis.cls provides the structures and formatting \
information for an M.A. thesis for the Brandeis University \
Graduate School of Arts and Sciences."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2svn59832"

RPM_NAME = "texlive-brandeis-thesis-2023.201.3.2svn59832-52.1.noarch.rpm"
RPM_HASH = "08c40c81e29ff248bf165c5f5b3fb5ce4696c41f8bb6720e0f0770d203867e0935a7cb5793208111603910a6ce096d6f1a60acdc2f3ab62f78573ff350a0cbc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-brandeis-thesis.cls \
texlive-brandeis-thesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-book.cls \
tex-csquotes.sty \
tex-geometry.sty \
tex-inputenc.sty \
tex-mathptmx.sty \
tex-sectsty.sty \
tex-setspace.sty \
tex-silence.sty \
tex-titlesec.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
