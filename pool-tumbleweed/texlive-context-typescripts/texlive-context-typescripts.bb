SUMMARY = "Small modules to load various fonts for use in ConTeXt"
DESCRIPTION = "The package provides files offering interfaces to 33 publicly \
available fonts (or collections of fonts from the same \
foundry); each is available in a .mkii and a .mkiv version."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn60422"

RPM_NAME = "texlive-context-typescripts-2023.204.svn60422-54.1.noarch.rpm"
RPM_HASH = "8a153e4fa9e5b2477c73e4c78faee84c4c34f25043e8d7813d3907badbbeaaca4ab343d748bcbffe3f49e8d08d6520eacf729769dab90f3cbdeaf852ba032f0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-typescripts"

RDEPENDS:${PN} += "/bin/sh \
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
