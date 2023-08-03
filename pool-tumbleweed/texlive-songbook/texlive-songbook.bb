SUMMARY = "Package for typesetting song lyrics and chord books"
DESCRIPTION = "The package provides an all purpose songbook style. Three types \
of output may be created from a single input file: 'words and \
chords' books for the musicians to play from, 'words only' \
songbooks for the congregation to sing from, and overhead \
transparency masters for congregational use. The package will \
also print a table of contents, an index sorted by title and \
first line, and an index sorted by key, or by artist/composer. \
The package attempts to handle songs in multiple keys, as well \
as songs in multiple languages."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.4.5svn18136"

RPM_NAME = "texlive-songbook-2023.209.4.5svn18136-58.1.noarch.rpm"
RPM_HASH = "da096f12c8cea6d015f15a32924d94e7c77047966ddee9ea29ca72943b8de3a6af3e3cd2e19b2367972531e287347d12496a3c25d4cd838166d2bb16cae8602b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-conditionals.sty \
tex-songbook.sty \
texlive-songbook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-multicol.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
