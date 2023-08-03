SUMMARY = "Filling documents with notes pages and notes areas"
DESCRIPTION = "This package package provides one macro to insert a single \
notes page and another to fill the document with multiple notes \
pages, until the total number of pages (so far) is a multiple \
of a given number. A third command can be used to fill half \
empty pages with a notes area."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.1svn41906"

RPM_NAME = "texlive-notespages-2023.209.0.0.8.1svn41906-55.1.noarch.rpm"
RPM_HASH = "524c8c21007f2e994c3aa2d00fb60f403c7cd95ebbe723504837b4862dcdd8f7218dc1dee07c8320d55cc9d2e4d871855cdd5f4209f2b2c727d1c9749be872b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-notespages.sty \
texlive-notespages"

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
