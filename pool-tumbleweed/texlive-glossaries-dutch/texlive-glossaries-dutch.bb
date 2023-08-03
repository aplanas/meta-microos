SUMMARY = "Dutch language module for glossaries package"
DESCRIPTION = "Dutch language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn35685"

RPM_NAME = "texlive-glossaries-dutch-2023.209.1.1svn35685-54.1.noarch.rpm"
RPM_HASH = "3a67dc47821c394b03262e41d755948f32aaa803731ca41980eb3bebe64ba89348840d9a51515302a6fbe26c185b3aa6f3f9193c304b9793191e5bde02549905"
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
