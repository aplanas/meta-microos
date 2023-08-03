SUMMARY = "Severed fonts for texlive-cmll"
DESCRIPTION = "The  separated fonts package for texlive-cmll"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17964"

RPM_NAME = "texlive-cmll-fonts-2023.209.svn17964-54.1.noarch.rpm"
RPM_HASH = "5259362efab02ca3c4b4d840fe337e0c6be7629ef2cd8b29767676650ca1a65ba998bf1c582431a9aa3bd931469ee4f747258a7bf263857e64116ad691a80a3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-cmll \
font-cmllsans \
font-eull \
texlive-cmll-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
