SUMMARY = "Severed fonts for texlive-gfsporson"
DESCRIPTION = "The  separated fonts package for texlive-gfsporson"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn18651"

RPM_NAME = "texlive-gfsporson-fonts-2023.209.1.01svn18651-53.1.noarch.rpm"
RPM_HASH = "0be83326c4a34bcd575aeb8be4ac07ed22cb74a22854afeb77b30069bfa67ec8ebae466c2d91bfbfbe4c4c7354491ec2840cd06695a797281f049be03503fa38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-gfsporson-fonts \
font--lang=el \
font-gfsporson \
font-gfsporsonrg \
texlive-gfsporson-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
