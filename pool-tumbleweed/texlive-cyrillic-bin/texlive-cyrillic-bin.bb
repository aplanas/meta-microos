SUMMARY = "Cyrillic bibtex and makeindex"
DESCRIPTION = "The cyrillic-bin package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn62517"

RPM_NAME = "texlive-cyrillic-bin-2023.209.svn62517-55.1.noarch.rpm"
RPM_HASH = "b36aeae741049cd272ca122daa2f4893518ad87df1cb978ad3766dfd90ed1d5a8b7543d7297e231e67f3567f075469774bbbf4b6fdfdd57055a88588cb4d0c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cyrillic-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-cyrillic-bin-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
