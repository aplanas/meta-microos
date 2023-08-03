SUMMARY = "Severed fonts for texlive-cmexb"
DESCRIPTION = "The  separated fonts package for texlive-cmexb"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-cmexb-fonts-2023.209.svn54074-54.1.noarch.rpm"
RPM_HASH = "c7e6bf6290bb1daa0e09fd9cba8b1de9284550e4c5699b02a094128782e5bf3fe35398f07e890f185e21af0e88aee1dd6610726009b4fd7e4e6912be59e48d71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-computermodern \
texlive-cmexb-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
