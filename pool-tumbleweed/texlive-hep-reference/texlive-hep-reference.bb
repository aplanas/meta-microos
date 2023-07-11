SUMMARY = "Adjustments for publications in High Energy Physics"
DESCRIPTION = "This package makes some changes to the reference, citation and \
footnote macros to improve the default behavior of LaTeX for \
High Energy Physics publications."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64853"

RPM_NAME = "texlive-hep-reference-2023.201.1.1svn64853-53.2.noarch.rpm"
RPM_HASH = "9b10e079eea293ce64208dd280bade82bf6bb19ccfc58edc68dafdc8530f2c86a35b1da6ea50859070e962cde73e2232f3b14a11a16bcb6c540f8ef61b6d68af"
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
