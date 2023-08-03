SUMMARY = "Severed fonts for texlive-velthuis"
DESCRIPTION = "The  separated fonts package for texlive-velthuis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.17.1svn66186"

RPM_NAME = "texlive-velthuis-fonts-2023.209.2.17.1svn66186-54.1.noarch.rpm"
RPM_HASH = "1ff76d5c27d08266e79aefd7131adc6f4b3fdab8840f5f2fb155a0f2272a6027cd3d024cde479d4618237e961f7ba387c237f615bc18f2c8c8d5be9d9847b14b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-velthuisdevanagari \
texlive-velthuis-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
