SUMMARY = "Create thumb indexes for printed books"
DESCRIPTION = "The package can generate thumb indexes for your document. It \
features printing thumb indexes on one- or two-sided pages, \
along with background- and foreground-color selection and full \
LaTeX styling of the chapter numbers in the thumb indexes. The \
height of each thumb index is automatically chosen based on the \
number of chapters in your document, while the width is chosen \
by the user. The package is designed to work with the memoir \
class, and also requires PerlTeX and tikz/"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1svn16736"

RPM_NAME = "texlive-thumby-2023.201.0.0.1svn16736-54.1.noarch.rpm"
RPM_HASH = "e3d633ebd8acb23f0846718b95075698022f1cad4ee67d91e2a3fb2176d3f7468315ea7b7f5efaee4f40aa2efc1ed95c85dc94dd93bbdc9011ae308839220ea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(thumby.sty) \
texlive-thumby"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(bophook.sty) \
tex(perltex.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
