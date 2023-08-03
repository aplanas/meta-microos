SUMMARY = "Produce song books for church or fellowship"
DESCRIPTION = "The package provides a means of producing beautiful song books \
for church or fellowship. It offers: a very easy chord-entry \
syntax; multiple modes (words-only; words+chords; slides; \
handouts); measure bars; guitar tablatures; automatic \
transposition; scripture quotations; multiple indexes (sorted \
by title, author, important lyrics, or scripture references); \
and projector-style output generation, for interactive use. A \
set of example documents is provided."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.1svn51494"

RPM_NAME = "texlive-songs-2023.209.3.1svn51494-58.1.noarch.rpm"
RPM_HASH = "69f37ae084bcc316f95720a24405bb314e072c1250fb77b76f855595f2f6b251f9bed837a9746114f4820e527c89c8d7ae4da0bf57f087b691291a86c0e8382e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-songs.sty \
texlive-songs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-etex.sty \
tex-ifpdf.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
