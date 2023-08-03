SUMMARY = "Replacement for the LaTeX classes"
DESCRIPTION = "A set of replacements for the default LaTeX classes, based upon \
the Koma-Script bundle and the seminar class. Includes hcart, \
hcreport, hcletter, and hcslides."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-hc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "73a03ab6ab85f77560a0177005809b4711381476cc96c802a42d607af17f1931c30c05e124380452d368a32256016cb63753fec1b9f4ccf10231e891cf60d4ed"
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
