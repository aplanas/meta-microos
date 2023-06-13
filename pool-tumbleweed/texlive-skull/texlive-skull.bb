SUMMARY = "A font to draw a skull"
DESCRIPTION = "The font (defined in Metafont) defines a single character, a \
black solid skull. A package is supplied to make this character \
available as a symbol in maths mode."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1svn51907"

RPM_NAME = "texlive-skull-2023.201.0.0.1svn51907-57.1.noarch.rpm"
RPM_HASH = "cceb4fbb86263a21326ff96b3fa6de0b598c1bbb0f775e7540019ce0899e2858fb314f0da8db6d8a38f2dd177d2040cd4760c41fb7d49d1526ac2fe8b54a174f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(skull.sty) \
tex(skull.tfm) \
texlive-skull"

RDEPENDS:${PN} += "/bin/sh \
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
