SUMMARY = "Support for a5 paper sizes"
DESCRIPTION = "Superceded by geometry."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.4svn17020"

RPM_NAME = "texlive-a5comb-2023.209.4svn17020-55.1.noarch.rpm"
RPM_HASH = "9efe45765a869aeb16bbfd53a9cd06638353084ef72b283840b06ac11dd210ed45171fd3aea089c3f63b56664c6982d4ec66ed286e5ab0853f4496ddc5bc37ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-a5comb.sty \
texlive-a5comb"

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
