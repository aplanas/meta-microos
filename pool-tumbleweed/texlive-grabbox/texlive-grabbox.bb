SUMMARY = "Read an argument into a box and execute the code afterwards"
DESCRIPTION = "The package provides the command \\grabbox, which grabs an \
argument into a box and executes the code afterwards."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn65223"

RPM_NAME = "texlive-grabbox-2023.209.1.4svn65223-54.1.noarch.rpm"
RPM_HASH = "53329a69f024da9c8a5ea92fdf1f1d5d35f51f77ee0c8ab39ae9f8523516e3f34590aad047a56d81ed9d842a8d08c949e9662649e5c4232a3779f692eaf40140"
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
