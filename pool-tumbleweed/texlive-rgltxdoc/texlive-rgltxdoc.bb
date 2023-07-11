SUMMARY = "Common code for documentation of the author's packages"
DESCRIPTION = "This package combines several other packages and defines \
additional macros and environments for documenting LaTeX code. \
The package mainly serves the purpose of combining the \
preferences used in the author's own package documentations. \
However, others can use the package as well. Compatibility \
between versions cannot be guaranteed, however."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn53858"

RPM_NAME = "texlive-rgltxdoc-2023.201.1.3svn53858-53.2.noarch.rpm"
RPM_HASH = "0b6b72ede478350456d6c44d653e46ace6d21624976dae8291e4176f1638a27c2faf90e1e25d791a5eb4944305729493fdb7b7157557af510dd540d03f4fb38d"
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
