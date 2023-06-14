SUMMARY = "A dissertation class"
DESCRIPTION = "The class was developed to typeset a dissertation at ETH \
Zurich. The requirements were to use A5 paper and 10pt type. A \
sample of the output is shown in the PDF documentation link."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-hpsdiss-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "2705fbcd3ff5ce07ff3f2f9164f57a84548a9ce840ef266fdebae45466bd0e71a11e092249c42fe0811ca1a537c2cfa3236018c7540a3d6859cb3d53b11180f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hpsdiss.cls \
texlive-hpsdiss"

RDEPENDS:${PN} += "/bin/sh \
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
