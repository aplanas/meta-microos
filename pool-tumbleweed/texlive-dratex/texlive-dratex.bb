SUMMARY = "General drawing macros"
DESCRIPTION = "A low level (DraTex.sty) and a high-level (AlDraTex.sty) \
drawing package written entirely in TeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-dratex-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "93d06a7d0a45a07d86c247625cc76ea6488a5d9e1376ebcca4b1ad09fb7790fc06abafce9217cae693b77fa3fc09f527f742428ee0294aa2adf668949eaba804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-AlDraTex.sty \
tex-DraTex.sty \
tex-TeXProject.sty \
tex-wotree.sty \
texlive-dratex"

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
