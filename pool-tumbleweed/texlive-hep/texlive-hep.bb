SUMMARY = "A 'convenience wrapper' for High Energy Physics packages"
DESCRIPTION = "Loads the author's hepunits and hepnicenames packages, and a \
selection of others that are useful in High Energy Physics \
papers, etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-hep-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "50b253105fbbbef4988c926806a668ca1b0a5b381f1c2104aa33d90df38b3cdead78d381af4625ad10afb39c66d64533be1a88391487be975e9b6ae62d0663c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep.sty \
texlive-hep"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-amsmath.sty \
tex-booktabs.sty \
tex-braket.sty \
tex-cancel.sty \
tex-caption.sty \
tex-ccaption.sty \
tex-cite.sty \
tex-fancyhdr.sty \
tex-feynmf.sty \
tex-hepnicenames.sty \
tex-hepunits.sty \
tex-hyperref.sty \
tex-morefloats.sty \
tex-setspace.sty \
tex-slashed.sty \
tex-subfigure.sty \
tex-tocbibind.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
