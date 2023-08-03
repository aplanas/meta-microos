SUMMARY = "Split and reorder your bibliography"
DESCRIPTION = "This package enables you to split a bibliography into several \
categories and subcategories. It does not depend on BibTeX: any \
bibliography may be split and reordered."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.17svn15878"

RPM_NAME = "texlive-splitbib-2023.209.1.17svn15878-58.1.noarch.rpm"
RPM_HASH = "4f264e4a00beba2994cf44785fb5f9751933db430bcf79d4143776ab9aaeb2ef6ced1709dd5665a18034ef13d7d3685094f8a6ee195cb76b793568ccce726efc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-splitbib.sty \
texlive-splitbib"

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
