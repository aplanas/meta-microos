SUMMARY = "Variants of delimiters that act as maths open/close"
DESCRIPTION = "The package defines variants \\mleft and \\mright of \\left and \
\\right, that make the delimiters act as \\mathopen and \
\\mathclose. These commands address spacing difficulties in \
subformulas."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn53021"

RPM_NAME = "texlive-mleftright-2023.201.1.2svn53021-54.1.noarch.rpm"
RPM_HASH = "e5a62e12927a1830e1bd3da942087e8ce98333c4f9e3eb43391be712609a1bfa677b2dbb7e5bf238d55b91fddf60fc864b375d3855a7ad9314a3ed912b2018a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mleftright.sty \
texlive-mleftright"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-infwarerr.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
