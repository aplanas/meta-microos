SUMMARY = "Provides a key/value interface for generating floats"
DESCRIPTION = "The keyfloat package provides a key/value user interface for \
quickly creating figures with a single image each, figures with \
arbitrary contents, tables, subfloats, rows of floats, floats \
located [H]ere, floats in the [M]argin, and floats with text \
[W]rapped around them. Key/value combinations may specify a \
caption and label, a width proportional to \\linewidth, a fixed \
width and/or height, rotation, scaling, a tight or loose frame, \
an \\arraystretch, a continued float, additional supplemental \
text, and an artist/author's name with automatic index entry. \
When used with the tocdata package, the name also appears in \
the List of Figures. Floats may be placed into a row \
environment, and are typeset to fit within the given number of \
columns, continuing to the next row if necessary. Nested \
sub-rows may be used to generate layouts such as two small \
figures placed vertically next to one larger figure. Subfloats \
are supported by two environments."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.08svn65446"

RPM_NAME = "texlive-keyfloat-2023.201.2.08svn65446-55.1.noarch.rpm"
RPM_HASH = "0cd5222be1feadf692c836415d47968b8e60a81514343f633d63dc36992c15c34e86785e0310f89231cd830c80fedc06da36df34fe8b7b54e815b630bea64b54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keyfloat.sty \
texlive-keyfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-caption.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-placeins.sty \
tex-rotating.sty \
tex-subcaption.sty \
tex-wrapfig.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
