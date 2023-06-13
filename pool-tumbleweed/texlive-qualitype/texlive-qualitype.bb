SUMMARY = "The QualiType font collection"
DESCRIPTION = "These 45 fonts were created by QualiType. With the kind \
permisison of John Colletti, these fonts have been released as \
free and open-source."
LICENSE = "OFL-1.1"

PV = "2023.201.svn54512"

RPM_NAME = "texlive-qualitype-2023.201.svn54512-53.1.noarch.rpm"
RPM_HASH = "cfa1b662e8e18d219df2e8742b82d7dbd9527e8678268692ba2e860141cafe1a86e21c097d8581ca0eae426f6f6b7aba6a1d01a9250edf7c83426fb83090d292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qualitype"

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
texlive-qualitype-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
