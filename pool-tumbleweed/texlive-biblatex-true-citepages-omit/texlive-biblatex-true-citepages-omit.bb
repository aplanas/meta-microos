SUMMARY = "Correction of some limitation of the citepages=omit option of BibLaTeX styles"
DESCRIPTION = "This package deals with a limitation of the citepages=omit \
option of the verbose family of BibLaTeX citestyles. The option \
works when you \\cite[xx]{key}, but not when you \\cite[\\pno~xx, \
some text]{key}. The package corrects this problem."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn44653"

RPM_NAME = "texlive-biblatex-true-citepages-omit-2023.209.2.0.0svn44653-54.1.noarch.rpm"
RPM_HASH = "5a58e118550f505717aa154a0c87df8a08e246cd1551d197e246c10ba9a10d38401ec1ada40c9dce2a8b1fd344f5d994daf2817d19c1aeadeb7baff3c7396ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex-true-citepages-omit.sty \
texlive-biblatex-true-citepages-omit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
