SUMMARY = "Severed fonts for texlive-mxedruli"
DESCRIPTION = "The  separated fonts package for texlive-mxedruli"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.3csvn30021"

RPM_NAME = "texlive-mxedruli-fonts-2023.209.3.3csvn30021-55.1.noarch.rpm"
RPM_HASH = "38607233b25dd211862a3b8a022bef1757b95c99dd832f13ac7df9b56498fc0c61767ab1698df721d5d7a5d9fc1d324438f3c55c4558f0fc6d7be0b85d99c60f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-mxed10 \
font-mxedbf10 \
font-mxedc10 \
font-mxedi10 \
font-xuc10 \
texlive-mxedruli-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
