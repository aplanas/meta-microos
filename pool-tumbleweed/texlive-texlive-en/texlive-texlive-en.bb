SUMMARY = "TeX Live manual (English)"
DESCRIPTION = "The texlive-en package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66572"

RPM_NAME = "texlive-texlive-en-2023.209.svn66572-55.1.noarch.rpm"
RPM_HASH = "6df900caba905ebe951d37042b17e5be8b0e441524bf3b2dcd5e44e558e6fd9da9637adff286c60a2aca72177a511d8d247a02d535981a129c007dc99f2f10e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-en"

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
