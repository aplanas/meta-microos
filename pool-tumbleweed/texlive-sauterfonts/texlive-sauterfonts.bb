SUMMARY = "Use Sauter's fonts in LaTeX"
DESCRIPTION = "The package provides font definition files (plus a replacement \
for the package exscale) to access many of the fonts in \
Sauter's collection. These fonts are available in all point \
sizes and look nicer for such 'intermediate' document sizes as \
11pt. Also included is the package sbbm, an alternative to \
access the bbm fonts."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-sauterfonts-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "2ff044aba4a6c9949d1b2884c0955c559ed32afee6e45dd385cebb49e306d074e78f682a50719054b3aedc7e8984105cc5f128ba8b9f5e67445552a8f839ed1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sbbm.sty \
tex-sexscale.sty \
tex-somlcmm.fd \
tex-somlcmr.fd \
tex-somscmr.fd \
tex-somscmsy.fd \
tex-somxcmex.fd \
tex-sot1cmdh.fd \
tex-sot1cmfib.fd \
tex-sot1cmfr.fd \
tex-sot1cmr.fd \
tex-sot1cmss.fd \
tex-sot1cmtt.fd \
tex-sot1cmvtt.fd \
tex-subbm.fd \
tex-subbmdh.fd \
tex-subbmfib.fd \
tex-subbmss.fd \
tex-subbmtt.fd \
tex-subbmvtt.fd \
tex-subbold.fd \
tex-sucmr.fd \
tex-sucmss.fd \
tex-sucmtt.fd \
tex-sulasy.fd \
tex-sumsa.fd \
tex-sumsb.fd \
tex-sursfs.fd \
tex-sustmry.fd \
tex-suwasy.fd \
texlive-sauterfonts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
