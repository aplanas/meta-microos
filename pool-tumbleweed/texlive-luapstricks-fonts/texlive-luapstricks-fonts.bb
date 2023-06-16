SUMMARY = "Severed fonts for texlive-luapstricks"
DESCRIPTION = "The  separated fonts package for texlive-luapstricks"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn65913"

RPM_NAME = "texlive-luapstricks-fonts-2023.201.0.0.8svn65913-52.1.noarch.rpm"
RPM_HASH = "d0205ac31ea6c760b2c7b0fba5af3ffe0c20ec7d7dae1a30b4340c4301dc106efb53747318dc2e3480ff9fe360459ce2212c95f812d9b94129c5ad636d0c3d81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-pstricksdotfont \
texlive-luapstricks-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
