SUMMARY = "Embed non-PDF files into PDF with hyperlink"
DESCRIPTION = "The package allows to embed non-PDF files (e.g., BibTeX) into \
PDF with a hyperlink."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.4.1svn63987"

RPM_NAME = "texlive-intopdf-2023.208.0.0.4.1svn63987-53.1.noarch.rpm"
RPM_HASH = "1a8ddedc7327d273c5a7ddc8ac1dd15b69548fa447881c45d033f450016c323ad2ec5def26637ed5e49fdd7efe03b9621210f3033ddce03e64fa703b58034fee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-intopdf.sty \
texlive-intopdf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-hyperref.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
