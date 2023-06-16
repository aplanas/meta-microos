SUMMARY = "Write numbers as cyrillic glyphs"
DESCRIPTION = "The package extends ConTeXt's system of number conversion, by \
adding numeration using cyrillic letters."
LICENSE = "BSD-3-Clause"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-cyrillicnumbers-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "22137eb743c1ad297664457d619d711a739ed2d579ec7b024a2988a79a996ee3c961925cad932c547c644c09f126e82d9e7944134995ca26f6ef535eba73e603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-cyrillicnumbers"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
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
