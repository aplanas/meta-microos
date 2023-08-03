SUMMARY = "LaTeX class for articles published in INGENIERIA review"
DESCRIPTION = "The class is for articles published in INGENIERIA review. It is \
derived from the standard LaTeX class article."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn38741"

RPM_NAME = "texlive-articleingud-2023.209.0.0.3svn38741-54.1.noarch.rpm"
RPM_HASH = "d420e21f251e1fe702d8ce5a89d459cec266494e867c95e2d55c0835f28cc8a27e06216161c8cd8caf0b0fba9511890203e5f6699654f52d24b4e503b288ccab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-articleingud.cls \
texlive-articleingud"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
