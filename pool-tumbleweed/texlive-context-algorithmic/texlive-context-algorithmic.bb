SUMMARY = "Algorithm handling in ConTeXt"
DESCRIPTION = "Support for typesetting algorithms (a port of the LaTeX package \
algorithmic, which was a predecessor of algorithmicx)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-algorithmic-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "81db696fb2a0139f05ab5a4f14cdab062d690f0af446324b87eaea9e06398f1ac8dc7bfcb83d0e1490275bcc7585556a01e92947f5e78756f61ab94bafe85c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-algorithmic"

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
