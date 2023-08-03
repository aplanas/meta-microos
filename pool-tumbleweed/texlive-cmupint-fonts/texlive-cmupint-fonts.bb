SUMMARY = "Severed fonts for texlive-cmupint"
DESCRIPTION = "The  separated fonts package for texlive-cmupint"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn54735"

RPM_NAME = "texlive-cmupint-fonts-2023.209.1.1svn54735-54.1.noarch.rpm"
RPM_HASH = "ef4b5f36421dfd2140e248eb3b15d27b9db7a64f172405a06448d5b3e82ea1912e390d5796145fdff158967bc9f0aabc9d0abe33d007f832b4c6d7c889330b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-cmupint \
texlive-cmupint-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
