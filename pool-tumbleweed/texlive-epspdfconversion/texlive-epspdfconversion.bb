SUMMARY = "On-the-fly conversion of EPS to PDF"
DESCRIPTION = "The package calls the epstopdf package to convert EPS graphics \
to PDF, on the fly. It servs as a vehicle for passing \
conversion options (such as grayscale, prepress or pdfversion) \
to the epspdf converter."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.61svn18703"

RPM_NAME = "texlive-epspdfconversion-2023.209.0.0.61svn18703-54.2.noarch.rpm"
RPM_HASH = "0cfeba188629fffcd9a93f3bb1c340afc3616d0240deaf21d81094e3ef95271d8cca835c1a6d3c1c046f914c11412632d82c9b25e886c0ed844e05f031fa9f9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epspdfconversion.sty \
texlive-epspdfconversion"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-epstopdf-base.sty \
tex-graphics.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
