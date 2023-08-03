SUMMARY = "On-the-fly conversion of EPS to PDF"
DESCRIPTION = "The package calls the epstopdf package to convert EPS graphics \
to PDF, on the fly. It servs as a vehicle for passing \
conversion options (such as grayscale, prepress or pdfversion) \
to the epspdf converter."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.61svn18703"

RPM_NAME = "texlive-epspdfconversion-2023.209.0.0.61svn18703-54.1.noarch.rpm"
RPM_HASH = "795d05945f241b989b54cca4fcbd73122522b4fac8fb2c52987f8e4ea24f0e62994f15567ce11dac96f9f8f59a67934d9772d921fcd8364a352346a269b9a401"
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
