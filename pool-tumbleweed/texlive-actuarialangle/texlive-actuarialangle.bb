SUMMARY = "Angle symbol denoting a duration in actuarial and financial notation"
DESCRIPTION = "This package provides commands to typeset the 'angle' symbol \
denoting a duration in actuarial notation, such as in symbols \
for the present value of certain or life annuities, and an over \
angle square bracket used to emphasize joint status in symbols \
of life contingencies."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn51376"

RPM_NAME = "texlive-actuarialangle-2023.201.2.1svn51376-54.1.noarch.rpm"
RPM_HASH = "dad869b2e145534b24d5480ef942f57ef40faf456288bd2b4312136d218f71096067da2a105f63fecec247bc848993e102ffdff8d5879eaa2fc16e41d9122da5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(actuarialangle.sty) \
texlive-actuarialangle"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pict2e.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
