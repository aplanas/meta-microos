SUMMARY = "Fonts and LaTeX support files for Arev Sans"
DESCRIPTION = "The package arev provides type 1 and virtual fonts, together \
with LaTeX packages for using Arev Sans in both text and \
mathematics. Arev Sans is a derivative of Bitstream Vera Sans \
created by Tavmjong Bah, adding support for Greek and Cyrillic \
characters. Bah also added a few variant letters that are more \
appropriate for mathematics. The primary purpose for using Arev \
Sans in LaTeX is presentations, particularly when using a \
computer projector. In such a context, Arev Sans is quite \
readable, with large x-height, 'open letters', wide spacing, \
and thick stems. The style is very similar to the SliTeX font \
lcmss, but heavier. Arev is one of a very small number of \
sans-font mathematics support packages. Others are cmbright, \
hvmath and kerkis."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-arev-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "2fa12468a47ea699411e54917157c5e73fa44539584ab5c4b5287b6f9cd8717c8a75039d6cc45f20daf03748bfaca0423cf5ebe0c3eabe25bc9b796e350e11c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ArevSans-Bold.tfm \
tex-ArevSans-BoldOblique.tfm \
tex-ArevSans-Oblique.tfm \
tex-ArevSans-Roman.tfm \
tex-ams-mdbch.sty \
tex-arev.map \
tex-arev.sty \
tex-arevmath.sty \
tex-arevoml.enc \
tex-arevoms.enc \
tex-arevot1.enc \
tex-arevsymbols.tex \
tex-arevtext.sty \
tex-favb8r.tfm \
tex-favb8t.tfm \
tex-favb8t.vf \
tex-favbi8r.tfm \
tex-favbi8t.tfm \
tex-favbi8t.vf \
tex-favmb7t.tfm \
tex-favmbi7m.tfm \
tex-favmr7t.tfm \
tex-favmr7y.tfm \
tex-favmri7m.tfm \
tex-favr8r.tfm \
tex-favr8t.tfm \
tex-favr8t.vf \
tex-favri8r.tfm \
tex-favri8t.tfm \
tex-favri8t.vf \
tex-omlzavm.fd \
tex-omszavm.fd \
tex-ot1zavm.fd \
tex-t1fav.fd \
tex-uzavm.fd \
tex-zavmb7t.tfm \
tex-zavmb7t.vf \
tex-zavmbi7m.tfm \
tex-zavmbi7m.vf \
tex-zavmr7t.tfm \
tex-zavmr7t.vf \
tex-zavmr7y.tfm \
tex-zavmr7y.vf \
tex-zavmri7m.tfm \
tex-zavmri7m.vf \
texlive-arev"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amssymb.sty \
tex-beramono.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-md-chb7m.tfm \
tex-md-chb7t.tfm \
tex-md-chb7y.tfm \
tex-mdacmr.fd \
tex-textcomp.sty \
tex-updmap.cfg \
texlive \
texlive-arev-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
