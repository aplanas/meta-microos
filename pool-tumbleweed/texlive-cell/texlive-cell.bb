SUMMARY = "Bibliography style for Cell"
DESCRIPTION = "This is an 'apa-like' style (cf. apalike.bst in the BibTeX \
distribution), developed from the same author's JMB style. A \
supporting LaTeX package is also provided."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn42428"

RPM_NAME = "texlive-cell-2023.201.svn42428-52.1.noarch.rpm"
RPM_HASH = "126cad7577c79d99fe63244cf308b97acaea3a5dee6b5b010fb09e67fa9d4048e0ee66dbadca3f650a9f8e775ff509a3e798eb748e17bb8df44ebe2e56b1bf74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cell.sty \
texlive-cell"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cite.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
