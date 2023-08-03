SUMMARY = "Concrete Math fonts"
DESCRIPTION = "A LaTeX package and font definition files to access the \
Concrete mathematics fonts, which were derived from Computer \
Modern math fonts using parameters from Concrete Roman text \
fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17219"

RPM_NAME = "texlive-concmath-2023.209.svn17219-54.1.noarch.rpm"
RPM_HASH = "e496290711bbc361eec166f5a24ef566bbe0dc1b760e3713d0683075f19ac523584604e556644c82fd91e6871320f575aa7a35ba04c9a51bbbbd1e37a7d009ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-concmath.sty \
tex-omlccm.fd \
tex-omlccr.fd \
tex-omsccr.fd \
tex-omsccsy.fd \
tex-omxccex.fd \
tex-ot1ccr.fd \
tex-ucca.fd \
tex-uccb.fd \
texlive-concmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amssymb.sty \
tex-exscale.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
