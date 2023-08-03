SUMMARY = "Add coffee stains to documents"
DESCRIPTION = "This package provides an essential feature that LaTeX has been \
missing for too long: It adds coffee stains to your documents. \
A lot of time can be saved by printing stains directly on the \
page rather than adding them manually."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.5.1svn59703"

RPM_NAME = "texlive-coffeestains-2023.209.0.0.5.1svn59703-54.1.noarch.rpm"
RPM_HASH = "71dcf60712a0b48641a44af4f988aa78dee5bdd452da8288dd58b94df1ffd43a77af1775cec9b567cf51c4cde45cfdf19e7aafbb8c00217fd58ef8cc0f945661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coffeestains.sty \
texlive-coffeestains"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
