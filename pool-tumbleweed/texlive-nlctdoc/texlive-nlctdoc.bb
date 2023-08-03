SUMMARY = "Package documentation class"
DESCRIPTION = "The class provides support for the documentation of the \
author's packages, using koma-script. This class is provided \
'as is' solely for the benefit of anyone who wants to compile \
the documentation of those packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.08svn64708"

RPM_NAME = "texlive-nlctdoc-2023.209.1.08svn64708-55.1.noarch.rpm"
RPM_HASH = "f873c5918345b70a195806419841dd11c67f5f602b9a9954607741967613b5b59e857ccbec84853a0c099e597516ac9e0da421ab5653d08221336dec0115a8fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nlctdoc.cls \
tex-nlctuserguide.sty \
texlive-nlctdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-array.sty \
tex-attachfile.sty \
tex-cmap.sty \
tex-doc.sty \
tex-dox.sty \
tex-etoolbox.sty \
tex-fontawesome.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-fourier.sty \
tex-glossaries-extra.sty \
tex-hologo.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-luatex85.sty \
tex-mfirstuc.sty \
tex-pifont.sty \
tex-scrhack.sty \
tex-tcolorbox.sty \
tex-tex4ht.sty \
tex-textcomp.sty \
tex-twemojis.sty \
tex-upquote.sty \
tex-varioref.sty \
tex-xcolor.sty \
tex-xr-hyper.sty \
tex-xr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
