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

PV = "2023.209.1.18.1svn61719"

RPM_NAME = "texlive-pgfplots-2023.209.1.18.1svn61719-52.1.noarch.rpm"
RPM_HASH = "434d303d6099480cdc65bec5fb75f24ee56befb5e9b8cf30428e32378d29f9af99d8012bb3e9241ec6d13dcc4f33cc298b0ca91eac370c3b701e4d2d798f58ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bugtracker.sty \
tex-pgflibraryfillbetween.code.tex \
tex-pgflibrarypgfplots.colorbrewer.code.tex \
tex-pgflibrarypgfplots.colortol.code.tex \
tex-pgflibrarypgfplots.surfshading.code.tex \
tex-pgflibrarypgfplots.surfshading.pgfsys-dvipdfmx.def \
tex-pgflibrarypgfplots.surfshading.pgfsys-dvips.def \
tex-pgflibrarypgfplots.surfshading.pgfsys-luatex.def \
tex-pgflibrarypgfplots.surfshading.pgfsys-luatexpatch.def \
tex-pgflibrarypgfplots.surfshading.pgfsys-pdftex.def \
tex-pgflibrarypgfplots.surfshading.pgfsys-xetex.def \
tex-pgfplots.assert.code.tex \
tex-pgfplots.assert.sty \
tex-pgfplots.code.tex \
tex-pgfplots.errorbars.code.tex \
tex-pgfplots.markers.code.tex \
tex-pgfplots.paths.code.tex \
tex-pgfplots.revision.tex \
tex-pgfplots.scaling.code.tex \
tex-pgfplots.sty \
tex-pgfplots.tex \
tex-pgfplotsarray.code.tex \
tex-pgfplotsbinary.code.tex \
tex-pgfplotsbinary.data.code.tex \
tex-pgfplotscolor.code.tex \
tex-pgfplotscolormap.code.tex \
tex-pgfplotscoordprocessing.code.tex \
tex-pgfplotscore.code.tex \
tex-pgfplotsdeque.code.tex \
tex-pgfplotslibrary.code.tex \
tex-pgfplotsliststructure.code.tex \
tex-pgfplotsliststructureext.code.tex \
tex-pgfplotsmatrix.code.tex \
tex-pgfplotsmeshplothandler.code.tex \
tex-pgfplotsmeshplotimage.code.tex \
tex-pgfplotsoldpgfsupp-leq.code.tex \
tex-pgfplotsoldpgfsupp-loader.code.tex \
tex-pgfplotsoldpgfsupp-misc.code.tex \
tex-pgfplotsoldpgfsupp-pgfcoreexternal.code.tex \
tex-pgfplotsoldpgfsupp-pgfcoreimage.code.tex \
tex-pgfplotsoldpgfsupp-pgfcorelayers.code.tex \
tex-pgfplotsoldpgfsupp-pgfcorescopes.code.tex \
tex-pgfplotsoldpgfsupp-pgfkeys.code.tex \
tex-pgfplotsoldpgfsupp-pgfkeysfiltered.code.tex \
tex-pgfplotsoldpgfsupp-pgflibraryfpu.code.tex \
tex-pgfplotsoldpgfsupp-pgflibraryintersections.code.tex \
tex-pgfplotsoldpgfsupp-pgflibraryluamath.code.tex \
tex-pgfplotsoldpgfsupp-pgflibraryplothandlers.code.tex \
tex-pgfplotsoldpgfsupp-pgfmanual.code.tex \
tex-pgfplotsoldpgfsupp-pgfmanual.pdflinks.code.tex \
tex-pgfplotsoldpgfsupp-pgfmanual.prettyprinter.code.tex \
tex-pgfplotsoldpgfsupp-pgfmathfloat.code.tex \
tex-pgfplotsoldpgfsupp-pgfutil-common-lists.tex \
tex-pgfplotsoldpgfsupp-tikzexternal.sty \
tex-pgfplotsoldpgfsupp-tikzexternalshared.code.tex \
tex-pgfplotsoldpgfsupp-tikzlibraryexternal.code.tex \
tex-pgfplotsoldpgfsupp-trig-format.code.tex \
tex-pgfplotsplothandlers.code.tex \
tex-pgfplotsstackedplots.code.tex \
tex-pgfplotssysgeneric.code.tex \
tex-pgfplotstable.code.tex \
tex-pgfplotstable.coltype.code.tex \
tex-pgfplotstable.sty \
tex-pgfplotstable.tex \
tex-pgfplotstableshared.code.tex \
tex-pgfplotsticks.code.tex \
tex-pgfplotsutil.code.tex \
tex-pgfplotsutil.verb.code.tex \
tex-pgfregressiontest.sty \
tex-pgfsys-luatexpatch.def \
tex-t-pgfplots.tex \
tex-t-pgfplotstable.tex \
tex-tikzlibrarycolorbrewer.code.tex \
tex-tikzlibrarycolortol.code.tex \
tex-tikzlibrarydateplot.code.tex \
tex-tikzlibrarydecorations.softclip.code.tex \
tex-tikzlibraryfillbetween.code.tex \
tex-tikzlibrarypgfplots.clickable.code.tex \
tex-tikzlibrarypgfplots.colormaps.code.tex \
tex-tikzlibrarypgfplots.contourlua.code.tex \
tex-tikzlibrarypgfplots.dateplot.code.tex \
tex-tikzlibrarypgfplots.decorations.softclip.code.tex \
tex-tikzlibrarypgfplots.external.code.tex \
tex-tikzlibrarypgfplots.fillbetween.code.tex \
tex-tikzlibrarypgfplots.groupplots.code.tex \
tex-tikzlibrarypgfplots.patchplots.code.tex \
tex-tikzlibrarypgfplots.polar.code.tex \
tex-tikzlibrarypgfplots.smithchart.code.tex \
tex-tikzlibrarypgfplots.statistics.code.tex \
tex-tikzlibrarypgfplots.ternary.code.tex \
tex-tikzlibrarypgfplots.units.code.tex \
tex-tikzlibrarypgfplotsclickable.code.tex \
texlive-pgfplots"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-listings.sty \
tex-luatexbase.sty \
tex-pgfsys-common-pdf.def \
tex-pgfsys-pdftex.def \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
