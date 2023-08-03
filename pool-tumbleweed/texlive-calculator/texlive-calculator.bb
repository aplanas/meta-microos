SUMMARY = "Use LaTeX as a scientific calculator"
DESCRIPTION = "The calculator and calculus packages define several \
instructions which allow us to realise algebraic operations and \
to evaluate elementary functions and derivatives in our \
documents. The package's main goal is to define the arithmetic \
and functional calculations needed in the author's package \
xpicture, but the numeric abilities of 'calculator' and \
'calculus' may be useful in other contexts."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn64424"

RPM_NAME = "texlive-calculator-2023.209.2.1svn64424-53.1.noarch.rpm"
RPM_HASH = "b5541f36384cb7b12e7a87af63f10fe63720fc61044565dd314e643a1d30b2bdbb4ff7b6a24fedd7e43975ca62b8466f0e1859f0862395268bd9aff48f78b3b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-calculator.sty \
tex-calculus.sty \
texlive-calculator"

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
