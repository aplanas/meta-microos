SUMMARY = "Per-page numbering of footnotes"
DESCRIPTION = "Allows footnotes on individual pages to be numbered from 1, \
rather than being numbered sequentially through the document."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-footnpag-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "669f383b7c5e1b3209270e0f7ba1510b6a3851fa6d3350a9a1fba24d085063e5f8d9b2daca1c6204fa7ee9fd259e2ff5b5bd18a9a1b42ec0539388c48cf833be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footnpag.sty \
texlive-footnpag"

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
