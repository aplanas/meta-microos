SUMMARY = "Class for documentation"
DESCRIPTION = "An article-based class designed for use for documentation in \
high-technology companies."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0betasvn15878"

RPM_NAME = "texlive-hitec-2023.201.0.0.0betasvn15878-53.2.noarch.rpm"
RPM_HASH = "ae9ec667addbfe370cb233fc7f3bdaf96c159673f142c0a9125c914d0aeaffa5d8e9aeb2bc77f19aa0de87edfae691e5653ea97c7a4bfe91470fda9d69f3ff48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hitec.cls \
texlive-hitec"

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
