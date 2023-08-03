SUMMARY = "Plot numeric data (including Matlab export) using PSTricks"
DESCRIPTION = "Plotting numeric data is a task which has often to be done for \
scientific papers. LaTeX itself provides no facilities for \
drawing more than the simplest plots from supplied data. The \
package will process user input, and uses PSTricks to plot the \
results. The package provides Matlab functions to transform \
Matlab results to plottable data."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.0.2svn31729"

RPM_NAME = "texlive-numericplots-2023.209.2.0.2svn31729-55.1.noarch.rpm"
RPM_HASH = "15a9afefc02ced7600b10033bd3798543cca403d191926f1693b55d27dda7160a0221ecf405ae5f087995c466063c81f1538c22c124fb63a134ff6fa950a655b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-NumericPlots-TickLabels.tex \
tex-NumericPlots-labels.tex \
tex-NumericPlots-legend.tex \
tex-NumericPlots-macros.tex \
tex-NumericPlots-styles.tex \
tex-NumericPlots.sty \
texlive-numericplots"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fp.sty \
tex-ifthen.sty \
tex-pst-node.sty \
tex-pst-plot.sty \
tex-pstricks-add.sty \
tex-pstricks.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xkvview.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
