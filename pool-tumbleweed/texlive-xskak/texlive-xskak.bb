SUMMARY = "An extension to the skak package for chess typesetting"
DESCRIPTION = "Xskak, as its prime function, saves information about a chess \
game for later use (e.g., to loop through a game to make an \
animated board). The package also extends the input that the \
parsing commands can handle and offers an interface to define \
and switch between indefinite levels of styles."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn51432"

RPM_NAME = "texlive-xskak-2023.209.1.5svn51432-53.2.noarch.rpm"
RPM_HASH = "a633ef97e97534350ce6f3b24d659dd9b1f4fd8a52f08274fee219070ba893cdd13040c49d74bebc631a1624e559190fef1b27278961c99138db8c68babb6c4d"
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
