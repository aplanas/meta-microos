SUMMARY = "Typeset (potentially long) recipes"
DESCRIPTION = "The package enables the user to typeset recipes, which could be \
greater than one page. Above the recipe text two (optional) \
pictures can be displayed. Other features are recipe name, \
energy content, portions, preparation and baking time, baking \
temperatures, recipe source and of course preparation steps and \
required ingredients. At the bottom you may insert an optional \
hint. The package depends on the Emerald fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn36435"

RPM_NAME = "texlive-xcookybooky-2023.201.1.5svn36435-52.2.noarch.rpm"
RPM_HASH = "62a526994c0f0bceb06d3036604603771e65e78bd356276a3537afb4151548d7a0d4e96ac3b7860eebf774cbf9433d75505764f59813e1474c5c0c90011c0668"
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
