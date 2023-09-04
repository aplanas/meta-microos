SUMMARY = "PostScript macros for TeX"
DESCRIPTION = "PSTricks offers an extensive collection of macros for \
generating PostScript that is usable with most TeX macro \
formats, including Plain TeX, LaTeX, AMS-TeX, and AMS-LaTeX. \
Included are macros for colour, graphics, pie charts, rotation, \
trees and overlays. It has many special features, including a \
wide variety of graphics (picture drawing) macros, with a \
flexible interface and with colour support. There are macros \
for colouring or shading the cells of tables. The package \
pstricks-add contains bug-fixes and additions for PSTricks \
(among other things). PSTricks ordinarily uses PostScript \
\\special commands, which are not supported by pdf(La)TeX. This \
limitation may be overcome by using either the pst-pdf or the \
pdftricks package, to generate a PDF inclusion from a PSTricks \
diagram. PSTricks macros can also generate PDF output when the \
document is processed XeTeX, without the need for other \
supporting packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.18svn65346"

RPM_NAME = "texlive-pstricks-2023.209.3.18svn65346-54.2.noarch.rpm"
RPM_HASH = "be5b60fb62e1cdf4366707beef8e104807d453f889295bd54570e2f6833859776eb4c1b98403c0b328770741cfe9166caceb3eb73d538ce192ba31a944de1714"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-README.cfg \
tex-distiller.cfg \
tex-dvips.cfg \
tex-dvipsone.cfg \
tex-gastex.cfg \
tex-pst-all.sty \
tex-pst-doc.cls \
tex-pst-fp.tex \
tex-pst-key.sty \
tex-pst-key.tex \
tex-pstcol.sty \
tex-pstricks-arrows.tex \
tex-pstricks-color.tex \
tex-pstricks-dots.tex \
tex-pstricks-pdf.sty \
tex-pstricks-tex.def \
tex-pstricks-xetex.def \
tex-pstricks.sty \
tex-pstricks.tex \
tex-pstricks97.tex \
tex-textures.cfg \
tex-vtex.cfg \
tex-xdvipdfmx.cfg \
texlive-pstricks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-babel.sty \
tex-bera.sty \
tex-biblatex.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-eso-pic.sty \
tex-everyshi.sty \
tex-fancyvrb.sty \
tex-fontenc.sty \
tex-footmisc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-iftex.sty \
tex-libertinus-otf.sty \
tex-lscape.sty \
tex-makeidx.sty \
tex-manfnt.sty \
tex-multido.sty \
tex-nameref.sty \
tex-paralist.sty \
tex-pst-3d.sty \
tex-pst-calculate.sty \
tex-pst-coil.sty \
tex-pst-eps.sty \
tex-pst-fill.sty \
tex-pst-grad.sty \
tex-pst-node.sty \
tex-pst-pdf.sty \
tex-pst-plot.sty \
tex-pst-text.sty \
tex-pst-tree.sty \
tex-pst-xkey.sty \
tex-pstricks-add.sty \
tex-ragged2e.sty \
tex-scrartcl.cls \
tex-scrlayer-scrpage.sty \
tex-setspace.sty \
tex-showexpl.sty \
tex-subfig.sty \
tex-tabularx.sty \
tex-textcomp.sty \
tex-unicode-math.sty \
tex-varioref.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xkvview.sty \
tex-xspace.sty \
tex-xurl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
