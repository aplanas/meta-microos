SUMMARY = "A collection of libraries for PGF/TikZ"
DESCRIPTION = "This is a collection of libraries for PGF/TikZ. Currently these \
are transformations.mirror, paths.arcto, paths.ortho, \
paths.timer, patterns.images, topaths.arcthrough and misc. Most \
of these libraries were developed in response to questions on \
TeX.stackexchange.com."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.209.0.0.4.2svn64920"

RPM_NAME = "texlive-tikz-ext-2023.209.0.0.4.2svn64920-53.1.noarch.rpm"
RPM_HASH = "5c15a041b95fd425c5a551836430b315df484033db35bcab9828e80eb7a26e0a25190ae32a4e0372dade837b858ed4e62ae873975d38b0a19bebf5f7b0ff70ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfcalendar-ext.code.tex \
tex-pgfcalendar-ext.sty \
tex-pgfcalendar-ext.tex \
tex-pgfkeyslibraryext.pgfkeys-plus.code.tex \
tex-pgflibraryext.pgfkeys-plus.code.tex \
tex-pgflibraryext.shapes.circlearrow.code.tex \
tex-pgflibraryext.shapes.circlecrosssplit.code.tex \
tex-pgflibraryext.shapes.heatmark.code.tex \
tex-pgflibraryext.shapes.rectangleroundedcorners.code.tex \
tex-pgflibraryext.shapes.superellipse.code.tex \
tex-pgflibraryext.shapes.uncenteredrectangle.code.tex \
tex-pgflibraryext.transformations.mirror.code.tex \
tex-tikzlibraryext.calendar-plus.code.tex \
tex-tikzlibraryext.misc.code.tex \
tex-tikzlibraryext.node-families.code.tex \
tex-tikzlibraryext.node-families.shapes.geometric.code.tex \
tex-tikzlibraryext.paths.arcto.code.tex \
tex-tikzlibraryext.paths.ortho.code.tex \
tex-tikzlibraryext.paths.timer.code.tex \
tex-tikzlibraryext.patterns.images.code.tex \
tex-tikzlibraryext.positioning-plus.code.tex \
tex-tikzlibraryext.scalepicture.code.tex \
tex-tikzlibraryext.topaths.arcthrough.code.tex \
tex-tikzlibraryext.transformations.mirror.code.tex \
texlive-tikz-ext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfcalendar.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
