SUMMARY = "Python binding for MuPDF, a PDF and XPS viewer"
DESCRIPTION = "This is PyMuPDF, a Python binding for MuPDF, a PDF and XPS viewer. \
MuPDF can access files in PDF, XPS, OpenXPS, epub, comic and fiction \
book formats. PyMuPDF can also access files with extensions *.pdf, \
*.xps, *.oxps, *.epub, *.cbz or *.fb2 from Python scripts."
LICENSE = "AGPL-3.0-only"

PV = "1.21.1"

RPM_NAME = "python310-PyMuPDF-1.21.1-2.5.aarch64.rpm"
RPM_HASH = "9cf7da6f87353291c466899a9000c3483b2c95b63bffde288d540080de764e298e0ac2a2379ef8dcb00684eb4f2d3a3825dc41054459d2bb55a27748a70d7f41"

RPROVIDES:${PN} += "bundled-mupdf \
python3.10dist-pymupdf \
python310-PyMuPDF \
python3dist-pymupdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
