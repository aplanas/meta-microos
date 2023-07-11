SUMMARY = "On-the-fly conversion of EPS to PDF"
DESCRIPTION = "The package calls the epstopdf package to convert EPS graphics \
to PDF, on the fly. It servs as a vehicle for passing \
conversion options (such as grayscale, prepress or pdfversion) \
to the epspdf converter."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.61svn18703"

RPM_NAME = "texlive-epspdfconversion-2023.201.0.0.61svn18703-53.2.noarch.rpm"
RPM_HASH = "1db20a87988fb95f23c58ffa9f853e3c8b04333b1410fa268564a215e3e51cd17230282d6c76e7918bd013f65979f9f66ad68c6ec6a8ab2e8c7d11b8914eeb4d"
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
