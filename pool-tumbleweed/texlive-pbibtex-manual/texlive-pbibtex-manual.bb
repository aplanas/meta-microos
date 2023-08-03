SUMMARY = "Documentation files for (u)pBibTeX"
DESCRIPTION = "The bundle contains documentation files for Japanese pBibTeX \
and upBibTeX. For historical reasons, this also contains old \
documentation files for JBibTeX."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn66181"

RPM_NAME = "texlive-pbibtex-manual-2023.209.svn66181-52.1.noarch.rpm"
RPM_HASH = "bed7d37827414d49580e75a576aca98aa407197c99a637dc9508c001b4436466aa1912d19b63eb286bfc33c9c33236d40006f505bb49eae3e6537b78e2e81426"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pbibtex-manual"

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
