SUMMARY = "Split and reorder your bibliography"
DESCRIPTION = "This package enables you to split a bibliography into several \
categories and subcategories. It does not depend on BibTeX: any \
bibliography may be split and reordered."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.17svn15878"

RPM_NAME = "texlive-splitbib-2023.201.1.17svn15878-57.1.noarch.rpm"
RPM_HASH = "0888ba3e872e11fd7e9d80be215a7bf6bead83bf81570c43eb4043f82098ab8fd53e8d394991d195135888a72f94971259007ad595aae4ed510e5e33306c96b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(splitbib.sty) \
texlive-splitbib"
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
