SUMMARY = "Title page for dissertations at the University of Wollongong"
DESCRIPTION = "The package redefines \\maketitle to generate a title page for a \
University of Wollongong thesis, in accordance with the UoW \
branding guidelines. The package should be used with the book \
class to typeset a thesis. The package also defines a \
\\declaration command that typesets the declaration that this \
thesis is your own work, etc., which is required in the front \
of each PhD Thesis."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0.1svn54512"

RPM_NAME = "texlive-uowthesistitlepage-2023.209.3.0.1svn54512-54.1.noarch.rpm"
RPM_HASH = "68e0762cde47e9adb385da8d7e9d307f5cb6d5591b85702f1bd75887c1d29bdcbd2197f3d9598348ab7fd83238615037c9a856007b713e47f13c6764185d9a4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-uowthesistitlepage.sty \
texlive-uowthesistitlepage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ragged2e.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
