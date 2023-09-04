SUMMARY = "A 'convenience wrapper' for High Energy Physics packages"
DESCRIPTION = "Loads the author's hepunits and hepnicenames packages, and a \
selection of others that are useful in High Energy Physics \
papers, etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-hep-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "92e6dcd2a5bc38ee73cdaae4cedc8ff28c91c7c002191d3e2c2a3a152bc15016a1f42fb5d1a6b7221fc2f961b52656c05f41f84c6771b39856652e6cdec0d109"
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
