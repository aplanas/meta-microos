SUMMARY = "Greek encoding support for inputenc"
DESCRIPTION = "The bundle provides UTF-8, Macintosh Greek encoding and ISO \
8859-7 definition files for use with inputenc."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8.2svn66296"

RPM_NAME = "texlive-greek-inputenc-2023.201.1.8.2svn66296-53.1.noarch.rpm"
RPM_HASH = "95d152ce65166f2ed5515321e446c7d295abe5494191ad2d9d6088653e4e7c283f15055bfb5b96c0c630098c96097fedc4f0b30d1ff03b081a6bc741ea720e8c"
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
