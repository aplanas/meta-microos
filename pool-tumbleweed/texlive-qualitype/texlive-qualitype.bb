SUMMARY = "The QualiType font collection"
DESCRIPTION = "These 45 fonts were created by QualiType. With the kind \
permisison of John Colletti, these fonts have been released as \
free and open-source."
LICENSE = "OFL-1.1"

PV = "2023.209.svn54512"

RPM_NAME = "texlive-qualitype-2023.209.svn54512-54.2.noarch.rpm"
RPM_HASH = "fb3051c2cf86d5a51574442371d95933e39f37b5aba14f769cbd4bb2dcccd52af21cfe517fdcda84d45cb8f50cb78611a2bf636e5873508e8756ab4cbacb6908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qualitype"

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
texlive-qualitype-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
