SUMMARY = "A collection of libraries for PGF/TikZ"
DESCRIPTION = "This is a collection of libraries for PGF/TikZ. Currently these \
are transformations.mirror, paths.arcto, paths.ortho, \
paths.timer, patterns.images, topaths.arcthrough and misc. Most \
of these libraries were developed in response to questions on \
TeX.stackexchange.com."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.0.0.4.2svn64920"

RPM_NAME = "texlive-tikz-ext-2023.201.0.0.4.2svn64920-52.1.noarch.rpm"
RPM_HASH = "ea16cd4d6f1b94e489b05405a59404e8f96be1b72c03924eb255359b0eb3a4050714975e9bd5bb88c6f0d4158dd05fa1f6b5f2cb0932c595b00538cb66df79fc"
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

RDEPENDS:${PN} += "/bin/sh \
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
