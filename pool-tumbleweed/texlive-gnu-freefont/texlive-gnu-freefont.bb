SUMMARY = "A Unicode font, with rather wide coverage"
DESCRIPTION = "The package provides a set of outline (i.e. OpenType) fonts \
covering as much as possible of the Unicode character set. The \
set consists of three typefaces: one monospaced and two \
proportional (one with uniform and one with modulated stroke)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn29349"

RPM_NAME = "texlive-gnu-freefont-2023.209.svn29349-54.2.noarch.rpm"
RPM_HASH = "e208964ba5cc6b6398ce4b591dcf4921b071b3a918b5439ce452031cdcd5482d055ffc3afcc90abfdfc8d48985975d926516b5ff92683c130d2cf9cc5d93fff0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gnu-freefont"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-gnu-freefont-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
