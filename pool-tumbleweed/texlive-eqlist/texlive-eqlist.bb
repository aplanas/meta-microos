SUMMARY = "Description lists with equal indentation"
DESCRIPTION = "This package provides a list environment which sets a \
description-like list in which the indentation corresponds to \
the longest item of the list."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn32257"

RPM_NAME = "texlive-eqlist-2023.201.2.1svn32257-53.1.noarch.rpm"
RPM_HASH = "7643528989e07f5f36e180a1be101c4926525d06400d478aad64dcfa6adda40b24ed87c8b62834f7478495d32ac993dca9f4060ef0cfcf06f578619287fc310f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eqlist.sty \
texlive-eqlist"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eqparbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
