SUMMARY = "LaTeX classes for the Humboldt-Universitat zu Berlin"
DESCRIPTION = "This package provides files according to the corporate design \
of the Humboldt-Universitat zu Berlin. This is not an official \
package by the university itself, and not officially approved \
by it. More information can be found in the Humboldt \
University's corporate design guideline and on the website \
https://www.hu-berlin.de/de/hu-intern/design. At present, the \
bundle contains a letter class based on scrlttr2 and a package \
hu-berlin-base.sty which contains all relevant code for \
documents and documentclasses of the bundle."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1.1svn57580"

RPM_NAME = "texlive-hu-berlin-bundle-2023.208.1.1.1svn57580-53.1.noarch.rpm"
RPM_HASH = "675463de9492b2e3f7ce2e468a6bb61875a7d2fe095acc968dfb8ccde5c41b18f626e861d31a820e83f2059c1b10d8b9d8a76ad9d667c5f71eb22ef9fe744534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hu-berlin-base.sty \
tex-hu-berlin-bundle-style.sty \
tex-hu-berlin-letter.cls \
texlive-hu-berlin-bundle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-babel.sty \
tex-biblatex.sty \
tex-bookmark.sty \
tex-calc.sty \
tex-ccicons.sty \
tex-dirtree.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-hyperxmp.sty \
tex-ifluatex.sty \
tex-libertine.sty \
tex-listings.sty \
tex-luatex85.sty \
tex-luatexbase.sty \
tex-marginnote.sty \
tex-markdown.sty \
tex-marvosym.sty \
tex-microtype.sty \
tex-newfile.sty \
tex-pdfpages.sty \
tex-ragged2e.sty \
tex-scrlayer-scrpage.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
