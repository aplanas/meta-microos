SUMMARY = "A dissertation class"
DESCRIPTION = "The class was developed to typeset a dissertation at ETH \
Zurich. The requirements were to use A5 paper and 10pt type. A \
sample of the output is shown in the PDF documentation link."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-hpsdiss-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "ca9066c68a4e65a351a223890b8df4826783d536c304be766ba1001c62cc8f5f8d152bb6cff3c7608d4298f4dcf78b120475133b185e8ef42aa302a4221a713b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hpsdiss.cls \
texlive-hpsdiss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-calc.sty \
tex-colordvi.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-mparhack.sty \
tex-ragged2e.sty \
tex-rotating.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
