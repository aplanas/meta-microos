SUMMARY = "English language module for glossaries package"
DESCRIPTION = "English language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-english-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "1eb513e7a6548625d5583a46b9405974ac3bf6358c95ff1f44361ec66e810038fcdf562d08cb6610beea93c63b2eb9ddad72f4131cf27225c338e43e65bb73ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-english.ldf \
texlive-glossaries-english"

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
