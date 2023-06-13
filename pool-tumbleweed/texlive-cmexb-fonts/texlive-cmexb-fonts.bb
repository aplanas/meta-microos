SUMMARY = "Severed fonts for texlive-cmexb"
DESCRIPTION = "The  separated fonts package for texlive-cmexb"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-cmexb-fonts-2023.201.svn54074-53.1.noarch.rpm"
RPM_HASH = "f9508bd63a8f55de3bf2364fdd9a1d7b0fd0a5b344a38d3a34614c67da6b1151688167fb1f98f76d03d7d472c39e45babc2f1131d803cefd60ecb861bb3d01ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(computermodern) \
texlive-cmexb-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
