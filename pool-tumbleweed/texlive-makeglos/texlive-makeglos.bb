SUMMARY = "Include a glossary into a document"
DESCRIPTION = "The package provides the means to include a glossary into a \
document. The glossary is prepared by an external program, such \
as xindy or makeindex, in the same way that an index is made."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-makeglos-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "2d2df6535ad3e441d16c41f29f5eab84ec063ac2440c1704cd7941aa6f592307f7223f707a1fa2fd656ad616695665d232a4e8e4f0d9e6c00d596853988e7354"
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
