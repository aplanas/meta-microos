SUMMARY = "Severed fonts for texlive-dantelogo"
DESCRIPTION = "The  separated fonts package for texlive-dantelogo"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn38599"

RPM_NAME = "texlive-dantelogo-fonts-2023.209.0.0.03svn38599-55.1.noarch.rpm"
RPM_HASH = "a68021316372982f0d2bb60f3f4cc7c1cb604e1a7f5d58079d3bccb8795d3000b52fb5b2ed7df310d5c88e7a465d05800b4df5e3b321749d92ed28a343a2144a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-dantelogo-fonts \
font-dante \
texlive-dantelogo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
