SUMMARY = "Babel support for Hebrew"
DESCRIPTION = "The package provides the language definition file for support \
of Hebrew in babel. Macros to control the use of text direction \
control of TeX--XeT and e-TeX are provided (and may be used \
elsewhere). Some shortcuts are defined, as well as translations \
to Hebrew of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3hsvn30273"

RPM_NAME = "texlive-babel-hebrew-2023.209.2.3hsvn30273-54.1.noarch.rpm"
RPM_HASH = "c4debbbf5401765acb87031c2e5dc31b5ec952b7a613ff97f826ea330b794cb1ff8798d9e9f94281d6e9113937ecb5a41c6f226a3cc6cc2edbd29cfbbf49ef51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-8859-8.def \
tex-cp1255.def \
tex-cp862.def \
tex-he8OmegaHebrew.fd \
tex-he8aharoni.fd \
tex-he8cmr.fd \
tex-he8cmss.fd \
tex-he8cmtt.fd \
tex-he8david.fd \
tex-he8drugulin.fd \
tex-he8enc.def \
tex-he8frankruehl.fd \
tex-he8miriam.fd \
tex-he8nachlieli.fd \
tex-he8yad.fd \
tex-hebcal.sty \
tex-hebfont.sty \
tex-hebrew-newcode.sty \
tex-hebrew-oldcode.sty \
tex-hebrew-p.sty \
tex-hebrew.ldf \
tex-lheclas.fd \
tex-lhecmr.fd \
tex-lhecmss.fd \
tex-lhecmtt.fd \
tex-lhecrml.fd \
tex-lheenc.def \
tex-lhefr.fd \
tex-lheredis.fd \
tex-lheshold.fd \
tex-lheshscr.fd \
tex-lheshstk.fd \
tex-rlbabel.def \
tex-si960.def \
texlive-babel-hebrew"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-inputenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
