SUMMARY = "Create normal/logarithmic plots in two and three dimensions"
DESCRIPTION = "PGFPlots draws high-quality function plots in normal or \
logarithmic scaling with a user-friendly interface directly in \
TeX. The user supplies axis labels, legend entries and the plot \
coordinates for one or more plots and PGFPlots applies axis \
scaling, computes any logarithms and axis ticks and draws the \
plots, supporting line plots, scatter plots, piecewise constant \
plots, bar plots, area plots, mesh-- and surface plots and some \
more. Pgfplots is based on PGF/TikZ (PGF); it runs equally for \
LaTeX/TeX/ConTeXt."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.18.1svn61719"

RPM_NAME = "texlive-pgfplots-2023.201.1.18.1svn61719-51.1.noarch.rpm"
RPM_HASH = "667a59e9d494c189ad18d8434b2068fc80cf145ef8be9f78c93226f8bb7de342a21dd4f866f1bcdc325e06c5d7bd53c2f48fafec2207fade2de65b96b630fbfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bugtracker.sty) \
tex(pgflibraryfillbetween.code.tex) \
tex(pgflibrarypgfplots.colorbrewer.code.tex) \
tex(pgflibrarypgfplots.colortol.code.tex) \
tex(pgflibrarypgfplots.surfshading.code.tex) \
tex(pgflibrarypgfplots.surfshading.pgfsys-dvipdfmx.def) \
tex(pgflibrarypgfplots.surfshading.pgfsys-dvips.def) \
tex(pgflibrarypgfplots.surfshading.pgfsys-luatex.def) \
tex(pgflibrarypgfplots.surfshading.pgfsys-luatexpatch.def) \
tex(pgflibrarypgfplots.surfshading.pgfsys-pdftex.def) \
tex(pgflibrarypgfplots.surfshading.pgfsys-xetex.def) \
tex(pgfplots.assert.code.tex) \
tex(pgfplots.assert.sty) \
tex(pgfplots.code.tex) \
tex(pgfplots.errorbars.code.tex) \
tex(pgfplots.markers.code.tex) \
tex(pgfplots.paths.code.tex) \
tex(pgfplots.revision.tex) \
tex(pgfplots.scaling.code.tex) \
tex(pgfplots.sty) \
tex(pgfplots.tex) \
tex(pgfplotsarray.code.tex) \
tex(pgfplotsbinary.code.tex) \
tex(pgfplotsbinary.data.code.tex) \
tex(pgfplotscolor.code.tex) \
tex(pgfplotscolormap.code.tex) \
tex(pgfplotscoordprocessing.code.tex) \
tex(pgfplotscore.code.tex) \
tex(pgfplotsdeque.code.tex) \
tex(pgfplotslibrary.code.tex) \
tex(pgfplotsliststructure.code.tex) \
tex(pgfplotsliststructureext.code.tex) \
tex(pgfplotsmatrix.code.tex) \
tex(pgfplotsmeshplothandler.code.tex) \
tex(pgfplotsmeshplotimage.code.tex) \
tex(pgfplotsoldpgfsupp_leq.code.tex) \
tex(pgfplotsoldpgfsupp_loader.code.tex) \
tex(pgfplotsoldpgfsupp_misc.code.tex) \
tex(pgfplotsoldpgfsupp_pgfcoreexternal.code.tex) \
tex(pgfplotsoldpgfsupp_pgfcoreimage.code.tex) \
tex(pgfplotsoldpgfsupp_pgfcorelayers.code.tex) \
tex(pgfplotsoldpgfsupp_pgfcorescopes.code.tex) \
tex(pgfplotsoldpgfsupp_pgfkeys.code.tex) \
tex(pgfplotsoldpgfsupp_pgfkeysfiltered.code.tex) \
tex(pgfplotsoldpgfsupp_pgflibraryfpu.code.tex) \
tex(pgfplotsoldpgfsupp_pgflibraryintersections.code.tex) \
tex(pgfplotsoldpgfsupp_pgflibraryluamath.code.tex) \
tex(pgfplotsoldpgfsupp_pgflibraryplothandlers.code.tex) \
tex(pgfplotsoldpgfsupp_pgfmanual.code.tex) \
tex(pgfplotsoldpgfsupp_pgfmanual.pdflinks.code.tex) \
tex(pgfplotsoldpgfsupp_pgfmanual.prettyprinter.code.tex) \
tex(pgfplotsoldpgfsupp_pgfmathfloat.code.tex) \
tex(pgfplotsoldpgfsupp_pgfutil-common-lists.tex) \
tex(pgfplotsoldpgfsupp_tikzexternal.sty) \
tex(pgfplotsoldpgfsupp_tikzexternalshared.code.tex) \
tex(pgfplotsoldpgfsupp_tikzlibraryexternal.code.tex) \
tex(pgfplotsoldpgfsupp_trig_format.code.tex) \
tex(pgfplotsplothandlers.code.tex) \
tex(pgfplotsstackedplots.code.tex) \
tex(pgfplotssysgeneric.code.tex) \
tex(pgfplotstable.code.tex) \
tex(pgfplotstable.coltype.code.tex) \
tex(pgfplotstable.sty) \
tex(pgfplotstable.tex) \
tex(pgfplotstableshared.code.tex) \
tex(pgfplotsticks.code.tex) \
tex(pgfplotsutil.code.tex) \
tex(pgfplotsutil.verb.code.tex) \
tex(pgfregressiontest.sty) \
tex(pgfsys-luatexpatch.def) \
tex(t-pgfplots.tex) \
tex(t-pgfplotstable.tex) \
tex(tikzlibrarycolorbrewer.code.tex) \
tex(tikzlibrarycolortol.code.tex) \
tex(tikzlibrarydateplot.code.tex) \
tex(tikzlibrarydecorations.softclip.code.tex) \
tex(tikzlibraryfillbetween.code.tex) \
tex(tikzlibrarypgfplots.clickable.code.tex) \
tex(tikzlibrarypgfplots.colormaps.code.tex) \
tex(tikzlibrarypgfplots.contourlua.code.tex) \
tex(tikzlibrarypgfplots.dateplot.code.tex) \
tex(tikzlibrarypgfplots.decorations.softclip.code.tex) \
tex(tikzlibrarypgfplots.external.code.tex) \
tex(tikzlibrarypgfplots.fillbetween.code.tex) \
tex(tikzlibrarypgfplots.groupplots.code.tex) \
tex(tikzlibrarypgfplots.patchplots.code.tex) \
tex(tikzlibrarypgfplots.polar.code.tex) \
tex(tikzlibrarypgfplots.smithchart.code.tex) \
tex(tikzlibrarypgfplots.statistics.code.tex) \
tex(tikzlibrarypgfplots.ternary.code.tex) \
tex(tikzlibrarypgfplots.units.code.tex) \
tex(tikzlibrarypgfplotsclickable.code.tex) \
texlive-pgfplots"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/luatex \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(listings.sty) \
tex(luatexbase.sty) \
tex(pgfsys-common-pdf.def) \
tex(pgfsys-pdftex.def) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
