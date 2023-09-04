SUMMARY = "Support DVI pos: specials used by ConTeXt DVI output"
DESCRIPTION = "The dvipos package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-dvipos-2023.209.svn66186-54.2.noarch.rpm"
RPM_HASH = "f5c45a54e9eddc81adbf5b25d8f011ab6a2cba0a45f21f37b9ed65580bb169e30357d05466a786565a21b4077be345ca156b237855a474c9f952f736e677827b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvipos.1 \
texlive-dvipos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvipos-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
