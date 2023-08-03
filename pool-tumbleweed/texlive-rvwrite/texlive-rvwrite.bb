SUMMARY = "Increase the number of available output streams in LaTeX"
DESCRIPTION = "The package addresses, for LaTeX documents, the severe \
limitation on the number of output streams that TeX provides. \
The package uses a single TeX output stream, and writes \
'marked-up' output to this stream. The user may then \
post-process the marked-up output file, using LaTeX, and the \
document's output appears as separate files, according to the \
calls made to the package. The output to be post-processed uses \
macros from the widely-available ProTeX package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn19614"

RPM_NAME = "texlive-rvwrite-2023.209.1.2svn19614-54.1.noarch.rpm"
RPM_HASH = "a324736116bdc47b4b84c47b2d90fa4d948866e8ecfebcbde2063b0943c9dc21e0ccc9e787fa0c8a9a6ea2e6f106172fd1625fa8e1f6366b4840e0a5cf7fd6f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rvwrite.sty \
texlive-rvwrite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
