SUMMARY = "Severed fonts for texlive-recycle"
DESCRIPTION = "The  separated fonts package for texlive-recycle"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-recycle-fonts-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "e41da8859bb66ffb623c375ed40e6359ef3287ab1bde06882606f52be098ec98f31e559429f86979839f55e9a63c97a248a32e8a8e8b6a9ffcb395c7b770da0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-recycle \
texlive-recycle-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
