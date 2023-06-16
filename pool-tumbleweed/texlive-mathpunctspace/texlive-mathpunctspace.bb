SUMMARY = "Control the space after punctuation in math expressions"
DESCRIPTION = "This package provides a mechanism to control the space after \
commas and semicolons in mathematical expressions."
LICENSE = "BSD-3-Clause"

PV = "2023.201.1.1svn46754"

RPM_NAME = "texlive-mathpunctspace-2023.201.1.1svn46754-52.1.noarch.rpm"
RPM_HASH = "49f8e87d100b5eaee423a10c72200ae7f6a032e515d894b2378ce0b39d8b06ca079792764321c6f750705bf6021c5fe6adcce37d616388021655e71e5c5a9501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mathpunctspace.sty \
texlive-mathpunctspace"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
