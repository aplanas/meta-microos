SUMMARY = "Danish language module for glossaries package"
DESCRIPTION = "Danish language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-danish-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "6380a8a7396fb44652ea79f4ca005746324f39b0c2d9dd6ff513bf2debe4dd62d01a30d9500ffd400a15158c77c74869274ca0701bdad94dc1e52a70a2b19159"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-danish.ldf \
texlive-glossaries-danish"

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
