SUMMARY = "Severed fonts for texlive-xypic"
DESCRIPTION = "The  separated fonts package for texlive-xypic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.8.9svn61719"

RPM_NAME = "texlive-xypic-fonts-2023.201.3.8.9svn61719-52.2.noarch.rpm"
RPM_HASH = "2ee3fcfa9d5cb3b4008b2f6456a800431cfc5615e0006c94cc69137423c97e5b89ebca12205a0038bbd6111a3080a4c44fc49d6fe36e23982b384a3be8242718"
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
