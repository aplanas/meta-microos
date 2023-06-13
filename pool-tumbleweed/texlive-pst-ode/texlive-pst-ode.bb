SUMMARY = "Solving initial value problems for sets of Ordinary Differential Equations"
DESCRIPTION = "The package defines \\pstODEsolve for solving initial value \
problems for sets of Ordinary Differential Equations (ODE) \
using the Runge-Kutta-Fehlberg (RKF45) method with automatic \
step size adjustment. The result is stored as a PostScript \
object and may be plotted later using macros from other \
PSTricks packages, such as \\listplot (pst-plot) and \
\\listplotThreeD (pst-3dplot), or may be further processed by \
user-defined PostScript procedures. Optionally, the computed \
state vectors can be written as a table to a text file."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.18svn65096"

RPM_NAME = "texlive-pst-ode-2023.201.0.0.18svn65096-52.1.noarch.rpm"
RPM_HASH = "cab604b543f782ba3565dde2b3a6059f3d2e7cf3a22c15a538e032cb6af445c02ed8dae7bbbce96e93e56d6b73353ae536efaf69475bcd6525c94af27d8a2b86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-ode.sty) \
tex(pst-ode.tex) \
texlive-pst-ode"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
