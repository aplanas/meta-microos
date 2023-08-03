SUMMARY = "Move floats to the end, leaving markers where they belong"
DESCRIPTION = "Place all floats on pages by themselves at the end of the \
document, optionally leaving markers like '[Figure 3 about \
here]' in the text near to where the figure (or table) would \
normally have occurred. Float types figure and table are \
recognised by the package, unmodified. Since several packages \
define other types of float, it is possible to register these \
float types with endfloat."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.7svn57090"

RPM_NAME = "texlive-endfloat-2023.209.2.7svn57090-54.1.noarch.rpm"
RPM_HASH = "1c1a55e806c2e077e455ec7b5aa80265658abed2a14da3a73c8224dfe46a4668e31c308dd4eb05b28abce2518cb448d412c03c20bd8143078d58d75e811f1482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endfloat.sty \
texlive-endfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
