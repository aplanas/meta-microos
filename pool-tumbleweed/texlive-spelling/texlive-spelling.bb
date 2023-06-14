SUMMARY = "Support for spell-checking of LuaTeX documents"
DESCRIPTION = "The package aids spell-checking of TeX documents compiled with \
the LuaTeX engine. It can give visual feedback in PDF output \
similar to WYSIWYG word processors. The package relies on an \
external spell-checker application to check spelling of a text \
file and to output a list of bad spellings. The package should \
work with most spell-checkers, even dumb, TeX-unaware ones."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.41svn30715"

RPM_NAME = "texlive-spelling-2023.201.0.0.41svn30715-57.1.noarch.rpm"
RPM_HASH = "3298ee7317d0b5251a63fa13db3eca51860232838f36772a19e6e480c63d20fff9355680d40548c4baeabaebf381d459c31a5e4d1dbe5ad751c65b2bba440300"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spelling.sty \
texlive-spelling"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/luatex \
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
