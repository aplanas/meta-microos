SUMMARY = "Linear A script fonts"
DESCRIPTION = "The linearA package provides a simple interface to two fonts \
which include all known symbols, simple and complex, of the \
Linear A script. This way one can easily replicate Linear A \
'texts' using modern typographic technology. Note that the \
Linear A script has not been deciphered yet and probably never \
will be deciphered."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63169"

RPM_NAME = "texlive-lineara-2023.209.svn63169-55.1.noarch.rpm"
RPM_HASH = "fbe3e4ef62ca0b820fd138012a68a0cb0cf62581c4945296e0c32f670317033473709f956e0040b820b2ef6432e4496677d6337af99b6129c975b26182227518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LinearA.tfm \
tex-LinearACmplxSigns.tfm \
tex-linearA.map \
tex-linearA.sty \
texlive-lineara"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-lineara-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
