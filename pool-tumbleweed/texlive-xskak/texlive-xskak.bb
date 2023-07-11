SUMMARY = "An extension to the skak package for chess typesetting"
DESCRIPTION = "Xskak, as its prime function, saves information about a chess \
game for later use (e.g., to loop through a game to make an \
animated board). The package also extends the input that the \
parsing commands can handle and offers an interface to define \
and switch between indefinite levels of styles."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn51432"

RPM_NAME = "texlive-xskak-2023.201.1.5svn51432-52.2.noarch.rpm"
RPM_HASH = "b58f6086984c248c52e4b7e38172a02cd3b4afde2189b72ec542907f246a3e011c5b0b0c775bf1f764d71aa85f2351d012f8d1d52cecca82b6fe126657bcc8da"
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
