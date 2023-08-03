SUMMARY = "Severed fonts for texlive-chemarrow"
DESCRIPTION = "The  separated fonts package for texlive-chemarrow"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.9svn17146"

RPM_NAME = "texlive-chemarrow-fonts-2023.209.0.0.9svn17146-54.1.noarch.rpm"
RPM_HASH = "db90526c2f5f1d947e7a2a81b4cc967668c575e61579d1202bfb4d192ac3a2470c03305223c0be75438d0d425102efe0c5aeac869dea689a0bf7c4ee2b5485dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-arrow \
texlive-chemarrow-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
