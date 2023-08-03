SUMMARY = "Sans-serif mathematics"
DESCRIPTION = "sfmath is a simple package for sans serif maths in documents. \
After including the package, all maths of the current document \
is displayed with sans serif fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn15878"

RPM_NAME = "texlive-sfmath-2023.209.0.0.8svn15878-54.1.noarch.rpm"
RPM_HASH = "69bbcbe9ef30ca359aca6633bdc0764cd6d9ecc905096a57815714611d48f1493232fa1ba5e1fc68a5b9fd90bfb372b0fe62176c7b11c95eb24a3b923b9eab0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sfmath.sty \
texlive-sfmath"

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
