SUMMARY = "Support for spell-checking of LuaTeX documents"
DESCRIPTION = "The package aids spell-checking of TeX documents compiled with \
the LuaTeX engine. It can give visual feedback in PDF output \
similar to WYSIWYG word processors. The package relies on an \
external spell-checker application to check spelling of a text \
file and to output a list of bad spellings. The package should \
work with most spell-checkers, even dumb, TeX-unaware ones."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.41svn30715"

RPM_NAME = "texlive-spelling-2023.209.0.0.41svn30715-58.1.noarch.rpm"
RPM_HASH = "074057f0ace07a2d2bcf4242eb2f9155c1e4e33f0e8e7c2c5b7ba74b408833296c803157e592372ed566975172ef0f7ed50d2bb74817943ee94f847b124dbe40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spelling.sty \
texlive-spelling"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-ifluatex.sty \
tex-luatexbase-attr.sty \
tex-luatexbase-mcb.sty \
tex-luatexbase-modutils.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
