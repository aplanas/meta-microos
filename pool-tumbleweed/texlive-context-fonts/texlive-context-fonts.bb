SUMMARY = "Severed fonts for texlive-context"
DESCRIPTION = "The  separated fonts package for texlive-context"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66546"

RPM_NAME = "texlive-context-fonts-2023.209.svn66546-55.1.noarch.rpm"
RPM_HASH = "dcaf57bd838fedf7bbefd44336c63d6b922b2bf4b6c052b0e06582ca0a2fa5dadabe6f268102183aac7252d2c99c9fa47aadba7741de89729717440d294e9e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-contextnavigation \
texlive-context-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
