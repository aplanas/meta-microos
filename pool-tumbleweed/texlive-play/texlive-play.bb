SUMMARY = "Typeset drama using LaTeX"
DESCRIPTION = "A class and style file that supports the typesetting of plays, \
including options for line numbering."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-play-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "f0e9d641ba2eb7f9e00c40599676fbf5b54c93c3c6eed4a391c73ef2b102096234da043498737973377d13f7165a6f772c06bb1b9c736a9c18143b867fef9c8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-play.cls \
tex-play.sty \
texlive-play"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
