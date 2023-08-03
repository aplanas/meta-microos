SUMMARY = "Macros for scientific articles"
DESCRIPTION = "Known as 'Harvard macros', since written at that University."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-harvmac-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "9217c923d4beafde50722fc5d40bc160d357d1e2478eb5fd102dee287f877c6a61d58201aea19b205bace506f684f08799574ca62ca6d8bd3456310578a81b21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harvmac.tex \
texlive-harvmac"

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
