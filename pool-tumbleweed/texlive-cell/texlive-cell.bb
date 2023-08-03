SUMMARY = "Bibliography style for Cell"
DESCRIPTION = "This is an 'apa-like' style (cf. apalike.bst in the BibTeX \
distribution), developed from the same author's JMB style. A \
supporting LaTeX package is also provided."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn42428"

RPM_NAME = "texlive-cell-2023.209.svn42428-53.1.noarch.rpm"
RPM_HASH = "5ec5305515d8333156e0195aeb661767fc4603af54d00f385435e435eea9e7c90b6b67abc8f8954bf9bd8253b3b55960d442fe1ab6445b45d0f34e8083c46817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cell.sty \
texlive-cell"

RDEPENDS:${PN} += "/usr/bin/sh \
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
