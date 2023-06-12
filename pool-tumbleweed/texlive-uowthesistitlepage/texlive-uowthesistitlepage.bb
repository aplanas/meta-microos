SUMMARY = "Title page for dissertations at the University of Wollongong"
DESCRIPTION = "The package redefines \\maketitle to generate a title page for a \
University of Wollongong thesis, in accordance with the UoW \
branding guidelines. The package should be used with the book \
class to typeset a thesis. The package also defines a \
\\declaration command that typesets the declaration that this \
thesis is your own work, etc., which is required in the front \
of each PhD Thesis."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0.1svn54512"

RPM_NAME = "texlive-uowthesistitlepage-2023.201.3.0.1svn54512-53.1.noarch.rpm"
RPM_HASH = "b3fcc5ac2a131f99579fc065a292a006d59b14bbefdc92ef8a84f577c4f4fa17d0e3568337d23c011f0eaa3c1c35fd642edb4506d4aac26b6b7780a36a59e98a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uowthesistitlepage.sty) \
texlive-uowthesistitlepage"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(ragged2e.sty) \
tex(setspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
