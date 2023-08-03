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

PV = "2023.209.1.1.3svn65074"

RPM_NAME = "texlive-bodeplot-2023.209.1.1.3svn65074-53.1.noarch.rpm"
RPM_HASH = "019fe3c3568b5227573e4b08a12128e41a55449cf396110cb3621cb390c1a578d76d53ec4f404b0fbfcd4d4f5a7bde308e9db4a264bedffe45244e61e0a072da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bodeplot.sty \
texlive-bodeplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-ifplatform.sty \
tex-pdftexcmds.sty \
tex-pgfplots.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
