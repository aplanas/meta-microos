SUMMARY = "A font inspired by Baskerville design"
DESCRIPTION = "Boisik is a serif font set (inspired by the Baskerville \
typeface), written in Metafont. The set comprises roman and \
italic text fonts and maths fonts. LaTeX support is offered for \
use with OT1, IL2 and OM* encodings."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.5svn15878"

RPM_NAME = "texlive-boisik-2023.201.0.0.5svn15878-52.1.noarch.rpm"
RPM_HASH = "b50c9fe1128489b5f5b128e7c55b875c25fbb05d1e1c7a42fae91144413952f27ce0823ff144761a6924672293aec4c4ccb6ed9c1d65e88acdd8d5a7b22d3cf5"
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

RDEPENDS:${PN} += "/bin/sh \
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
