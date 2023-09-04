SUMMARY = "Greek encoding support for inputenc"
DESCRIPTION = "The bundle provides UTF-8, Macintosh Greek encoding and ISO \
8859-7 definition files for use with inputenc."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8.2svn66296"

RPM_NAME = "texlive-greek-inputenc-2023.209.1.8.2svn66296-54.2.noarch.rpm"
RPM_HASH = "96fbe1f0649676852b5c60ff5931fb08b186017da8938f6cb9dcde8c6996f7d2a83f6a89d9c99dd1f3ca72366e4f6599a505012d3880f2e7fcbc3ff54468acf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iso-8859-7.def \
tex-macgreek.def \
texlive-greek-inputenc"

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
