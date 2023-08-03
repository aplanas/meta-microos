SUMMARY = "Herbert Bayer's 'universal' font"
DESCRIPTION = "An implementation of the 'universal' font by Herbert Bayer of \
the Bauhaus school. The Metafont sources of the fonts, and \
their LaTeX support, are all supplied in a LaTeX documented \
source (.dtx) file."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.1svn51984"

RPM_NAME = "texlive-universa-2023.209.2.1svn51984-54.1.noarch.rpm"
RPM_HASH = "9dac5a4219b125d6f557444e3ee0862b15c794163bf3939bb5838501795bfcfcd7f541b651d783471f17901626cb32aa8a3ec3220c48644cef53e4f8dcc99a12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fulbc10.tfm \
tex-fulbc12.tfm \
tex-fulbc17.tfm \
tex-fulbc8.tfm \
tex-fulbc9.tfm \
tex-fulbo10.tfm \
tex-fulbo12.tfm \
tex-fulbo17.tfm \
tex-fulbo8.tfm \
tex-fulbo9.tfm \
tex-fulbr10.tfm \
tex-fulbr12.tfm \
tex-fulbr17.tfm \
tex-fulbr8.tfm \
tex-fulbr9.tfm \
tex-fulbst10.tfm \
tex-fulbst12.tfm \
tex-fulbst17.tfm \
tex-fulbst8.tfm \
tex-fulbst9.tfm \
tex-fulmc10.tfm \
tex-fulmc12.tfm \
tex-fulmc17.tfm \
tex-fulmc8.tfm \
tex-fulmc9.tfm \
tex-fulmo10.tfm \
tex-fulmo12.tfm \
tex-fulmo17.tfm \
tex-fulmo8.tfm \
tex-fulmo9.tfm \
tex-fulmr10.tfm \
tex-fulmr12.tfm \
tex-fulmr17.tfm \
tex-fulmr8.tfm \
tex-fulmr9.tfm \
tex-fulmst10.tfm \
tex-fulmst12.tfm \
tex-fulmst17.tfm \
tex-fulmst8.tfm \
tex-fulmst9.tfm \
tex-omluni.fd \
tex-omsuni.fd \
tex-ot1uni.fd \
tex-t1uni.fd \
tex-uni.sty \
tex-uuni.fd \
texlive-universa"

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
