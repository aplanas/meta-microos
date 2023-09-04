SUMMARY = "Severed fonts for texlive-xypic"
DESCRIPTION = "The  separated fonts package for texlive-xypic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.8.9svn61719"

RPM_NAME = "texlive-xypic-fonts-2023.209.3.8.9svn61719-53.2.noarch.rpm"
RPM_HASH = "71c3d28ce485f4af270037f4cb39690a423caeed0029c7583fcba1c43e4c9761e19b2404b4b0d7efc39e307e5ce58b730c00e10afe2e5df18078520ff3fb022a"
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
