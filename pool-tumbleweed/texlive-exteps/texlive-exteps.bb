SUMMARY = "Include EPS figures in MetaPost"
DESCRIPTION = "Exteps is a module for including external EPS figures into \
MetaPost figures. It is written entirely in MetaPost, and does \
not therefore require any post processing of the MetaPost \
output."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.41svn19859"

RPM_NAME = "texlive-exteps-2023.209.0.0.41svn19859-53.1.noarch.rpm"
RPM_HASH = "a6812c49e89f8362186cc30ab8e09359647bb342d2d0dbec0bde789405c5e84391d4d9f143f581503d73596f118ecb85575b7d9e58330a834cd8c17a6237f7ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exteps"

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
