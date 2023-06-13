SUMMARY = "An extension to the skak package for chess typesetting"
DESCRIPTION = "Xskak, as its prime function, saves information about a chess \
game for later use (e.g., to loop through a game to make an \
animated board). The package also extends the input that the \
parsing commands can handle and offers an interface to define \
and switch between indefinite levels of styles."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn51432"

RPM_NAME = "texlive-xskak-2023.201.1.5svn51432-52.1.noarch.rpm"
RPM_HASH = "fb3c0f5be88c6f1f212fe74ea182bd447dec911d0e7205da462d778fa7dbb688b3b0014b35dfbbb550e437f58782542552a329ac96a0cd433309276b09663bc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xskak-keys.sty) \
tex(xskak-nagdef.sty) \
tex(xskak.sty) \
texlive-xskak"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(chessboard.sty) \
tex(etoolbox.sty) \
tex(xifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
