SUMMARY = "Chicago-based annotated BibTeX style"
DESCRIPTION = "This is a revision of chicagoa.bst, using the commonly-used \
annote field in place of the original's annotation."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-chicago-annote-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "6ec766da4c1cb124f154ea1fa5277e3b6f03dc8adc8081b755965aaad721dfeba8cc695f99e673bd3f3b90bb0587f22285f7dcc43a9267dbd5786b3b9192714e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chicago-annote"
RDEPENDS:${PN} += "/bin/sh \
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
