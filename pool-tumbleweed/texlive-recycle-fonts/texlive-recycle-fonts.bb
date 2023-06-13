SUMMARY = "Severed fonts for texlive-recycle"
DESCRIPTION = "The  separated fonts package for texlive-recycle"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-recycle-fonts-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "01f91e1c00737bb98cf6aa6010b86c8d4a05fe3224aebe3ce6d8a10a244c1a1fc87e4a365621feb6e190d27d972fa959d1a27ae27096a6b689c5520f10a47f9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(recycle) \
texlive-recycle-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
