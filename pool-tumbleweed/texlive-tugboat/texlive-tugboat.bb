SUMMARY = "LaTeX macros for TUGboat articles"
DESCRIPTION = "Provides ltugboat.cls for both regular and proceedings issues \
of the TUGboat journal. Also provides a BibTeX style, \
tugboat.bst."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.29svn66513"

RPM_NAME = "texlive-tugboat-2023.209.2.29svn66513-53.1.noarch.rpm"
RPM_HASH = "2d32e533065c6b2917423231b3fff78f53671d8f2b85f12da5d9176e4515c76cd664954363c52f6837b6dba5dc57e221831202738c3827a1404292de3d45ec69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltugboat.cls \
tex-ltugboat.sty \
tex-ltugcomn.sty \
tex-ltugproc.cls \
tex-ltugproc.sty \
texlive-tugboat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-mflogo.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
