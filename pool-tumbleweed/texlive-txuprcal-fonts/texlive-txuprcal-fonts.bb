SUMMARY = "Severed fonts for texlive-txuprcal"
DESCRIPTION = "The  separated fonts package for texlive-txuprcal"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.00svn43327"

RPM_NAME = "texlive-txuprcal-fonts-2023.201.1.00svn43327-52.1.noarch.rpm"
RPM_HASH = "e375138e65c3c59634863d93a0eaedb48f482c7e6a05ea0282b9c341871b2c0a3bd9d880a8070bb4643a3b6d2b03598b83d7af8a89af630de05b195c96bad69a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(txuprcal) \
texlive-txuprcal-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
