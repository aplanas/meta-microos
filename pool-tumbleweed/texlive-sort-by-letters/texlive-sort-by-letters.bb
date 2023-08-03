SUMMARY = "Bibliography styles for alphabetic sorting"
DESCRIPTION = "This bundle contains several bibliography styles for separating \
a document's references by the first letter of the first \
author/editor in the bibliography entry. The styles are adapted \
from standard ones or from natbib ones."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn27128"

RPM_NAME = "texlive-sort-by-letters-2023.209.svn27128-58.1.noarch.rpm"
RPM_HASH = "c750244e1f356d01714d097422ed1bf0821d4890d2e92c26bdf71dad116fa4cc1792e04a32d8456702a2760afe9b5aeea7db3dc5ae24f13c84c2ba1ec1a51ed6"
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
