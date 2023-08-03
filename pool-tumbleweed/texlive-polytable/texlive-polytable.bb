SUMMARY = "Tabular-like environments with named columns"
DESCRIPTION = "This package implements a variant of tabular-like environments \
where columns can be given a name and entries can flexibly be \
placed between arbitrary columns. Complex alignment-based \
layouts, for example for program code, are possible. The \
package depends on lazylist."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.6svn55837"

RPM_NAME = "texlive-polytable-2023.209.0.0.8.6svn55837-53.1.noarch.rpm"
RPM_HASH = "de82e1345a59616e792ff8a0339555ac26a7409c8182a69209afdecc0606f761c63771121be61e6d7edc206bb53ec26b271cf49b6574acccda51a1dc6a6c5ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-polytable.sty \
texlive-polytable"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-lazylist.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
