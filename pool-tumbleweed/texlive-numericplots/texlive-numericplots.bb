SUMMARY = "Plot numeric data (including Matlab export) using PSTricks"
DESCRIPTION = "Plotting numeric data is a task which has often to be done for \
scientific papers. LaTeX itself provides no facilities for \
drawing more than the simplest plots from supplied data. The \
package will process user input, and uses PSTricks to plot the \
results. The package provides Matlab functions to transform \
Matlab results to plottable data."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.0.2svn31729"

RPM_NAME = "texlive-numericplots-2023.201.2.0.2svn31729-54.1.noarch.rpm"
RPM_HASH = "24aa5e5f3aa176c9f10a26d20b61ca29230adea9874544628f60e836c035b6ce3b81351081b8f1705ec4ef89cc3b899e855cdbd1124e30593eb2daa075385588"
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
