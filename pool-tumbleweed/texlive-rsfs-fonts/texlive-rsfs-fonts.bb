SUMMARY = "Severed fonts for texlive-rsfs"
DESCRIPTION = "The  separated fonts package for texlive-rsfs"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-rsfs-fonts-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "6c9e4a754fea6c0bfff40900e4143b1c8b5b3cc1af5b3831b46fcedafaf6613c5711a75d8a7cbe0d25d42751371d306c03f4310761fb881479eba610a9cd2055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-rsfs10 \
font-rsfs5 \
font-rsfs7 \
texlive-rsfs-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
