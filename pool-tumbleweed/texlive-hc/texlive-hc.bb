SUMMARY = "Replacement for the LaTeX classes"
DESCRIPTION = "A set of replacements for the default LaTeX classes, based upon \
the Koma-Script bundle and the seminar class. Includes hcart, \
hcreport, hcletter, and hcslides."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-hc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "0a839ac481c87c194436eade235139982abc9d5d279f9c6eb4a01ce7acac58215b842baca19ef0f3ff3754ce72f57108c42bcde1eabd0c2751bc125bbfd65275"
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
