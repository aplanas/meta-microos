SUMMARY = "Support for writing French in ConTeXt"
DESCRIPTION = "Deals with spacing around French punctuation; the package is \
distributed for ConTeXt Mark IV only."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn54215"

RPM_NAME = "texlive-context-french-2023.209.svn54215-55.1.noarch.rpm"
RPM_HASH = "7f5c723d069e751829aa8d0afc729fcc270a1366bedb8ded1b952133389078404a1405b348fb14f936b09ac87f1c682ab66025c989f832816dc6907ea09cc739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-french"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
