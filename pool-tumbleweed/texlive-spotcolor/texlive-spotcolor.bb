SUMMARY = "Spot colours for pdfLaTeX"
DESCRIPTION = "This package provides procedures for using spot colours in \
LaTeX documents and the generated pdf files. Predefined \
templates for PANTONE and HKS colour spaces are included but \
new ones can easily be defined."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-spotcolor-2023.201.1.2svn15878-57.1.noarch.rpm"
RPM_HASH = "86413e4e53697bc781b8fbfb18ba9de58a6fc06acc8f93b788f5cbc959e74d46672e9f333c3e8671b9cf475cb93ff3da8f7a68d215de01a1dc71ee1d92d0cdab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(spotcolor.sty) \
tex(spotcolorhks.tex) \
tex(spotcolorpantone.tex) \
texlive-spotcolor"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphics.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
