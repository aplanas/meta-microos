SUMMARY = "Bibliography styles for alphabetic sorting"
DESCRIPTION = "This bundle contains several bibliography styles for separating \
a document's references by the first letter of the first \
author/editor in the bibliography entry. The styles are adapted \
from standard ones or from natbib ones."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn27128"

RPM_NAME = "texlive-sort-by-letters-2023.201.svn27128-57.1.noarch.rpm"
RPM_HASH = "146d310c0ff302b6b6c5f7f5404a98b564b5e4de380d904fc0c88e65805627b586e8ff50a9b277fed4ae45aefbe825d6a18a285db3e1fbeadee6fac79c8c8d47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sort-by-letters"

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
