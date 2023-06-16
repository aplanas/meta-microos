SUMMARY = "Slovenian translation of lshort"
DESCRIPTION = "A Slovenian translation of the Not So Short Introduction to \
LaTeX 2e."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.20svn55643"

RPM_NAME = "texlive-lshort-slovenian-2023.201.4.20svn55643-52.1.noarch.rpm"
RPM_HASH = "6f0bad785fce2570344daa28b86d704d34b0c978b236e0cb7411db16a0966f81df422ee93aee0135e234197c77c99ec7c64768604f4b12fd6363e3477617fea4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-slovenian"

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
