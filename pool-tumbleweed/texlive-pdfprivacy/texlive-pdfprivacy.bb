SUMMARY = "A LaTeX package to remove or suppress pdf meta-data"
DESCRIPTION = "Creating pdfs with pdfLaTeX populates several pdf meta-data \
fields such as date/time of creation/modification, information \
about the LaTeX installation (e.g., pdfTeX version), and the \
relative paths of included pdfs. The pdfprivacy package \
provides support for emptying several of these pdf meta-data \
fields as well as suppressing some pdfTeX meta-data entries in \
the resulting pdf."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn45985"

RPM_NAME = "texlive-pdfprivacy-2023.201.1.0svn45985-51.1.noarch.rpm"
RPM_HASH = "f72aa7f1c6c62c592455e1c791f15bb86a2c005aec6bc32c99c9c156fec6a483747a8eec169ea6274441d6ca2cd8f9e1544bbd47a98f338524c6281c89e8b4b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfprivacy.sty) \
texlive-pdfprivacy"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(kvoptions.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
