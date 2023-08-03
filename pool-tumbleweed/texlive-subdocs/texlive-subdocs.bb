SUMMARY = "Multifile documents"
DESCRIPTION = "This is an experimental package aiming to provide a different \
approach for multidocument works (mainly, books with a document \
per chapter). Unlike the \\include mechanism, every subdocument \
is a complete normal LaTeX document and may be typeset \
separately. What the package does is sharing the .aux files. \
The present release is an alpha version, and no attempt has yet \
been made to allow it to work with, say, hyperref."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn51480"

RPM_NAME = "texlive-subdocs-2023.209.0.0.1svn51480-58.1.noarch.rpm"
RPM_HASH = "ee49eae6364fac8bed5080efa186242716c948245dc3d241e666f8f2630f3ebb527d37561a408492e12cc7aa644dac9ad3c7e122755973b88e9401c304df1555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subdocs.sty \
texlive-subdocs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
