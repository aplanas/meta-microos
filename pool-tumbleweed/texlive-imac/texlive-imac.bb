SUMMARY = "International Modal Analysis Conference format"
DESCRIPTION = "A set of files for producing correctly formatted documents for \
the International Modal Analysis Conference. The bundle \
provides a LaTeX package and a BibTeX style file."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn17347"

RPM_NAME = "texlive-imac-2023.209.svn17347-54.1.noarch.rpm"
RPM_HASH = "49b6c1fd65c1bad39d513abc5635708a4907d3d9c73869021edd7d2859987b9933244f66356cce173cca51e738d195affaa0839d29c2cadc8c3cc8cdaa06a9d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-imac.sty \
texlive-imac"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-cite.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
