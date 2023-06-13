SUMMARY = "Check citation commands in a document"
DESCRIPTION = "The package provides a lua script written for the sole purpose \
of detecting undefined and unused references from LaTeX \
auxiliary or bibliography files."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6svn64155"

RPM_NAME = "texlive-checkcites-2023.201.2.6svn64155-53.1.noarch.rpm"
RPM_HASH = "ee51894c67ea630661a6e41c52f044d77595f44b800dbd9ab9596d761cf79a8013dade53ea282216985ea4528be19fe62187f8f024b6030414e3e0737460ed93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-checkcites"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-checkcites-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
