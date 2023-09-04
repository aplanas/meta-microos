SUMMARY = "A set of units useful in high energy physics applications"
DESCRIPTION = "Hepunits is a LaTeX package built on the SIunits package which \
adds a collection of useful HEP units to the existing SIunits \
set. These include the energy units \\MeV, \\GeV, \\TeV and the \
derived momentum and mass units \\MeVoverc, \\MeVovercsq and so \
on."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn54758"

RPM_NAME = "texlive-hepunits-2023.209.2.0.0svn54758-54.2.noarch.rpm"
RPM_HASH = "bf6cb7cada1f3104cc8fb662c9db5de86ca855dfe3befb499ec7fcae4d9d724ef78ab52f263833e83662d401736ca8228203e2645a77e94e1381cd5ce4aa0778"
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
