SUMMARY = "Severed fonts for texlive-recycle"
DESCRIPTION = "The  separated fonts package for texlive-recycle"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-recycle-fonts-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "845bad49d43675d8dd040aa3078cf4cd244e1c173f1190522a732da9df3e55e30cee2ff456a25203bcb39e3c8d5c02125472caff23f4aab08c5e5e80f21af648"
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
