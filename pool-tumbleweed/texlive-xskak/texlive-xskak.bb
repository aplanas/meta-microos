SUMMARY = "An extension to the skak package for chess typesetting"
DESCRIPTION = "Xskak, as its prime function, saves information about a chess \
game for later use (e.g., to loop through a game to make an \
animated board). The package also extends the input that the \
parsing commands can handle and offers an interface to define \
and switch between indefinite levels of styles."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn51432"

RPM_NAME = "texlive-xskak-2023.209.1.5svn51432-53.1.noarch.rpm"
RPM_HASH = "88070a91bbec35106bef781fe1ca320e5272c14ead0304da87a320f1ffd00d5b475d6192eb6a6b9ba21789f407bceb3a82784d196111db4750b043a8e4e3069a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xskak-keys.sty \
tex-xskak-nagdef.sty \
tex-xskak.sty \
texlive-xskak"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chessboard.sty \
tex-etoolbox.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
