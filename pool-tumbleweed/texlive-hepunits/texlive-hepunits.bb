SUMMARY = "A set of units useful in high energy physics applications"
DESCRIPTION = "Hepunits is a LaTeX package built on the SIunits package which \
adds a collection of useful HEP units to the existing SIunits \
set. These include the energy units \\MeV, \\GeV, \\TeV and the \
derived momentum and mass units \\MeVoverc, \\MeVovercsq and so \
on."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn54758"

RPM_NAME = "texlive-hepunits-2023.209.2.0.0svn54758-54.1.noarch.rpm"
RPM_HASH = "6b58e6364e23b3740e695c964f05d4dd5cca6d683b7fa9663326de275c0a71e2b27daaa7ff2526e4e7846672000cc8b8bb35002b84cd10a20f1fa0fc01470c98"
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
