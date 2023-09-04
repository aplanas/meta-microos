SUMMARY = "Replacement for the LaTeX classes"
DESCRIPTION = "A set of replacements for the default LaTeX classes, based upon \
the Koma-Script bundle and the seminar class. Includes hcart, \
hcreport, hcletter, and hcslides."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-hc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "b7b64805ca91f3596abfcf56b126ae2d42d66d63575d3c7c1a95a5b13e11118796ec00538af5ccc3a95b0f9f52b8242009ac7cc85ae2daffee3fe54d4a52f5f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hcart.cls \
tex-hcletter.cls \
tex-hcreport.cls \
tex-hcslides.cls \
texlive-hc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fancybox.sty \
tex-fancyref.sty \
tex-fontenc.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-mathpple.sty \
tex-multicol.sty \
tex-natbib.sty \
tex-palatino.sty \
tex-pifont.sty \
tex-truncate.sty \
tex-typearea.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
