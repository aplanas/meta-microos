SUMMARY = "Filling documents with notes pages and notes areas"
DESCRIPTION = "This package package provides one macro to insert a single \
notes page and another to fill the document with multiple notes \
pages, until the total number of pages (so far) is a multiple \
of a given number. A third command can be used to fill half \
empty pages with a notes area."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8.1svn41906"

RPM_NAME = "texlive-notespages-2023.201.0.0.8.1svn41906-54.1.noarch.rpm"
RPM_HASH = "6f21a1f000e4046f65d5025119f424c81f8cfd3c8b4f5a3ec695ea61116c105d71c09d3e26f35b5b43216d122a4aebb9690473a627c1b99429eb0c9220d9d151"
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
