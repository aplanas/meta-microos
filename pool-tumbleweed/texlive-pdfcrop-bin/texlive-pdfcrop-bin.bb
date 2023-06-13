SUMMARY = "Binary files of pdfcrop"
DESCRIPTION = "Binary files of pdfcrop"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn14387"

RPM_NAME = "texlive-pdfcrop-bin-2023.20230311.svn14387-91.1.aarch64.rpm"
RPM_HASH = "76253a3ced35c564c8b3758e14b67376bc06b8add9b60ae1946c3ee82573925864ef49504d11d6e64cb37be77a3314a0e08319d60cb67979cff71d1ad813d6b1"

RPROVIDES:${PN} += "texlive-pdfcrop-bin \
texlive-pdfcrop-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-pdfcrop"

inherit rpm
