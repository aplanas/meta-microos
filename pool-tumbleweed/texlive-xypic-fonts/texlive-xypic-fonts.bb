SUMMARY = "Severed fonts for texlive-xypic"
DESCRIPTION = "The  separated fonts package for texlive-xypic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.8.9svn61719"

RPM_NAME = "texlive-xypic-fonts-2023.209.3.8.9svn61719-53.1.noarch.rpm"
RPM_HASH = "3fdc113015cdc07fd31deead318a802142a266d93c8c8e3598c07714f07d9653ebf4aff3942d21aa6ef88359c0470ef11167797aefbbff117f13fe079d788e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-xyatip \
font-xybsql \
font-xybtip \
font-xycirc \
font-xycmat \
font-xycmbt \
font-xydash \
font-xyeuat \
font-xyeubt \
font-xyluat \
font-xylubt \
texlive-xypic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
