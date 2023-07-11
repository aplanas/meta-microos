SUMMARY = "A versatile book class"
DESCRIPTION = "This class is intended to be an interpretation of the mwbk \
class which is a part of the mwcls package. The mwcls classes \
are simple, yet powerful and customizable classes that allow \
the end-user to customize the layout of headers, headings etc. \
They also have the benefit of being more economic in space than \
the most common LaTeX classes, while keeping a clear appearance \
and a smooth flow."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46201"

RPM_NAME = "texlive-ycbook-2023.201.svn46201-52.2.noarch.rpm"
RPM_HASH = "1a32602260c7014aeb0fb32754c33faf47eb6deb2604c2b500a1911228780a1ebff7c72d770b807b98a734ab7211cc6c06be63814eeda30af9afd270b0e1e49c"
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
