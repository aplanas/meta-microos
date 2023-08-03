SUMMARY = "Support for submissions to the 'Beilstein Journal of Nanotechnology'"
DESCRIPTION = "The package provides a LaTeX class file and a BibTeX style file \
in accordance with the requirements of submissions to the \
``Beilstein Journal of Nanotechnology''. Although the files can \
be used for any kind of document, they have only been designed \
and tested to be suitable for submissions to the Beilstein \
Journal of Nanotechnology."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn56193"

RPM_NAME = "texlive-beilstein-2023.209.2.1svn56193-54.1.noarch.rpm"
RPM_HASH = "5eec5b1e2b7ea93476f522d0294ea6fab1047f5f5c3692ea1e2db11ef2bceaeed853a1b71b12839583ff7ea7a33e1a358b5c8243f140286fd0d90516bf812a22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beilstein.cls \
texlive-beilstein"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-article.cls \
tex-babel.sty \
tex-cleveref.sty \
tex-etoolbox.sty \
tex-flafter.sty \
tex-float.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-lineno.sty \
tex-longtable.sty \
tex-multicol.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-newtxtt.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-tabularx.sty \
tex-textcomp.sty \
tex-tgheros.sty \
tex-url.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
