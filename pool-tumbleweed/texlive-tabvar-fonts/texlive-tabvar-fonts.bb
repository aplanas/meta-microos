SUMMARY = "Severed fonts for texlive-tabvar"
DESCRIPTION = "The  separated fonts package for texlive-tabvar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn63921"

RPM_NAME = "texlive-tabvar-fonts-2023.209.1.8svn63921-55.1.noarch.rpm"
RPM_HASH = "65ee7db8e142edeb9bf7c4ae838d92b7d782490d2fcbcf154ca73f8846fa984b213a2cbc5f1dea4142aac02a92089efb8dee53b914d0b990e121e0617f70cc6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-tabvar \
texlive-tabvar-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
