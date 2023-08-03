SUMMARY = "Class for Springer books"
DESCRIPTION = "This package provides a LaTeX class and templates for books to \
be published at Springer Gabler Research, Springer Vieweg \
Research, Springer Spektrum Research, Springer VS Research, or \
Springer VS Forschung. It may be used to produce monographs in \
different formats and 'several-authors-books' fitting the \
conditions of the aforementioned publishers."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn59333"

RPM_NAME = "texlive-sr-vorl-2023.209.1.2svn59333-58.1.noarch.rpm"
RPM_HASH = "4b840e05bdf7f44cb66451678325baa46ac86209a415f1872395804dc5b046986cd988c0daf737c81311ca7cc7c4b8a425eccf38ba74c522e4dafec1eaa1e24f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sr-vorl.cls \
texlive-sr-vorl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-caption.sty \
tex-chngcntr.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-mathptmx.sty \
tex-microtype.sty \
tex-onlyamsmath.sty \
tex-ragged2e.sty \
tex-scrlayer-scrpage.sty \
tex-varwidth.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
