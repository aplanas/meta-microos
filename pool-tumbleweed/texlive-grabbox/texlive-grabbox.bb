SUMMARY = "Read an argument into a box and execute the code afterwards"
DESCRIPTION = "The package provides the command \\grabbox, which grabs an \
argument into a box and executes the code afterwards."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn65223"

RPM_NAME = "texlive-grabbox-2023.201.1.4svn65223-53.2.noarch.rpm"
RPM_HASH = "2f3850ff82275b6320e5c9e025c7e5e16fca8f218a228e0bb96f41884ce4f43084f506c4b5f48332375d3bb247cdd54b7094c0f0f775bc3a804cda4b096d126e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grabbox.sty \
texlive-grabbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
