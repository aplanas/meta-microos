SUMMARY = "Adjustments for publications in High Energy Physics"
DESCRIPTION = "This package makes some changes to the reference, citation and \
footnote macros to improve the default behavior of LaTeX for \
High Energy Physics publications."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64853"

RPM_NAME = "texlive-hep-reference-2023.209.1.1svn64853-54.2.noarch.rpm"
RPM_HASH = "dadfd6994057e87652a8d423a9f4f9a60000e5b4c8f39dfcb4e86fd7a73e7e78ad5056ba1ca9ce178a7ad0f4ce88ec8afc1e4bac55deed73e96fe0577a75f6d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-reference.sty \
texlive-hep-reference"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cleveref.sty \
tex-footnotebackref.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
