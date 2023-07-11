SUMMARY = "Geneva School of Economics and Management PhD thesis format"
DESCRIPTION = "The class provides a PhD thesis template for the Geneva School \
of Economics and Management (GSEM), University of Geneva, \
Switzerland. The class provides utilities to easily set up the \
cover page, the front matter pages, the page headers, etc., \
conformant to the official guidelines of the GSEM Faculty for \
writing PhD dissertations."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.4svn56291"

RPM_NAME = "texlive-gsemthesis-2023.201.0.0.9.4svn56291-53.2.noarch.rpm"
RPM_HASH = "791df2fcde03e75b6f4c5d8dbed5e3dc9e5fddc18999a2e446a30846cf729029778c1ee606aea3c44ae19c718b9a848adf472c667fae75db7d18bcae226b4b9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gsemthesis.cls \
texlive-gsemthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-babel.sty \
tex-book.cls \
tex-csquotes.sty \
tex-datetime.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-lmodern.sty \
tex-setspace.sty \
tex-subfigure.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
