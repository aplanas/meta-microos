SUMMARY = "Create handout for auditors of a talk"
DESCRIPTION = "In some fields of scholarship, a beamer does not offer good \
support when giving a talk in a proceeding. For example, in \
classical philology, the main sources are text, and it will be \
better to distribute a handout to the audience with extracts of \
the texts about which we will talk. The package supports \
preparation of such handouts when writing the talk."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6.0svn43962"

RPM_NAME = "texlive-handout-2023.201.1.6.0svn43962-53.2.noarch.rpm"
RPM_HASH = "d31812b5b9814d39074a225f4c40dc82ac74c7a11fa423f9113886cc50b7785c5d3839f6492535de5f8e4ec709eecb86e425dc6ed6a53e500315c489126cbb9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-handout.sty \
texlive-handout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-suffix.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
