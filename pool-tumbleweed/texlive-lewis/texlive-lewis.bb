SUMMARY = "Draw Lewis structures"
DESCRIPTION = "The package provides rudimentary support for drawing Lewis \
Structures. Support is limited to elements that support the \
octet rule."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-lewis-2023.201.0.0.1svn15878-54.1.noarch.rpm"
RPM_HASH = "4d702cd5f46aa797cfdc22d09cdeb12697e349fab6e2f87476bff35801a275340052dd902d480059a43179bdb5407a0ba104eb3478f7ed172255987eff68af72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lewis.sty \
texlive-lewis"

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
