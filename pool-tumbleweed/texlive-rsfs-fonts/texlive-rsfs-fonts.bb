SUMMARY = "Severed fonts for texlive-rsfs"
DESCRIPTION = "The  separated fonts package for texlive-rsfs"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-rsfs-fonts-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "d7ea59848a5d2a57df255b9b64637babe373b3d3c1d4e0904a58a8b4caa679d19c51df8d56876ec350fcb92041a95c52096a2cc7da080856078ebaaea4bde4b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-rsfs10 \
font-rsfs5 \
font-rsfs7 \
texlive-rsfs-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
