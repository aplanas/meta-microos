SUMMARY = "Slides with headers and footers"
DESCRIPTION = "The class provides a variant of the LaTeX standard slides \
class, in which the user may add headers and footers to the \
slide."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn32293"

RPM_NAME = "texlive-sslides-2023.201.svn32293-57.1.noarch.rpm"
RPM_HASH = "fd8437329af4c35a4a6a3832b2587593259acbb38ccdc68f21c231c06a40f825f04621c3d0f93b9983b7261cc9879140d1535744c63225874e350a8defe9d90c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sslides.cls \
texlive-sslides"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-slides.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
