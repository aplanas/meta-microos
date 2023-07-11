SUMMARY = "Fonts to typeset mathematics to match Palatino"
DESCRIPTION = "The Pazo Math fonts are a family of PostScript fonts suitable \
for typesetting mathematics in combination with the Palatino \
family of text fonts. The Pazo Math family is made up of five \
fonts provided in Adobe Type 1 format (PazoMath, \
PazoMath-Italic, PazoMath-Bold, PazoMath-BoldItalic, and \
PazoMathBlackboardBold). These contain, in designs that match \
Palatino, glyphs that are usually not available in Palatino and \
for which Computer Modern looks odd when combined with \
Palatino. These glyphs include the uppercase Greek alphabet in \
upright and slanted shapes in regular and bold weights, the \
lowercase Greek alphabet in slanted shape in regular and bold \
weights, several mathematical glyphs (partialdiff, summation, \
product, coproduct, emptyset, infinity, and proportional) in \
regular and bold weights, other glyphs (Euro and dotlessj) in \
upright and slanted shapes in regular and bold weights, and the \
uppercase letters commonly used to represent various number \
sets (C, I, N, Q, R, and Z) in blackboard bold. LaTeX macro \
support (using package mathpazo.sty) is provided in psnfss (a \
required part of any LaTeX distribution)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.003svn52663"

RPM_NAME = "texlive-mathpazo-2023.208.1.003svn52663-53.1.noarch.rpm"
RPM_HASH = "4bdd3dd5d7fc2de9e63709614d2a383ea2a5a683617c1483b5e3045da939f00c7395e11a54d4abf3c13fc8ff66e313404d737d1ca2eace8b2af6d549865d16fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fplmb.tfm \
tex-fplmbb.tfm \
tex-fplmbi.tfm \
tex-fplmr.tfm \
tex-fplmri.tfm \
tex-zplmb7m.tfm \
tex-zplmb7m.vf \
tex-zplmb7t.tfm \
tex-zplmb7t.vf \
tex-zplmb7y.tfm \
tex-zplmb7y.vf \
tex-zplmr7m.tfm \
tex-zplmr7m.vf \
tex-zplmr7t.tfm \
tex-zplmr7t.vf \
tex-zplmr7v.tfm \
tex-zplmr7v.vf \
tex-zplmr7y.tfm \
tex-zplmr7y.vf \
texlive-mathpazo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmbsy10.tfm \
tex-cmbx10.tfm \
tex-cmex10.tfm \
tex-cmmi10.tfm \
tex-cmmib10.tfm \
tex-cmr10.tfm \
tex-cmsy10.tfm \
tex-pplb8r.tfm \
tex-pplbi8r.tfm \
tex-pplr8r.tfm \
tex-pplri8r.tfm \
texlive \
texlive-filesystem \
texlive-fpl \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mathpazo-fonts \
texlive-palatino \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
