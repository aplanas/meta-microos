SUMMARY = "A set of units useful in high energy physics applications"
DESCRIPTION = "Hepunits is a LaTeX package built on the SIunits package which \
adds a collection of useful HEP units to the existing SIunits \
set. These include the energy units \\MeV, \\GeV, \\TeV and the \
derived momentum and mass units \\MeVoverc, \\MeVovercsq and so \
on."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn54758"

RPM_NAME = "texlive-hepunits-2023.201.2.0.0svn54758-53.2.noarch.rpm"
RPM_HASH = "0a6105cd02deb848c3f7da3bc9399c5731d778e601f44ec4051517fe34484fa18697e5e006be14768eb7134e09393f1494fe4077fe7ba9f2d035e17a0d7404db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hepunits.sty \
texlive-hepunits"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-ifthen.sty \
tex-siunitx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
