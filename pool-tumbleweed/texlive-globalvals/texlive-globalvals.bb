SUMMARY = "Declare global variables"
DESCRIPTION = "This package allows the user to declare a variable which can \
then be used anywhere else in a document, including before it \
was declared."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn49962"

RPM_NAME = "texlive-globalvals-2023.201.1.1svn49962-53.1.noarch.rpm"
RPM_HASH = "8457a725cda1c7ee228bb874f77e9852fce8a9bb3d0d04722243c6f0b4a3bfc7a77ffd484013c7904c7b74ba686af4dd5a3c6456dbda7d9efc5a4785a2414801"
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
