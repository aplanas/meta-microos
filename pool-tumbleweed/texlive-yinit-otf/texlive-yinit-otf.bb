SUMMARY = "OTF conversion of Yannis Haralambous' Old German decorative initials"
DESCRIPTION = "This package is a conversion of the yinit font into OTF. \
Original Metafont files for yinit are in the yinit package."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn40207"

RPM_NAME = "texlive-yinit-otf-2023.209.1.0svn40207-53.2.noarch.rpm"
RPM_HASH = "18e56b98c173dc1fb7eba4fb095b35c69c4c24a73d2103e2f9c2538156e778e1a47eb960b4a6a85b9e64c48b6635abd4dcc49de51071793a4277b2fd93a1eafa"
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
