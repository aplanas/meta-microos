SUMMARY = "Formatting indexes"
DESCRIPTION = "This package provides a way to generate the format of index \
entries from within LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn52311"

RPM_NAME = "texlive-gindex-2023.201.0.0.2svn52311-52.1.noarch.rpm"
RPM_HASH = "6cc8d32f02211ebd50315e614f421696572d9f36ed144d4bdb57c56e9d8866e90ac7cc0f6d2c09c502dec86ea238f8e32d0eb5bae0dd7b9af291d4aa7c9b3a86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gindex.sty) \
texlive-gindex"

RDEPENDS:${PN} += "/bin/sh \
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
