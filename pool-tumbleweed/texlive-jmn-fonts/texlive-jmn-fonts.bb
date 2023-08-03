SUMMARY = "Severed fonts for texlive-jmn"
DESCRIPTION = "The  separated fonts package for texlive-jmn"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45751"

RPM_NAME = "texlive-jmn-fonts-2023.209.svn45751-56.1.noarch.rpm"
RPM_HASH = "59294b8723e0c1037450ea3a3017feda7841e4782a8662a01a6dc9414fbdcb8c6260518a4cc12412ae942da18594168915ff7f5b8993e5f0a12f9fd936fc8555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-hans \
font-hans-sh \
texlive-jmn-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
