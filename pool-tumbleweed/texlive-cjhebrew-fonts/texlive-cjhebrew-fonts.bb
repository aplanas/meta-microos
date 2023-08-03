SUMMARY = "Severed fonts for texlive-cjhebrew"
DESCRIPTION = "The  separated fonts package for texlive-cjhebrew"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2asvn43444"

RPM_NAME = "texlive-cjhebrew-fonts-2023.209.0.0.2asvn43444-54.1.noarch.rpm"
RPM_HASH = "7f69d22da720ad860babc95d29617d78f0bdfc80f52f3458746c7d1bf06e95427c23c8f58cda67f21c6e7d34516c09b8626464983b44a2edd5cffe13190b41a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-cjheblsm \
font-cjhebltx \
texlive-cjhebrew-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
