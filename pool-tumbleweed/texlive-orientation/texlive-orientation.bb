SUMMARY = "Set page orientation with dvips/Ghostscript (ps2pdf)"
DESCRIPTION = "This package provides commands for manual (per-page and \
per-document) orientation of pages in a PDF created with \
dvips/Ghostscript (ps2pdf). For future versions it is planned \
to add support for other drivers, allowing for PDF orientation \
to be set in (x)dvipdfmx and pdfmode pdfTeX using the same \
commands from the user perspective."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn57390"

RPM_NAME = "texlive-orientation-2023.201.1.0svn57390-54.1.noarch.rpm"
RPM_HASH = "9258d88f774f1d87123c63874ffc1755f0ec4d2317ac7c6336b2cb03b02a5dd297039a6f57cd19e200c7e91e278dd4e042871eac4b322036de3b442f60781b87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(orientation.sty) \
texlive-orientation"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(everypage.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
