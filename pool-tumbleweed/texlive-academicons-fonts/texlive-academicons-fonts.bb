SUMMARY = "Severed fonts for texlive-academicons"
DESCRIPTION = "The  separated fonts package for texlive-academicons"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.1_2svn62622"

RPM_NAME = "texlive-academicons-fonts-2023.209.1.9.1_2svn62622-55.1.noarch.rpm"
RPM_HASH = "43b1503ad5630d037890b5c6b264733cebb10ca1f5e9d473bf87671d6ca8d1d2b520328ebcf00deb3d52d1b4cc9937da6a693c2322142706fb332e327f0a0ce5"
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
