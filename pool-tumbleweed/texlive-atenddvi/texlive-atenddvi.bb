SUMMARY = "Provides the \\AtEndDvi command"
DESCRIPTION = "This package is unneeded and does nothing when used with a \
LaTeX format 2020-10-01 or newer as in this case the format \
provides the \\AtEndDvi command. For older formats it implements \
\\AtEndDvi, a counterpart to \\AtBeginDvi. The execution of its \
argument is delayed to the end of the document at the end of \
the last page. Thus \\special and \\write remain effective, \
because they are put into the last page. This is the main \
difference to \\AtEndDocument."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn56922"

RPM_NAME = "texlive-atenddvi-2023.209.1.5svn56922-54.1.noarch.rpm"
RPM_HASH = "967d1eb09f33ca065c7e186895ea2a9397d9411573be6b22bf69a4f518ca2f2e76056607450072253e24f83576e40c0fa27565ac7b5ecc0df37cc4935e56b470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-atenddvi-2019-12-11.sty \
tex-atenddvi.sty \
texlive-atenddvi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-zref-abspage.sty \
tex-zref-lastpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
