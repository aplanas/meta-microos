SUMMARY = "Severed fonts for texlive-esrelation"
DESCRIPTION = "The  separated fonts package for texlive-esrelation"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn37236"

RPM_NAME = "texlive-esrelation-fonts-2023.209.svn37236-53.1.noarch.rpm"
RPM_HASH = "b7988210089acb45b35d9b32f0b3b77b4edc400e2bd2e1896569c28ac09984f3fe9291ff9da27cb9fa2baa2287b845f8048f32d55592047ebffbd2fbf3ac4a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-esrelation10 \
texlive-esrelation-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
