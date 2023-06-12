SUMMARY = "A list of internal LaTeX2e macros"
DESCRIPTION = "This document lists the internal macros defined by the LaTeX2e \
base files which can also be useful to package authors. The \
macros are hyper-linked to their description in source2e. For \
this to work both PDFs must be inside the same directory. This \
document is not yet complete in content and format and may miss \
some macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4asvn64967"

RPM_NAME = "texlive-macros2e-2023.201.0.0.4asvn64967-52.1.noarch.rpm"
RPM_HASH = "acdc2ccf5e614756f36dda3dcfd0d26ebe6ce6a241d857b0e19d1375993e90aefc18e749e2637b200e6658a1b8b04395ed33b64e289a02394ef1b6059e64a44b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(extlabels.sty) \
texlive-macros2e"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(hyperref.sty) \
tex(lipsum.sty) \
tex(zref-abspos.sty) \
tex(zref-user.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
