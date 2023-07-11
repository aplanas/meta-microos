SUMMARY = "Declare global variables"
DESCRIPTION = "This package allows the user to declare a variable which can \
then be used anywhere else in a document, including before it \
was declared."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn49962"

RPM_NAME = "texlive-globalvals-2023.201.1.1svn49962-53.2.noarch.rpm"
RPM_HASH = "35a20e0e9029f3244c2f8ea874312b396d52f7b16d4852a929b5b983abe2915e8b1d7e4fa8b6d736fbc182b055a7b664f687c576f11945cc651e6c6122b439b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-globalvals.sty \
texlive-globalvals"

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
