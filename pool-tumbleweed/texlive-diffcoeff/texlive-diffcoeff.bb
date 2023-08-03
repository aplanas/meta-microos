SUMMARY = "Write differential coefficients easily and consistently"
DESCRIPTION = "This package allows the easy and consistent writing of \
ordinary, partial and other derivatives of arbitrary (algebraic \
or numeric) order. For mixed partial derivatives, the total \
order of differentiation is calculated by the package. Optional \
arguments allow specification of points of evaluation (ordinary \
derivatives), or variables held constant (partial derivatives), \
and the placement of the differentiand (numerator or appended). \
The package is built on xtemplate and the configurability it \
enables, extending to differentials (including simple line \
elements) and jacobians."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.2svn65676"

RPM_NAME = "texlive-diffcoeff-2023.209.5.2svn65676-53.1.noarch.rpm"
RPM_HASH = "6347175a572e86bec0ef0b48ea73055e10d2412a21514b23d4cb7d016298802779867b68a4c452d34e0a95ee75eca63cca8a0615457c2ca1db643718b1dd30df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-diffcoeff-doc.def \
tex-diffcoeff.sty \
tex-diffcoeff4.sty \
tex-diffcoeff5.def \
texlive-diffcoeff"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-mleftright.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
