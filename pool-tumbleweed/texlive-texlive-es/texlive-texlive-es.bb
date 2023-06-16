SUMMARY = "TeX Live manual (Spanish)"
DESCRIPTION = "The texlive-es package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66059"

RPM_NAME = "texlive-texlive-es-2023.201.svn66059-54.1.noarch.rpm"
RPM_HASH = "f9246ff60a327684f6a8ad535209569f3ca76c8feef33ab24c4353bf478c72c2d58e21f3ee4015cf4b424b35d2cc60b0e50ae4d47e8f448c8819e0092cf86b56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-es"

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
