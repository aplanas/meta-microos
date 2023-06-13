SUMMARY = "Macros to draw direction fields and solutions of ODEs"
DESCRIPTION = "The package is a small set of macros for drawing direction \
fields, phase portraits and trajectories of differential \
equations and two dimensional autonomous systems. The Euler, \
Runge-Kutta and 4th order Runge-Kutta algorithms are available \
to solve the ODEs. The picture is translated into mfpic macros \
and MetaPost is used to create the final drawing. The package \
is was designed for use with LaTeX, but it can be used in plain \
TeX as well. Online demonstration of the mfpic4ode macros is \
available on the Mfpic Previewer as Example 6."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn17745"

RPM_NAME = "texlive-mfpic4ode-2023.201.0.0.4svn17745-54.1.noarch.rpm"
RPM_HASH = "a936e6d2f1035b51b956189cfb337866bdb92d64651521992fa2cde39503112107b841ed27722c67c520014a48127fc407ee1828609e699f3bbb7ba7a7e7384a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mfpic4ode.sty) \
tex(mfpic4ode.tex) \
texlive-mfpic4ode"

RDEPENDS:${PN} += "/bin/sh \
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
