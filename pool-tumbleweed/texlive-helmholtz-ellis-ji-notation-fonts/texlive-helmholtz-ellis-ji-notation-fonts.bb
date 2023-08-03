SUMMARY = "Severed fonts for texlive-helmholtz-ellis-ji-notation"
DESCRIPTION = "The  separated fonts package for texlive-helmholtz-ellis-ji-notation"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn55213"

RPM_NAME = "texlive-helmholtz-ellis-ji-notation-fonts-2023.209.1.1svn55213-54.1.noarch.rpm"
RPM_HASH = "8745097332cbf569cf3b84a12f7e2b87d86bbd197fb994b3e95ba3d26d4f1070bff1178978ec300e20a7f699fcc25d5059e069765ab86c8af2090174fdbe0fd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-helmholtz-ellis-ji-notation-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
