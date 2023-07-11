SUMMARY = "OTF conversion of Yannis Haralambous' Old German decorative initials"
DESCRIPTION = "This package is a conversion of the yinit font into OTF. \
Original Metafont files for yinit are in the yinit package."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn40207"

RPM_NAME = "texlive-yinit-otf-2023.201.1.0svn40207-52.2.noarch.rpm"
RPM_HASH = "ab08ee9b407cd04ae9aba523fdb1a605ebe78a5a7465f95a726e50299486f14fd99e7bf042935d26465a1c85b3a56f50a6ea01df2e3dcbfc205a3b6fa7cb6260"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yinit-otf"

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
texlive-scripts-bin \
texlive-yinit-otf-fonts"

inherit rpm
