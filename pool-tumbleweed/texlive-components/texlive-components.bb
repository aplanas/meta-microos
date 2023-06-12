SUMMARY = "Components of TeX"
DESCRIPTION = "An introduction to the components and files users of TeX may \
encounter."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn63184"

RPM_NAME = "texlive-components-2023.201.svn63184-53.1.noarch.rpm"
RPM_HASH = "f4b9faa9db91d027928273ac1bd66106ce5f6b5831dac6d5d556222e62b4154abca0d8546aec415100c3c2196afae2ed48cfe55f08e63097cb7801e24734eec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-components"
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
