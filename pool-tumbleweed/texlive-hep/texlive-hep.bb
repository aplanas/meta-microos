SUMMARY = "A 'convenience wrapper' for High Energy Physics packages"
DESCRIPTION = "Loads the author's hepunits and hepnicenames packages, and a \
selection of others that are useful in High Energy Physics \
papers, etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-hep-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "68f6a0cda27056d64a6bed5fd8f4f74cb8019eee8b68062e8b23d1618c89b62f583f76dbaa07f4534562e9397058337325152ed1f5246fdd51ee46511dbb8136"
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
