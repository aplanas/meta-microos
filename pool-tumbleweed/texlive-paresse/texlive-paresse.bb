SUMMARY = "Define simple macros for greek letters"
DESCRIPTION = "The package defines macros using SS to type greek letters so \
that the user may (for example) type SSa to get the effect of \
$\\alpha$. However, it takes care only of letters which have a \
macro name like \\alpha or \\Omega."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.0.2svn59228"

RPM_NAME = "texlive-paresse-2023.201.5.0.2svn59228-51.1.noarch.rpm"
RPM_HASH = "46173c5cd7b09f77f376718acbc05d91da38841dd122f9cf47d82a5249570eeb2aadb372532b465468bf6a17309d46fe020a98afbae20e31b19814fcd1f6b326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-paresse-old.sty \
tex-paresse-utf8.sty \
tex-paresse.sty \
texlive-paresse"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-iftex.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
