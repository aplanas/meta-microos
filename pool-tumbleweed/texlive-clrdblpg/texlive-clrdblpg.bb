SUMMARY = "Control pagestyle of pages left blank by \\cleardoublepage"
DESCRIPTION = "This tiny package allows easy manipulation of the headers and \
footers on pages left blank by \\cleardoublepage. By default, \
LaTeX has no easy facilities for this. This package uses more \
or less the algorithm listed in the fancyhdr package \
documentation, with some better indentation and added \
flexibility."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47511"

RPM_NAME = "texlive-clrdblpg-2023.209.1.0svn47511-54.1.noarch.rpm"
RPM_HASH = "8136675866ea9dacbe48cb13c8230f4f2d1bdd3f2f9316f83f4015c8a3be65c9cf0f9c5f72454875fbd27a0bb79b4b0915bbd4ec2e8efb0832fb543743609210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clrdblpg.sty \
texlive-clrdblpg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
