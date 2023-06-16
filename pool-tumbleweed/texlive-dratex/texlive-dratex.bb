SUMMARY = "General drawing macros"
DESCRIPTION = "A low level (DraTex.sty) and a high-level (AlDraTex.sty) \
drawing package written entirely in TeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-dratex-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "bb05b902a4f2043d34d8951bc0a7acd5db41df10081a109e49d0efb77394197266f145686ef6d67ce882b8d8fe974619a37c14aff32f6115e6189667d9332a3a"
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
