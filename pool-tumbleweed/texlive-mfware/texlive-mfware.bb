SUMMARY = "Supporting tools for use with Metafont"
DESCRIPTION = "A collection of programs (as web source) for processing the \
output of Metafont."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-mfware-2023.201.svn66186-54.1.noarch.rpm"
RPM_HASH = "07c1d85b09aa5f88c70c2eaef5ab8d7446012dc9f7350311c911805fdeca76cd0d3f9be739df9b63fcb9dfd137871198fa8463c3b055b36f1e66116aa3ef7fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mfware"

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
texlive-mfware-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
