SUMMARY = "Severed fonts for texlive-scanpages"
DESCRIPTION = "The  separated fonts package for texlive-scanpages"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05asvn42633"

RPM_NAME = "texlive-scanpages-fonts-2023.209.1.05asvn42633-54.1.noarch.rpm"
RPM_HASH = "0a89d9bd513c793ef6509a5bc6275acca79be38dbcb58ddacd270033411385c8d376337ab44ff49b3939a4d3e3c59652b5b98cd577a93904f357786d94002df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-scanwipe \
texlive-scanpages-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
