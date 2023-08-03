SUMMARY = "Set page orientation with dvips/Ghostscript (ps2pdf)"
DESCRIPTION = "This package provides commands for manual (per-page and \
per-document) orientation of pages in a PDF created with \
dvips/Ghostscript (ps2pdf). For future versions it is planned \
to add support for other drivers, allowing for PDF orientation \
to be set in (x)dvipdfmx and pdfmode pdfTeX using the same \
commands from the user perspective."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn57390"

RPM_NAME = "texlive-orientation-2023.209.1.0svn57390-55.1.noarch.rpm"
RPM_HASH = "72191152de38b653704162133b92404abab266474ced1ded5a1c1a58b5ae9d8686bfd890e6e79aa3d1d576c848993bfa13211d997e7423590214e5798d031768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-orientation.sty \
texlive-orientation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everypage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
