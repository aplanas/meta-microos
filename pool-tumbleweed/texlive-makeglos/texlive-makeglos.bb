SUMMARY = "Include a glossary into a document"
DESCRIPTION = "The package provides the means to include a glossary into a \
document. The glossary is prepared by an external program, such \
as xindy or makeindex, in the same way that an index is made."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-makeglos-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "c92556ac4607a13bfb14336ac9f0a70a323a56cfcbdadc358df0c91915cb2760bb841702bf43a2cf09344d90ef9ec5887acaf28eb4df56c01d6edc68b5bbb707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makeglos.sty \
texlive-makeglos"

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
