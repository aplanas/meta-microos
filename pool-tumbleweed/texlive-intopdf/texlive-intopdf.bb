SUMMARY = "Embed non-PDF files into PDF with hyperlink"
DESCRIPTION = "The package allows to embed non-PDF files (e.g., BibTeX) into \
PDF with a hyperlink."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn63987"

RPM_NAME = "texlive-intopdf-2023.201.0.0.4.1svn63987-52.1.noarch.rpm"
RPM_HASH = "898895c2723049db46e1cb0c752a6fe7fe56060ec7f1aaf0a73561c668c44ce473e12ce3a244fcebeabb79a6d2f97bab05df222fdaf4aa716a2ccffdd2ff6684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-intopdf.sty \
texlive-intopdf"

RDEPENDS:${PN} += "/bin/sh \
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
