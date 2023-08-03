SUMMARY = "Draw Lewis structures"
DESCRIPTION = "The package provides rudimentary support for drawing Lewis \
Structures. Support is limited to elements that support the \
octet rule."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-lewis-2023.209.0.0.1svn15878-55.1.noarch.rpm"
RPM_HASH = "f4d8c55206cd9f9ed894fd083f77bc5492d0c54617e2ca849caaafbadb3313d584657e3ad275fca6fc84f435fb922cfafd675c152232e7ad23d6940e03260a08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lewis.sty \
texlive-lewis"

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
