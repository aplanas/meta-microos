SUMMARY = "Allows font sizes up to 35.83pt"
DESCRIPTION = "A package for using font sizes up to 35.88pt, for example with \
the EC fonts. New commands \\HUGE and \\ssmall for selecting font \
sizes are provided together with some options working around \
current LaTeX2e shortcomings in using big font sizes. The \
package also provides options for improving the typesetting of \
paragraphs (or headlines) with embedded math expressions at \
font sizes above 17.28pt."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn17513"

RPM_NAME = "texlive-moresize-2023.201.1.9svn17513-54.1.noarch.rpm"
RPM_HASH = "e95f1f585380ef80a8d7dc2eaec8f0c6c0b7da85305fca0f86b9943667153a4201bdafaec8b88df3f8b996980f57bd5ccaf9a9a73bb1ebf0e9c2ce07f3caaee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(moresize.sty) \
texlive-moresize"
RDEPENDS:${PN} += "/bin/sh \
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
