SUMMARY = "Common code for documentation of the author's packages"
DESCRIPTION = "This package combines several other packages and defines \
additional macros and environments for documenting LaTeX code. \
The package mainly serves the purpose of combining the \
preferences used in the author's own package documentations. \
However, others can use the package as well. Compatibility \
between versions cannot be guaranteed, however."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn53858"

RPM_NAME = "texlive-rgltxdoc-2023.201.1.3svn53858-53.1.noarch.rpm"
RPM_HASH = "eb73f38413093f68653e780d0c0a2f3e5d13e049ae3b8ee5cb769f7824d0da56263c3c37dd11d84684cd3b15e0eac9d5837ee6ee1be2974d902dc0259c988b94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rgltxdoc.sty \
texlive-rgltxdoc"

RDEPENDS:${PN} += "/bin/sh \
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
