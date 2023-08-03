SUMMARY = "PostScript versions of the ESSTIX, with macro support"
DESCRIPTION = "These fonts represent translation to PostScript Type 1 of the \
ESSTIX fonts. ESSTIX seem to have been a precursor to the STIX \
project, and were donated by Elsevier to that project. The \
accompanying virtual fonts with customized metrics and LaTeX \
support files allow their use as calligraphic, fraktur and \
double-struck (blackboard bold) in maths mode."
LICENSE = "OFL-1.1"

PV = "2023.209.1.0svn22426"

RPM_NAME = "texlive-esstix-2023.209.1.0svn22426-53.1.noarch.rpm"
RPM_HASH = "64491aeb39c36f261f3b82b9290f256626ca56844d8458b27864a5c023be3bd972a8057d49a57ca0125cb0c3cb7e81389ab09203ac90321c76f785e6c9cb29e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ESSTIX.map \
tex-esstixbb.sty \
tex-esstixbb.tfm \
tex-esstixbb.vf \
tex-esstixcal.sty \
tex-esstixcal.tfm \
tex-esstixcal.vf \
tex-esstixfrak.sty \
tex-esstixfrak.tfm \
tex-esstixfrak.vf \
tex-rESSTIX13.tfm \
tex-rESSTIX14.tfm \
tex-rESSTIX15.tfm \
tex-uesstixbb.fd \
tex-uesstixcal.fd \
tex-uesstixfrak.fd \
texlive-esstix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmr10.tfm \
tex-updmap.cfg \
tex-xkeyval.sty \
texlive \
texlive-esstix-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
