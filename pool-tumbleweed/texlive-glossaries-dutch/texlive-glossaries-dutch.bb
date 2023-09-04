SUMMARY = "Dutch language module for glossaries package"
DESCRIPTION = "Dutch language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn35685"

RPM_NAME = "texlive-glossaries-dutch-2023.209.1.1svn35685-54.2.noarch.rpm"
RPM_HASH = "4e7bee7015367762a59fb240f0586440671c59145c6ed22f6819cfe4b2c6fd25d5b8b00a3b9f83ccf787111030d45ac63958a5ad355658a704716b8cd48cba96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-dutch.ldf \
texlive-glossaries-dutch"

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
