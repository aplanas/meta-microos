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

PV = "2023.209.0.0.18svn65096"

RPM_NAME = "texlive-pst-ode-2023.209.0.0.18svn65096-53.1.noarch.rpm"
RPM_HASH = "24b093a321b5a37b27d7dbf630d48ebcc2556b226f3501dc26c65b62759512c5d65e4492552c83d12ca4237ab438565939c8d51daff86c425e011b34e4f5acdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-ode.sty \
tex-pst-ode.tex \
texlive-pst-ode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
