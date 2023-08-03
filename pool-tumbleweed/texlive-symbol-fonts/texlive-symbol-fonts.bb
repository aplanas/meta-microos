SUMMARY = "Severed fonts for texlive-symbol"
DESCRIPTION = "The  separated fonts package for texlive-symbol"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn61719"

RPM_NAME = "texlive-symbol-fonts-2023.209.svn61719-58.1.noarch.rpm"
RPM_HASH = "898f700dac942bf9e77601687012acfc5255a46bfd96f32f3f47bde38ec9dd206dbc434b992c09abfd728aa26731ebec8a8a5712dcbe0356a62ca254c3f01797"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-standardsymbolsl \
texlive-symbol-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
