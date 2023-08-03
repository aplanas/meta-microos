SUMMARY = "Severed fonts for texlive-old-arrows"
DESCRIPTION = "The  separated fonts package for texlive-old-arrows"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn42872"

RPM_NAME = "texlive-old-arrows-fonts-2023.209.2.0svn42872-55.1.noarch.rpm"
RPM_HASH = "07435c520beca5d76ab46818387d4c9342210463a7aa764d5ce19f340c374deb587ae6337c502e6d79fd102ed2149e910deadceb80f5cf80164b60b3ae4892ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-oldarrows \
texlive-old-arrows-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
