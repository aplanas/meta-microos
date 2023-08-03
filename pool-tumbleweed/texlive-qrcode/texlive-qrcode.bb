SUMMARY = "Generate QR codes in LaTeX"
DESCRIPTION = "The package generates QR (Quick Response) codes in LaTeX, \
without the need for PSTricks or any other graphical package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.51svn36065"

RPM_NAME = "texlive-qrcode-2023.209.1.51svn36065-54.1.noarch.rpm"
RPM_HASH = "2d977f46f3847bd7e58c4aa1df0cf5dda0f55a3fd0dfa8519762308b1684a87b1df7038ffc7798490a4af5fed8e005adafad666a8c877115e7f79a4de2c3f6c8"
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
