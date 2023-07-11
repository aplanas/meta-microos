SUMMARY = "Severed fonts for texlive-zapfding"
DESCRIPTION = "The  separated fonts package for texlive-zapfding"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn61719"

RPM_NAME = "texlive-zapfding-fonts-2023.201.svn61719-52.2.noarch.rpm"
RPM_HASH = "7c8767391a12cd684a6773ffd751c885c141853e535f3de194d1dc8e01988e5f75521c56f8ae1c9ea88a099093d12d29f70be7bfa83b2878e5b13ee30500057f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-dingbats \
texlive-zapfding-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
