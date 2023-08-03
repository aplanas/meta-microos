SUMMARY = "Typeset and convert units for cookery books and recipes"
DESCRIPTION = "The package provides commands to typeset amounts and units \
consistently and offers an easy-to-use key-value syntax to \
convert one unit into another (for example 'dag' to 'g'; see \
the documentation for more examples). This packages requires \
expl3 and xparse, translations, xfrac, l3keys2e, and, \
optionally, fmtcount."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.00svn65241"

RPM_NAME = "texlive-cooking-units-2023.209.3.00svn65241-55.1.noarch.rpm"
RPM_HASH = "ba12d8de7e81eb40a55aadd304fb0c6149e4577868abb81ff1afc04f846471028e7a24b4457bd206b16a30685266a80e829b74dcf84ea7ce14c0bee4366271c1"
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
