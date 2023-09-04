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

RPM_NAME = "texlive-ycbook-2023.209.svn46201-53.2.noarch.rpm"
RPM_HASH = "4a96eaa0037024fe4e1b0f11acfb81672273c026ad8c4856ea0cc85d818bb32e4bf458893dda0247f79b5b752b0bdd78d121163f891768897788e6b5a5be4c8e"
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
