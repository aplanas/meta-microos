SUMMARY = "Macros for Digital Signal Processing plots"
DESCRIPTION = "The package provides a set of LaTeX macros (based on PSTricks) \
for plotting the kind of graphs and figures that are usually \
employed in digital signal processing publications. DSPTricks \
provides facilities for standard discrete-time 'lollipop' \
plots, continuous-time and frequency plots, and pole-zero \
plots. The companion package DSPFunctions (dspfunctions.sty) \
provides macros for computing frequency responses and DFTs, \
while the package DSPBlocks (dspblocks.sty) supports DSP block \
diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn34724"

RPM_NAME = "texlive-dsptricks-2023.209.1.0svn34724-53.1.noarch.rpm"
RPM_HASH = "7cf7065cb0c4c7df3461471467a2470b11ea51b143cc527c9cadf0517b90d49052017f2c6235beb4c6eb1bb779c0075426973da85ebd5b1a8bcefdabb4999408"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dspblocks.sty \
tex-dspfunctions.sty \
tex-dsptricks.sty \
texlive-dsptricks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fmtcount.sty \
tex-fp.sty \
tex-ifthen.sty \
tex-pst-xkey.sty \
tex-pstricks-add.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
