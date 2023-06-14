SUMMARY = "Severed fonts for texlive-twemoji-colr"
DESCRIPTION = "The  separated fonts package for texlive-twemoji-colr"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.0svn64854"

RPM_NAME = "texlive-twemoji-colr-fonts-2023.201.0.0.7.0svn64854-52.1.noarch.rpm"
RPM_HASH = "e193c9f0eb3ca678058d57603a665632eea8d6c627b7e094621db9ef577aab21421dcb3fed373010da949cc47d63f6ca769996b10ff8c8a0d5dec61e96a714b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=und-zsye \
font-twemojimozilla \
texlive-twemoji-colr-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
