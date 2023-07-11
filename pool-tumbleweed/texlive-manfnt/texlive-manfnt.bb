SUMMARY = "LaTeX support for the TeX book symbols"
DESCRIPTION = "A LaTeX package for easy access to the symbols of the Knuth's \
'manual' font, such as the Dangerous Bend and Manual-errata \
Arrow."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54684"

RPM_NAME = "texlive-manfnt-2023.208.svn54684-53.1.noarch.rpm"
RPM_HASH = "b4bc1432125e8e81f8bc31398d0dcd0050a9df68e31e401c81bd3cdc365cab4ab14e27b5707b62cd9f7c333df4e5c4e8d848051cb537e7223d468612f26a145c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-manfnt.sty \
texlive-manfnt"

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
