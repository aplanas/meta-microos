SUMMARY = "Severed fonts for texlive-xypic"
DESCRIPTION = "The  separated fonts package for texlive-xypic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.8.9svn61719"

RPM_NAME = "texlive-xypic-fonts-2023.201.3.8.9svn61719-52.1.noarch.rpm"
RPM_HASH = "e8ee1596ed4d0c0e12c5f80bd63d288b1d875af1cdff63bba476b3cdf912e59eef6727a07d41613ac23082377b44430d148c86c59222b8a268d4cac41d0f4827"
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
