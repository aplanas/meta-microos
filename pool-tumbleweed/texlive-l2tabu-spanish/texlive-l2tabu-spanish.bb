SUMMARY = "Spanish translation of 'Obsolete packages and commands'"
DESCRIPTION = "A Spanish translation of the l2tabu practical guide to LaTeX2e \
by Mark Trettin. A list of obsolete packages, commands and \
usages."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-l2tabu-spanish-2023.201.1.1svn15878-55.1.noarch.rpm"
RPM_HASH = "be0fa4655018a8e81b3cc5389cc5e476adc66953660f19a808030d078401e047f11740a964c3c4277a19b0a00c4fda66ea5b8efe3d0649d130f17f52e4910e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l2tabu-spanish"
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
