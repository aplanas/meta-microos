SUMMARY = "Typeset bit pattern diagrams"
DESCRIPTION = "A package to typeset bit pattern diagrams such as those used to \
describe hardware, data format or protocols."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn39073"

RPM_NAME = "texlive-bitpattern-2023.201.svn39073-52.1.noarch.rpm"
RPM_HASH = "e33dcc52575e15ed66a5fefd6c09efc26c9011ea727ffb8bdd62d61f3cd84a6546b0c5bece5c1d9e3e0b948d9c51b040cfaa92ed0b8dc77501fc9eb27022d790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bitpattern.sty \
texlive-bitpattern"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-keyval.sty \
tex-multido.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
