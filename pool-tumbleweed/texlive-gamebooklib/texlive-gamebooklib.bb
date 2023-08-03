SUMMARY = "Macros for setting numbered entries in shuffled order"
DESCRIPTION = "This package provides macros and environments to allow the user \
to typeset a series of cross-referenced, numbered 'entries', \
shuffled into random order, to produce an interactive novel or \
'gamebook'. This allows entries to be written in natural order \
and shuffled automatically into a repeatable non-linear order. \
Limited support is provided for footnotes to appear at the \
natural position: the end of each entry, or the end of each \
page, whichever is closest to the footnote mark. This is \
unrelated to the gamebook package which is more concerned with \
the formatting of entries rather than their order. The two \
packages can be used together or separately."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn63424"

RPM_NAME = "texlive-gamebooklib-2023.209.1.3svn63424-53.1.noarch.rpm"
RPM_HASH = "faacf93e1bdbb506acb57347977c78f880982ac1932c14d2db2942e38593c703ab458a8897cb738b147cad724805d3c17cbce37705f47030eb17412416dbfb14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gamebooklib.sty \
texlive-gamebooklib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-ifthen.sty \
tex-lcg.sty \
tex-macroswap.sty \
tex-silence.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
