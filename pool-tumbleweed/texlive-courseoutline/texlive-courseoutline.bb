SUMMARY = "Prepare university course outlines"
DESCRIPTION = "Courseoutline is a class designed to minimise markup in a \
tedious task that needs to be repeated often."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-courseoutline-2023.209.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "f70d6f8cc212edd5061d256f6d739affc83351b281995890127b6181b24f8087bf776a68cf261f328b87a0b866fe8865905f42f64db312e70d51a9573117a315"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-courseoutline.cls \
texlive-courseoutline"

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
