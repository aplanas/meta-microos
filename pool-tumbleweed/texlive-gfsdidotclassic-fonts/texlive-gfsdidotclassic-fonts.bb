SUMMARY = "Severed fonts for texlive-gfsdidotclassic"
DESCRIPTION = "The  separated fonts package for texlive-gfsdidotclassic"
LICENSE = "OFL-1.1"

PV = "2023.209.001.001svn52778"

RPM_NAME = "texlive-gfsdidotclassic-fonts-2023.209.001.001svn52778-53.1.noarch.rpm"
RPM_HASH = "2c08f471b2e28513a5a2213e85777e986652b3dffe6d745acece5e551963425ed978875e47105a0defe7da8549dc2f1bede80df6df207683e6ad0cb470a4e14a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font--lang=el \
font-gfsdidotclassic \
texlive-gfsdidotclassic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
