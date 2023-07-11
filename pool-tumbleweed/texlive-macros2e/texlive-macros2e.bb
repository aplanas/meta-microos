SUMMARY = "A list of internal LaTeX2e macros"
DESCRIPTION = "This document lists the internal macros defined by the LaTeX2e \
base files which can also be useful to package authors. The \
macros are hyper-linked to their description in source2e. For \
this to work both PDFs must be inside the same directory. This \
document is not yet complete in content and format and may miss \
some macros."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.4asvn64967"

RPM_NAME = "texlive-macros2e-2023.208.0.0.4asvn64967-53.1.noarch.rpm"
RPM_HASH = "72414b0e98e75fc72b8e377fd695d77a9ea91ce7e7fdbb712ddab15fd02d9b06b56d1e8abc3eaea2ed678dc52ea0667ba7ba8d31900f67b5ad0073ea14dfd074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-extlabels.sty \
texlive-macros2e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-lipsum.sty \
tex-zref-abspos.sty \
tex-zref-user.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
