SUMMARY = "A package for easy figure arrangement"
DESCRIPTION = "MiniPlot is a package to help the LaTeX user typeset EPS \
figures using an easy-to-use interface. Figures can be arranged \
as one-figure-only or as a collection of figures in columns and \
rows which can itself contain sub-figures in columns and rows. \
Wrapped figures are also supported. This package provides \
commands to display a framebox instead of the figure as the \
graphics package does already but additionally it writes useful \
information such as the label and scaling factor into these \
boxes."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17483"

RPM_NAME = "texlive-miniplot-2023.209.svn17483-55.1.noarch.rpm"
RPM_HASH = "9b981334d54b75d09b20ad58c217c6ff9210c6a66d53c82cdfcd2b20ff1df706c674690be5710f2a47ff3e9e281090dfb75ae9caa843d3d5a3679319da503f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-miniplot.sty \
texlive-miniplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-epsfig.sty \
tex-graphicx.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
