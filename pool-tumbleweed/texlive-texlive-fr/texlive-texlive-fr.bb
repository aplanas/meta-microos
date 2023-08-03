SUMMARY = "TeX Live manual (French)"
DESCRIPTION = "The texlive-fr package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66571"

RPM_NAME = "texlive-texlive-fr-2023.209.svn66571-55.1.noarch.rpm"
RPM_HASH = "31e2e0dd4efcaf742780a0da28dbe36620015476f86a9bcc69c95f2d32e4585520b29a04e584bb7b537fae0a9e255a97ca9aa2f8cedb4297c76535090fe31b7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-fr"

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
