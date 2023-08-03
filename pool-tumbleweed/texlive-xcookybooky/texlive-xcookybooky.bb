SUMMARY = "Typeset (potentially long) recipes"
DESCRIPTION = "The package enables the user to typeset recipes, which could be \
greater than one page. Above the recipe text two (optional) \
pictures can be displayed. Other features are recipe name, \
energy content, portions, preparation and baking time, baking \
temperatures, recipe source and of course preparation steps and \
required ingredients. At the bottom you may insert an optional \
hint. The package depends on the Emerald fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn36435"

RPM_NAME = "texlive-xcookybooky-2023.209.1.5svn36435-53.1.noarch.rpm"
RPM_HASH = "fb542f511cb4b58dc690ac8b1a6efe76eb90050e228631924daa1d39c8ec71d82619ac62ed388a9d1973316a4123ba5cec0d9b1c4e1412d10fbd92cc33b98547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcookybooky.cfg \
tex-xcookybooky.sty \
texlive-xcookybooky"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cookingsymbols.sty \
tex-eso-pic.sty \
tex-fancyhdr.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-iflang.sty \
tex-ifsym.sty \
tex-ifthen.sty \
tex-lettrine.sty \
tex-picture.sty \
tex-tabulary.sty \
tex-tikz.sty \
tex-units.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
