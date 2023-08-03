SUMMARY = "Algorithm handling in ConTeXt"
DESCRIPTION = "Support for typesetting algorithms (a port of the LaTeX package \
algorithmic, which was a predecessor of algorithmicx)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-algorithmic-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "96c3776fa7f2caa197d448b731f55bd2405b07b7e50578ff362ec3d4b49cb32609d268396d422c0b3c0011fa604ff8704fce3a37f6a0f58a981193e01000d7ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-algorithmic"

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
