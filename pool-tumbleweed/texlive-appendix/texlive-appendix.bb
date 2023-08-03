SUMMARY = "Extra control of appendices"
DESCRIPTION = "The appendix package provides various ways of formatting the \
titles of appendices. Also (sub)appendices environments are \
provided that can be used, for example, for per chapter/section \
appendices. The word 'Appendix' or similar can be prepended to \
the appendix number for article class documents. The word \
'Appendices' or similar can be added to the table of contents \
before the appendices are listed. The word 'Appendices' or \
similar can be typeset as a \\part-like heading (page) in the \
body. An appendices environment is provided which can be used \
instead of the \\appendix command."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2csvn53718"

RPM_NAME = "texlive-appendix-2023.209.1.2csvn53718-55.1.noarch.rpm"
RPM_HASH = "0ccd6c51fa325ab5e2712f24ddd31c0dc6d60d1929169c1a13a5a3fff437ff21ff9ff9c0ae864178bb3e93ff7d5ec438935de418aaaed83e71b8598fafa2ef41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-appendix.sty \
texlive-appendix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
