SUMMARY = "Severed fonts for texlive-academicons"
DESCRIPTION = "The  separated fonts package for texlive-academicons"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9.1_2svn62622"

RPM_NAME = "texlive-academicons-fonts-2023.201.1.9.1_2svn62622-54.1.noarch.rpm"
RPM_HASH = "ba8d1b828381181254f7371861e8d5f8b9622457dae35cca630eb6ee15cde02d1c6c22de8d068f4686a75a816f4b79246eb850a2bd1666ca3d48ce830766d169"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-academicons \
texlive-academicons-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
