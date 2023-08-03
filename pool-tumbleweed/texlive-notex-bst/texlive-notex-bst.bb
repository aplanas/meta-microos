SUMMARY = "A BibTeX style that outputs HTML"
DESCRIPTION = "noTeX.bst produces a number of beautifully formatted HTML P \
elements instead of TeX code. It can be used to automatically \
generate bibliographies to be served on the web starting from \
BibTeX files."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn42361"

RPM_NAME = "texlive-notex-bst-2023.209.svn42361-55.1.noarch.rpm"
RPM_HASH = "d0af5dd12792c57e2011b0fb69ad8fceb39384de09d380eefbce44ca7dad3399a4b3bbf8e64c816757ba0f928df777605cbd7f9ab90d341e8aab53180e9f885c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notex-bst"

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
