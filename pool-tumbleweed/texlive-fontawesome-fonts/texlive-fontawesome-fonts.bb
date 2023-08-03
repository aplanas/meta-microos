SUMMARY = "Severed fonts for texlive-fontawesome"
DESCRIPTION = "The  separated fonts package for texlive-fontawesome"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.6.3.2svn48145"

RPM_NAME = "texlive-fontawesome-fonts-2023.209.4.6.3.2svn48145-53.1.noarch.rpm"
RPM_HASH = "7534426caa6cadc21dc05eccc652bcd12a6785807d1bdeab6b5a60698b0cdc85f507b89938e2ef318434d245f398e6246ff0b417f38531d7798f0fc4af38937e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-fontawesome-fonts \
font-fontawesome \
texlive-fontawesome-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
