SUMMARY = "Severed fonts for texlive-zapfding"
DESCRIPTION = "The  separated fonts package for texlive-zapfding"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn61719"

RPM_NAME = "texlive-zapfding-fonts-2023.209.svn61719-53.1.noarch.rpm"
RPM_HASH = "7828bd6589f37cbc69a6993d91f4ed501607e1225dba5fff9c26c45fe06f6247e909185fc58c85c70a8a14c25c03f94e5c164f5ac9caac34267277775c2affcd"
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
