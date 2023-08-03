SUMMARY = "A LaTeX package to remove or suppress pdf meta-data"
DESCRIPTION = "Creating pdfs with pdfLaTeX populates several pdf meta-data \
fields such as date/time of creation/modification, information \
about the LaTeX installation (e.g., pdfTeX version), and the \
relative paths of included pdfs. The pdfprivacy package \
provides support for emptying several of these pdf meta-data \
fields as well as suppressing some pdfTeX meta-data entries in \
the resulting pdf."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn45985"

RPM_NAME = "texlive-pdfprivacy-2023.209.1.0svn45985-52.1.noarch.rpm"
RPM_HASH = "78f168d84324012bb2ebe03e716cce112666544973379b83689afe745e5b36ef36637f9a1fa5c69f0d4a5a18b5ffca23f83855aed56dc0842f39554524cfa879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfprivacy.sty \
texlive-pdfprivacy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
