SUMMARY = "A class for Brandeis University M.A. theses"
DESCRIPTION = "brandeis-thesis.cls provides the structures and formatting \
information for an M.A. thesis for the Brandeis University \
Graduate School of Arts and Sciences."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2svn59832"

RPM_NAME = "texlive-brandeis-thesis-2023.209.3.2svn59832-53.1.noarch.rpm"
RPM_HASH = "d542f2b17e37a2a16521a4a340d52285e707641ee87fa156efb240277579b600f4f70f996d21e90f635edeb71ccce952bde2b646a2e3a5dad2d930397fbe8921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-brandeis-thesis.cls \
texlive-brandeis-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
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
