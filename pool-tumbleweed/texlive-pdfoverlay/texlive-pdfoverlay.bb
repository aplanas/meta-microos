SUMMARY = "A LaTeX style for overlaying text on a PDF"
DESCRIPTION = "It is often desirable to take an exisiting PDF and easily add \
annotations or text overlaying the PDF. This might arise if you \
wish to add comments to a PDF, fill in a PDF form, or add text \
to a PDF where space has been left for notes. This package \
provides a simple interface to do this without having to resort \
to inserting one page at a time. Some or all of the pages of \
the PDF can be included and not all pages of the PDF need have \
overlayed text. It is also possible to include text between \
pages of the PDF. Another advantage of this package is that the \
overlayed text can be set as normal flowing from one page to \
another or with manual page breaks if you wish. It is also \
possible to use any standard method to position text at \
arbitrary places on a given page."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn64210"

RPM_NAME = "texlive-pdfoverlay-2023.209.1.3svn64210-52.1.noarch.rpm"
RPM_HASH = "befa929c21ae68fe1f7aa44dad7c1b177979c0a4913621eef789a89f390e94fa0b3fecc236d6384dc58d6f8a6a4003301e2e4b42923d6a5cdd219eefd09e9336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfoverlay.sty \
texlive-pdfoverlay"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
