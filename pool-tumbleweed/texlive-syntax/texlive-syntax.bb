SUMMARY = "Creation of syntax diagrams"
DESCRIPTION = "Create syntax diagrams using special environments and commands \
to represent the diagram structure."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-syntax-2023.209.svn15878-58.1.noarch.rpm"
RPM_HASH = "f2c31f2b0eee9a6b92ee79db0fb7bfc24c4ced2bdca73d69773e9c87f241c9168dfaa56281b661e47550837a4fd172315d04e839f79e7cd50fd7d6f220816ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-syntax.tex \
texlive-syntax"

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
