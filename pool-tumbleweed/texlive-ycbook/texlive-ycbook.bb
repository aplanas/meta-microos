SUMMARY = "A versatile book class"
DESCRIPTION = "This class is intended to be an interpretation of the mwbk \
class which is a part of the mwcls package. The mwcls classes \
are simple, yet powerful and customizable classes that allow \
the end-user to customize the layout of headers, headings etc. \
They also have the benefit of being more economic in space than \
the most common LaTeX classes, while keeping a clear appearance \
and a smooth flow."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn46201"

RPM_NAME = "texlive-ycbook-2023.209.svn46201-53.1.noarch.rpm"
RPM_HASH = "28f7fd39b44e1672b1a15d4b7393823de49caed7c1c4570af4ae496c0fda6d3a53679907894aa2ade195f8452861493d6f439d822e067ccac5d79c272e6ee47c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ycbook.cls \
texlive-ycbook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-afterpage.sty \
tex-booktabs.sty \
tex-changepage.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-placeins.sty \
tex-polyglossia.sty \
tex-titletoc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
