SUMMARY = "Typeset and convert units for cookery books and recipes"
DESCRIPTION = "The package provides commands to typeset amounts and units \
consistently and offers an easy-to-use key-value syntax to \
convert one unit into another (for example 'dag' to 'g'; see \
the documentation for more examples). This packages requires \
expl3 and xparse, translations, xfrac, l3keys2e, and, \
optionally, fmtcount."
LICENSE = "LPPL-1.0"

PV = "2023.204.3.00svn65241"

RPM_NAME = "texlive-cooking-units-2023.204.3.00svn65241-54.1.noarch.rpm"
RPM_HASH = "3838a43c06677cac8ce4fc1d3b67c40b5f5891992cac7044f36131709450ea06789bf31440c69f0bc71cc3cf2ffece6e47fe59139a158f36c94312a56343c731"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cooking-units.sty \
texlive-cooking-units"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-fmtcount.sty \
tex-l3keys2e.sty \
tex-translations.sty \
tex-xfrac.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
