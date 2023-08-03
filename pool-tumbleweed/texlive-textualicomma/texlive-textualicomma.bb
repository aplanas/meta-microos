SUMMARY = "Use the textual comma character as decimal separator in math mode"
DESCRIPTION = "The package is based on the icomma package, and intended as a \
solution for situations where the text comma character discerns \
from the math comma character, e. g. when fonts whithout math \
support are involved. Escaping to text mode every time a comma \
is used in math mode may slow down the compilation process."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48474"

RPM_NAME = "texlive-textualicomma-2023.209.1.1svn48474-55.1.noarch.rpm"
RPM_HASH = "0873c3f1f7d557966946c2d5cbae3e7348f73127e3af804d211f265be43c29f4a8b99680656fc1f19fc30eb67d354b893ee7b7303f2091630af376ee8e74ffe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textualicomma.sty \
texlive-textualicomma"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amstext.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
