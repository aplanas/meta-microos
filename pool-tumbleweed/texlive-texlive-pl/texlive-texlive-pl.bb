SUMMARY = "TeX Live manual (Polish)"
DESCRIPTION = "The texlive-pl package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66576"

RPM_NAME = "texlive-texlive-pl-2023.209.svn66576-55.1.noarch.rpm"
RPM_HASH = "000580d289e4135348992a64c4414a75f55448e4ab9f2e5c110147387189b84f7174599fc1ae7bab2e489afbcc0b05a8df9acfdb6769f7abda954fdf42139995"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-pl"

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
