SUMMARY = "How to include an SVG image in LaTeX using Inkscape"
DESCRIPTION = "The document demonstrates the use of SVG images in LaTeX \
documents. Using the 'PDF+LaTeX output' option of Inkscape, it \
is possible to include SVG in documents, in which LaTeX \
typesets the text. This results in uniform text style \
throughout the document, including text in images; moreover, \
LaTeX commands may be used in the image's text, providing such \
things as mathematics and references. The document also \
describes how to automate the conversion from SVG to PDF+LaTeX \
using Inkscape."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn32199"

RPM_NAME = "texlive-svg-inkscape-2023.209.svn32199-58.1.noarch.rpm"
RPM_HASH = "345ef93e50246c6a03dcc0579bbf5dccfa11cf51c1bb26226bcf2fd7ca4c28c9b43c1504918971ddb1a76415a339860ce2647b96214b9c94ef2b1ddcb894dafa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svg-inkscape"

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
