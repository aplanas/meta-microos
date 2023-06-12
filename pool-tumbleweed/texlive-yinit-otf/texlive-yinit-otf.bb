SUMMARY = "OTF conversion of Yannis Haralambous' Old German decorative initials"
DESCRIPTION = "This package is a conversion of the yinit font into OTF. \
Original Metafont files for yinit are in the yinit package."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn40207"

RPM_NAME = "texlive-yinit-otf-2023.201.1.0svn40207-52.1.noarch.rpm"
RPM_HASH = "0c20c759fa3ef89ca91d85cba678cfba524a0b4a13d2a1a78d5ecab675a2b6ecea77944c581fe78abcbafdbbaad58a15ed91e5fdb0490caa25534e5c2f7e4769"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yinit-otf"
RDEPENDS:${PN} += "/bin/sh \
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
