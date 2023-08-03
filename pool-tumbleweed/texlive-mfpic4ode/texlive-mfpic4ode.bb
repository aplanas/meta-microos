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

PV = "2023.209.0.0.4svn17745"

RPM_NAME = "texlive-mfpic4ode-2023.209.0.0.4svn17745-55.1.noarch.rpm"
RPM_HASH = "8f7d39448bac655a3ee154a6df449fa188c3195ac83fdf680c6aef2163fed3dd955e6304351f8eff3bbb6ed825e88419c5dd0a95e1c9874187b57cb3ec6cd8d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mfpic4ode.sty \
tex-mfpic4ode.tex \
texlive-mfpic4ode"

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
