SUMMARY = "Named colors for web-safe design"
DESCRIPTION = "This package defines web-safe colors for use with D.P. \
Carlisle's color package. It is intended for both authors and \
package writers (e.g. to create Beamer color themes)."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.02svn54512"

RPM_NAME = "texlive-css-colors-2023.204.1.02svn54512-54.1.noarch.rpm"
RPM_HASH = "ba5b0ad012ea95f34c39a9690c7f7e25ef8ed50b699492b802f33f62179c47dddaf0afc05fb78a133fa71d2f0115a00443e633a6da8d625e3422fa772d53ebbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(css-colors.sty) \
texlive-css-colors"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
