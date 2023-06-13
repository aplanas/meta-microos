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

PV = "2023.201.1.0svn34724"

RPM_NAME = "texlive-dsptricks-2023.201.1.0svn34724-52.1.noarch.rpm"
RPM_HASH = "48309a1e295f1545ce4f8ca6854a110742a9dea53cf79188270560912e417740d92cd2fd42eefd34800ba3b3d5ae9c98a7c44491ab908693da8ed43103548842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dspblocks.sty) \
tex(dspfunctions.sty) \
tex(dsptricks.sty) \
texlive-dsptricks"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(fmtcount.sty) \
tex(fp.sty) \
tex(ifthen.sty) \
tex(pst-xkey.sty) \
tex(pstricks-add.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
