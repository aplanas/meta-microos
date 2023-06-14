SUMMARY = "Linear A script fonts"
DESCRIPTION = "The linearA package provides a simple interface to two fonts \
which include all known symbols, simple and complex, of the \
Linear A script. This way one can easily replicate Linear A \
'texts' using modern typographic technology. Note that the \
Linear A script has not been deciphered yet and probably never \
will be deciphered."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63169"

RPM_NAME = "texlive-lineara-2023.201.svn63169-54.1.noarch.rpm"
RPM_HASH = "f0e3a4b205b48c55ca8970303b513e907a32d742b0724c2accce8fec93344986bdcaf389e747b97abbf76fa316d3d2cbb346691ac9f6bb441d7a7a3ce8720ad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-LinearA.tfm \
tex-LinearACmplxSigns.tfm \
tex-linearA.map \
tex-linearA.sty \
texlive-lineara"

RDEPENDS:${PN} += "/bin/sh \
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
