SUMMARY = "Common code for documentation of the author's packages"
DESCRIPTION = "This package combines several other packages and defines \
additional macros and environments for documenting LaTeX code. \
The package mainly serves the purpose of combining the \
preferences used in the author's own package documentations. \
However, others can use the package as well. Compatibility \
between versions cannot be guaranteed, however."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn53858"

RPM_NAME = "texlive-rgltxdoc-2023.209.1.3svn53858-54.1.noarch.rpm"
RPM_HASH = "003110a8f8436af2c951ac8c70320ac72b8f580d64ff07b5719e39ceae0b4ff330311d6962e040555069387df7846926fa42f88c443124089693905f9bb1a357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rgltxdoc.sty \
texlive-rgltxdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-babel.sty \
tex-calc.sty \
tex-cleveref.sty \
tex-csquotes.sty \
tex-doc.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-hologo.sty \
tex-hypdoc.sty \
tex-idxlayout.sty \
tex-ifluatex.sty \
tex-inputenc.sty \
tex-keyvaltable.sty \
tex-lmodern.sty \
tex-luainputenc.sty \
tex-microtype.sty \
tex-pbox.sty \
tex-polyglossia.sty \
tex-showexpl.sty \
tex-typearea.sty \
tex-varioref.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
