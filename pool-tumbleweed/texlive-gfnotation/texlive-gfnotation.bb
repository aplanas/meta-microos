SUMMARY = "Typeset Gottlob Frege's notation in plain TeX"
DESCRIPTION = "The package implements macros for plain TeX to typeset the \
notation invented by Gottlob Frege in 1879 for his books \
'Begriffsschrift' and 'Grundgesetze der Arithmetik' (two \
volumes). The output styles of both books are supported."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.9svn37156"

RPM_NAME = "texlive-gfnotation-2023.209.2.9svn37156-53.1.noarch.rpm"
RPM_HASH = "c2b3f0c525075958f4333e2346c2a192504d74c46d83d46af019cdf495cc12a356f8bdaf8edaf6a01aab5db3c2a181807d87a2f45b2501e566c5b130130bd796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-GFnotation.tex \
texlive-gfnotation"

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
