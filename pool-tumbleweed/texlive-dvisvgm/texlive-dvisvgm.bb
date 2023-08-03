SUMMARY = "Convert DVI, EPS, and PDF files to Scalable Vector Graphics format (SVG)"
DESCRIPTION = "Dvisvgm is a command line utility that converts TeX DVI as well \
as EPS and PDF files to the XML-based Scalable Vector Graphics \
(SVG) format. It provides full font support including virtual \
fonts, font maps, and sub-fonts. If necessary, dvisvgm \
vectorizes Metafont's bitmap output in order to always create \
lossless scalable output. The embedded SVG fonts can optionally \
be replaced with graphics paths so that applications that do \
not support SVG fonts are enabled to render the graphics \
properly. Besides many other features, dvisvgm also supports \
color, emTeX, tpic, papersize, PDF mapfile and PostScript \
specials. Users will need a working TeX installation including \
the kpathsea library. For more detailed information, see the \
project page."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.0.4svn66532"

RPM_NAME = "texlive-dvisvgm-2023.209.3.0.4svn66532-54.1.noarch.rpm"
RPM_HASH = "c9736641cf6accbbd43679887065455c1bec2f1fb1b9eac0cf45758a8a38efa44cd0980a06ac0477ee75b334b614f3a7ce4521fdac0e00386a1f13be1e8af272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvisvgm.1 \
texlive-dvisvgm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvisvgm-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
