SUMMARY = "Severed fonts for texlive-context"
DESCRIPTION = "The  separated fonts package for texlive-context"
LICENSE = "LPPL-1.0"

PV = "2023.204.svn66546"

RPM_NAME = "texlive-context-fonts-2023.204.svn66546-54.1.noarch.rpm"
RPM_HASH = "146fd8629701f3d37e883289cf1d519c846adef118af8dcb7f08fcef31075641d4fbad4890f684de998bdde6ca35732358015826add733b43d77e6b922533215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-contextnavigation \
texlive-context-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
