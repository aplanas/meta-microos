SUMMARY = "Angle symbol denoting a duration in actuarial and financial notation"
DESCRIPTION = "This package provides commands to typeset the 'angle' symbol \
denoting a duration in actuarial notation, such as in symbols \
for the present value of certain or life annuities, and an over \
angle square bracket used to emphasize joint status in symbols \
of life contingencies."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn51376"

RPM_NAME = "texlive-actuarialangle-2023.209.2.1svn51376-55.1.noarch.rpm"
RPM_HASH = "b1bfd98b0d214f24ccdb81d00fd36b0eeb8ba21cf8750bbcc9092e149482f39e5a53c2cfa72a975e525d003b1ac33f8ab05d37db23d66b2b21dbfde2c82a7ec0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-actuarialangle.sty \
texlive-actuarialangle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
