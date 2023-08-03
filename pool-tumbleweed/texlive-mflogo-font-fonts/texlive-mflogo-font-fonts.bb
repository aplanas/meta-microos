SUMMARY = "Severed fonts for texlive-mflogo-font"
DESCRIPTION = "The  separated fonts package for texlive-mflogo-font"
LICENSE = "SUSE-TeX"

PV = "2023.209.1.002svn54512"

RPM_NAME = "texlive-mflogo-font-fonts-2023.209.1.002svn54512-55.1.noarch.rpm"
RPM_HASH = "d70b62fe75b4c421d581f8d24db573d1f9e0db3849d4d18d6676bcdad8a0e655de09363d2bd632259c05cc0ecf643c58d7a7e17101a55358db015eedb4ffbb0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-logo10 \
font-logo8 \
font-logo9 \
font-logobf10 \
font-logod10 \
font-logosl10 \
font-logosl8 \
font-logosl9 \
texlive-mflogo-font-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
