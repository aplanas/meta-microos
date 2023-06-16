SUMMARY = "Include and extract SVG pictures in LaTeX documents"
DESCRIPTION = "This bundle contains the two packages svg and svg-extract. The \
svg package is intended for the automated integration of SVG \
graphics into LaTeX documents. Therefore the capabilities \
provided by Inkscape -- or more precisely its command line tool \
-- are used to export the text within an SVG graphic to a \
separate file, which is then rendered by LaTeX. For this \
purpose the two commands \\includesvg and \\includeinkscape are \
provided which are very similar to the \\includegraphics command \
of the graphicx package. In addition, the package svg-extract \
allows the extraction of these graphics into independent files \
in different graphic formats, exactly as it is rendered within \
the LaTeX document, using either ImageMagick or Ghostscript."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.02ksvn57010"

RPM_NAME = "texlive-svg-2023.201.2.02ksvn57010-57.1.noarch.rpm"
RPM_HASH = "d7c561f10da41e2aff9ba598df571166f188eeb138e472554c9016a98dd7184a92ad8213cfb7b96567aad4e6f931df5f29d71b9b08c890e1ba09c2b9d2deded8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svg-extract.sty \
tex-svg.sty \
texlive-svg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-ifplatform.sty \
tex-iftex.sty \
tex-pdftexcmds.sty \
tex-pgfsys.sty \
tex-scrbase.sty \
tex-shellesc.sty \
tex-transparent.sty \
tex-trimspaces.sty \
tex-xcolor.sty \
tex-xr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
