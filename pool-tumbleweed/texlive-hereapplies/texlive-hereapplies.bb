SUMMARY = "A LaTeX package for referencing groups of pages that share something in common"
DESCRIPTION = "Here Applies is a LaTeX package that allows to collect groups \
of labels and reference them altogether. It can be used for \
creating informal glossaries that cross-link concepts to their \
applications, or simply mentioning multiple pages that share \
something in common."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0.1svn65251"

RPM_NAME = "texlive-hereapplies-2023.201.1.0.1svn65251-53.1.noarch.rpm"
RPM_HASH = "f5c9bcbc0f749640819c33c9c67358f98887783f641d2aebf80aab9b81c34613f2449e724384d603b030332f34f9a51248810e38510241994f47230b49c338a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hereapplies.sty) \
texlive-hereapplies"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(hyperref.sty) \
tex(refcount.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
