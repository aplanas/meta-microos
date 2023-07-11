SUMMARY = "Generate QR codes in LaTeX"
DESCRIPTION = "The package generates QR (Quick Response) codes in LaTeX, \
without the need for PSTricks or any other graphical package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.51svn36065"

RPM_NAME = "texlive-qrcode-2023.201.1.51svn36065-53.2.noarch.rpm"
RPM_HASH = "82d2f2da52cedf90e66cd3b7fe8bf660c6636d8819bfb645f8cf563f58382456e70491ddc4b80bb9b1c3b0399fc77117921210990b4c86903720d718ecf8d157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qrcode.sty \
texlive-qrcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
