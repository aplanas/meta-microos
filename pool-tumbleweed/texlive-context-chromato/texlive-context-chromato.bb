SUMMARY = "ConTeXt macros for chromatograms"
DESCRIPTION = "The module provides macros for drawing chromatograms."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-chromato-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "85d7936959700364c7cdd48f3275a570af6b2085f640fb74023719c7885bc05b81463784a64a7f608ea60d608aca068b0040078a6a77975755e4faa9089d9184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-chromato.tex \
texlive-context-chromato"

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
