SUMMARY = "Multifile documents"
DESCRIPTION = "This is an experimental package aiming to provide a different \
approach for multidocument works (mainly, books with a document \
per chapter). Unlike the \\include mechanism, every subdocument \
is a complete normal LaTeX document and may be typeset \
separately. What the package does is sharing the .aux files. \
The present release is an alpha version, and no attempt has yet \
been made to allow it to work with, say, hyperref."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn51480"

RPM_NAME = "texlive-subdocs-2023.201.0.0.1svn51480-57.1.noarch.rpm"
RPM_HASH = "a78925be6cec6074f9a3c63899baf287d02d86d5629c86cfaa350a493a3340c61314dfe43d2db6a2f60610397fa32f09fb06ef5ebe0b792d8c6e09d2e3a83a07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(subdocs.sty) \
texlive-subdocs"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
