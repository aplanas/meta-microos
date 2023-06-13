SUMMARY = "How to install AmiWeb2c"
DESCRIPTION = "This is a guide for the installation of (La)TeX with the Amiga \
port of Web2C named AmiWeb2C in the version 2.1 on an emulated \
Amiga 4000 computer running Workbench 3.1. Furthermore the \
installation of an ARexx server for calling LaTeX from an \
editor is described and some tips for the installation of new \
fonts are given."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn56878"

RPM_NAME = "texlive-amiweb2c-guide-2023.201.1.0svn56878-54.1.noarch.rpm"
RPM_HASH = "43d3826c31e652dfba7cc8fa02cf2d5f9b589d8c2b712369d74ab44a29bd4c7c9ff5836cbb0330465c44138b1ee96876b4811f34d1edc279fe81947b910d9e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amiweb2c-guide"

RDEPENDS:${PN} += "/bin/sh \
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
