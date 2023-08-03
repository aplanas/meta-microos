SUMMARY = "Severed fonts for texlive-fontmfizz"
DESCRIPTION = "The  separated fonts package for texlive-fontmfizz"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn43546"

RPM_NAME = "texlive-fontmfizz-fonts-2023.209.svn43546-53.1.noarch.rpm"
RPM_HASH = "24a8338d3c1d5dfb219ebafc858489b1ec10d2b0dd48f2e4605bd721abaa08dd4c5faaf2ece0b66eb6e1109d912dce11cc79b9a7bf6de38e0c529c2ad29211d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-font-mfizz \
texlive-fontmfizz-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
