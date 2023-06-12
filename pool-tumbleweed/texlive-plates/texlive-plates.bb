SUMMARY = "Arrange for 'plates' sections of documents"
DESCRIPTION = "The plates package provides a simple facility for inserting \
colour figures in a document when they should be gathered and \
printed together as in a book's section of colour plates. The \
package provides a plate environment that takes the place of \
the figure environment for such colour images."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-plates-2023.201.0.0.1svn15878-52.1.noarch.rpm"
RPM_HASH = "20b044c6ecf313c4238f6419818c2d90e050fc6e3ac4431afe3d64b75ac6b54bd93d0e7cb420630a597fb34f57d78a10bec2a2527eb949f34327bcf1c0af4ad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(endplate.sty) \
tex(plates.sty) \
texlive-plates"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
