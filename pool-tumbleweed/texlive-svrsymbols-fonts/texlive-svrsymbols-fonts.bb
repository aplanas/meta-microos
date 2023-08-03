SUMMARY = "Severed fonts for texlive-svrsymbols"
DESCRIPTION = "The  separated fonts package for texlive-svrsymbols"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn50019"

RPM_NAME = "texlive-svrsymbols-fonts-2023.209.2.0bsvn50019-58.1.noarch.rpm"
RPM_HASH = "85b3695b03753cd12b153966d64b3fc4a6ced8e0249e31b0d1231bb2f077343eabd385a20ffc7abc7c4f7487147ba6aea61629004a5e81d00bcd0809bea57a6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-svrsymbols-fonts \
font-svrsymbols \
texlive-svrsymbols-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
