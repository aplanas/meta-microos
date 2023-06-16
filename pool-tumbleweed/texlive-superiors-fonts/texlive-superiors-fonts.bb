SUMMARY = "Severed fonts for texlive-superiors"
DESCRIPTION = "The  separated fonts package for texlive-superiors"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn51909"

RPM_NAME = "texlive-superiors-fonts-2023.201.1.06svn51909-57.1.noarch.rpm"
RPM_HASH = "7bf941799c90c5cd68da4bcb55f8448f5bc21a4384b328afcea2adf1a0f0258d03fce9e98b4a63d3adcc920c734aaef57625816829146d773c06da8b34115719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-libertinesups \
texlive-superiors-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
