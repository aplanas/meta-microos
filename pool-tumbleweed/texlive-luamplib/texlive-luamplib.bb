SUMMARY = "Use LuaTeX's built-in MetaPost interpreter"
DESCRIPTION = "The package enables the user to specify MetaPost diagrams \
(which may include colour specifications from the color or \
xcolor packages) into a document, using LuaTeX's built-in \
MetaPost library. The facility is only available in PDF mode."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.23.0svn61587"

RPM_NAME = "texlive-luamplib-2023.201.2.23.0svn61587-52.1.noarch.rpm"
RPM_HASH = "551455e6bdd2d54be844f64e439346ea0ebd6e6fffa6a35147348bc3b70e6d12a18ef0268b1c4a1181dbe69636249ff7a9b96a8718af9335b2e8b9df93be2439"
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
