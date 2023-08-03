SUMMARY = "Severed fonts for texlive-noto-emoji"
DESCRIPTION = "The  separated fonts package for texlive-noto-emoji"
LICENSE = "OFL-1.1"

PV = "2023.209.2.034svn62950"

RPM_NAME = "texlive-noto-emoji-fonts-2023.209.2.034svn62950-55.1.noarch.rpm"
RPM_HASH = "f0553ef506bc1901d33f89f33641e5de3951ac14b418dfc298d8c2d781aad54cb19f13c4db01cbd15db6ed1c71f93ccc01b094eb631e5ac668c156ee83b38e8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=und-zsye \
font-notocoloremoji \
font-notoemoji \
texlive-noto-emoji-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
