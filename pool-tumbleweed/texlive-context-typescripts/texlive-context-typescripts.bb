SUMMARY = "Small modules to load various fonts for use in ConTeXt"
DESCRIPTION = "The package provides files offering interfaces to 33 publicly \
available fonts (or collections of fonts from the same \
foundry); each is available in a .mkii and a .mkiv version."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn60422"

RPM_NAME = "texlive-context-typescripts-2023.209.svn60422-55.1.noarch.rpm"
RPM_HASH = "e6ccc853c148364606e3845a44b1766fcb4956c3ef0c707d6ee0062a0639c385806488b3b1cea3e68a9c9835a17d42350a07dad268c24ce6da4fa3b5edb355d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-typescripts"

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
