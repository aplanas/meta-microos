SUMMARY = "Babel support for Hebrew"
DESCRIPTION = "The package provides the language definition file for support \
of Hebrew in babel. Macros to control the use of text direction \
control of TeX--XeT and e-TeX are provided (and may be used \
elsewhere). Some shortcuts are defined, as well as translations \
to Hebrew of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3hsvn30273"

RPM_NAME = "texlive-babel-hebrew-2023.201.2.3hsvn30273-53.1.noarch.rpm"
RPM_HASH = "d25de00517c6e5523dbec50b85f6cafa21d7b5d4a1b49b7e3e080684ac4bd24c5ec39e391b0f909838c2a9dc20565fd569dd05d361bb9a8910fb1e504cb13cc7"
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
