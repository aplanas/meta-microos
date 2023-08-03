SUMMARY = "Type 1 versions of wasy fonts"
DESCRIPTION = "Converted (Adobe Type 1) outlines of the wasy fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.001.002svn53534"

RPM_NAME = "texlive-wasy-type1-2023.209.001.002svn53534-54.1.noarch.rpm"
RPM_HASH = "7e9374de85c8961b6ec893e93a0954ffc641922b7db4105d0ff66beebf21cb5cf85e3b03ac76a9b8c28791a0c0c011c4b6978539db5955a2dd2953f80e895dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-wasy.map \
texlive-wasy-type1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-wasy \
texlive-wasy-type1-fonts"

inherit rpm
