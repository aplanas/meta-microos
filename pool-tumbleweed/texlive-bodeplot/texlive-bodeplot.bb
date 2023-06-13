SUMMARY = "Draw Bode, Nyquist and Nichols plots with gnuplot or pgfplots"
DESCRIPTION = "This is a LaTeX package to plot Bode, Nichols, and Nyquist \
diagrams. It provides added functionality over the similar \
bodegraph package: New \\BodeZPK and \\BodeTF commands to \
generate Bode plots of any transfer function given either \
poles, zeros, gain, and delay, or numerator and denominator \
coefficients and delay Support for unstable poles and zeros. \
Support for complex poles and zeros. Support for general stable \
and unstable second order transfer functions. Support for both \
Gnuplot (default) and pgfplots (package option pgf). Support \
for linear and asymptotic approximation of magnitude and phase \
plots of any transfer function given poles, zeros, and gain."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.3svn65074"

RPM_NAME = "texlive-bodeplot-2023.201.1.1.3svn65074-52.1.noarch.rpm"
RPM_HASH = "f4450b8fb976087b5846279479f3f1fb65a3e9d527df76c8f835b84e382aabc1a507c2e0093bb68a76159b8f3c0a9c0709c4db5981003f6e137445beb60c0a92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bodeplot.sty) \
texlive-bodeplot"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(environ.sty) \
tex(ifplatform.sty) \
tex(pdftexcmds.sty) \
tex(pgfplots.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
