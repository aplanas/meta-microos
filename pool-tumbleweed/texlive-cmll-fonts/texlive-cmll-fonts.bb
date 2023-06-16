SUMMARY = "Severed fonts for texlive-cmll"
DESCRIPTION = "The  separated fonts package for texlive-cmll"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17964"

RPM_NAME = "texlive-cmll-fonts-2023.201.svn17964-53.1.noarch.rpm"
RPM_HASH = "aba8a01782aa9f6c83d821909d55f88c51d0beb9f2d846fb15adebef9ec0631a623298e5a10e5ca7dba1e5bbbab4677c276fec974c85a0bacf47e05e2bea493a"
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
