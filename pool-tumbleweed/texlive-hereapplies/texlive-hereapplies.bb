SUMMARY = "A LaTeX package for referencing groups of pages that share something in common"
DESCRIPTION = "Here Applies is a LaTeX package that allows to collect groups \
of labels and reference them altogether. It can be used for \
creating informal glossaries that cross-link concepts to their \
applications, or simply mentioning multiple pages that share \
something in common."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0.1svn65251"

RPM_NAME = "texlive-hereapplies-2023.209.1.0.1svn65251-54.1.noarch.rpm"
RPM_HASH = "05f7dda429eaef8ab19abab53551a2aa4d9ce1f8deef9593a9aa01cd2c8bfd2f687ffbc97781c3cc7fb44f6d97b9d81be80f16ebd875676623a2e81024813a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hereapplies.sty \
texlive-hereapplies"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-refcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
