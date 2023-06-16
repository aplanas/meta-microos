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

PV = "2023.201.3.1svn51494"

RPM_NAME = "texlive-songs-2023.201.3.1svn51494-57.1.noarch.rpm"
RPM_HASH = "d40b663a2a178ca55a2ff6e50f3e1feb652a89cd2f753a5221ce182b0ef7bc0782dd60841f5efc4b4e8ddc7ab53e2ef5a01a0416e3beba255b0637b28ad372c6"
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
