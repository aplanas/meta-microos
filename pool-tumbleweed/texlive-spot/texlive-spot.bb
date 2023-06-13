SUMMARY = "Spotlight highlighting for Beamer"
DESCRIPTION = "The package allows dramatic highlighting of words and phrases \
by painting shapes around them. It is chiefly intended for use \
in Beamer presentations, but it can be used in other document \
classes as well."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn22408"

RPM_NAME = "texlive-spot-2023.201.1.1svn22408-57.1.noarch.rpm"
RPM_HASH = "9c0c41fb0e462ad8199cc481bae873d6da53e3949f05ee6afc337e5b6359edbdd11ee4836f519edac35d5000325a8ad7851ffdd91d1a04c0209fdd9954cc11ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(spot.sty) \
texlive-spot"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(afterpage.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
