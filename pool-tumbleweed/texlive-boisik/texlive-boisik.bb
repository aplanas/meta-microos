SUMMARY = "A font inspired by Baskerville design"
DESCRIPTION = "Boisik is a serif font set (inspired by the Baskerville \
typeface), written in Metafont. The set comprises roman and \
italic text fonts and maths fonts. LaTeX support is offered for \
use with OT1, IL2 and OM* encodings."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.5svn15878"

RPM_NAME = "texlive-boisik-2023.209.0.0.5svn15878-53.1.noarch.rpm"
RPM_HASH = "b545dc838d85c2013dbdb2115e91c6de656984c2b921e92b3bacbac6d0dd398402b0bc04020d4b57fce325776bbe2716fdd92f431485bdf2647e628340c92ed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-boisik.sty \
tex-bskarr10.tfm \
tex-bskex10.tfm \
tex-bskhc10.tfm \
tex-bski10-TS1.tfm \
tex-bski10.tfm \
tex-bskib10.tfm \
tex-bskiol10.tfm \
tex-bskiu10.tfm \
tex-bskiub10.tfm \
tex-bskma10.tfm \
tex-bskmab10.tfm \
tex-bskmi10.tfm \
tex-bskmib10.tfm \
tex-bskms10.tfm \
tex-bskmsb10.tfm \
tex-bskmsbsl10.tfm \
tex-bskmssl10.tfm \
tex-bskr10-T1.tfm \
tex-bskr10-TS1.tfm \
tex-bskr10.tfm \
tex-bskrb10.tfm \
tex-bskrc10.tfm \
tex-bskrcb10.tfm \
tex-bskrf10.tfm \
tex-bskrl10.tfm \
tex-bskrol10.tfm \
tex-bskrsb10.tfm \
tex-bskrsl10.tfm \
tex-bskrw10.tfm \
tex-bsksc10.tfm \
tex-bsksy10.tfm \
tex-bsksyol10.tfm \
tex-bsksysl10.tfm \
tex-il2bsk.fd \
tex-il2bskf.fd \
tex-lblbskm.fd \
tex-lblcmr.fd \
tex-lblenc.def \
tex-lbmbsk.fd \
tex-lbmbskms.fd \
tex-lbmcmr.fd \
tex-lbmenc.def \
tex-lbsbsk.fd \
tex-lbsbsksy.fd \
tex-lbscmr.fd \
tex-lbsenc.def \
tex-ot1bsk.fd \
tex-ot1bskf.fd \
tex-ts1bsk.fd \
tex-ubskex.fd \
texlive-boisik"

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
