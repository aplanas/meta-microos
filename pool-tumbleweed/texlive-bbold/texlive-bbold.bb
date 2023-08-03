SUMMARY = "Sans serif blackboard bold"
DESCRIPTION = "A geometric sans serif blackboard bold font, for use in \
mathematics; Metafont sources are provided, as well as macros \
for use with LaTeX. The Sauter font package has Metafont \
parameter source files for building the fonts at more sizes \
than you could reasonably imagine. See the blackboard sampler \
for a feel for the font's appearance."
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.01svn17187"

RPM_NAME = "texlive-bbold-2023.209.1.01svn17187-54.1.noarch.rpm"
RPM_HASH = "0056703e9982d98a5ea556c23a700368e82b5b6b6e356ca7419f8c28f4d24b069c3cecdc4dda26c2ce82a8126b30228502fbcc05e7b4be0c927d4b8df00337b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Ubbold.fd \
tex-bbold.sty \
tex-bbold10.tfm \
tex-bbold12.tfm \
tex-bbold17.tfm \
tex-bbold5.tfm \
tex-bbold6.tfm \
tex-bbold7.tfm \
tex-bbold8.tfm \
tex-bbold9.tfm \
texlive-bbold"

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
