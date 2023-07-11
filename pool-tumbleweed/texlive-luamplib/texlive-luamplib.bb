SUMMARY = "Use LuaTeX's built-in MetaPost interpreter"
DESCRIPTION = "The package enables the user to specify MetaPost diagrams \
(which may include colour specifications from the color or \
xcolor packages) into a document, using LuaTeX's built-in \
MetaPost library. The facility is only available in PDF mode."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.2.23.0svn61587"

RPM_NAME = "texlive-luamplib-2023.208.2.23.0svn61587-53.1.noarch.rpm"
RPM_HASH = "c7e32b124694c614fa8314739ece42ead16ae14e8864935d22742a56332890b68a947f01a446b273e1626fb50aaa141313f7aadce50bdf2e9a5f12765c638145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luamplib.sty \
texlive-luamplib"

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
