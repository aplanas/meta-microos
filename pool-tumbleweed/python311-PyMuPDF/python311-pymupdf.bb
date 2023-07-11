SUMMARY = "Python binding for MuPDF, a PDF and XPS viewer"
DESCRIPTION = "This is PyMuPDF, a Python binding for MuPDF, a PDF and XPS viewer. \
MuPDF can access files in PDF, XPS, OpenXPS, epub, comic and fiction \
book formats. PyMuPDF can also access files with extensions *.pdf, \
*.xps, *.oxps, *.epub, *.cbz or *.fb2 from Python scripts."
LICENSE = "AGPL-3.0-only"

PV = "1.21.1"

RPM_NAME = "python311-PyMuPDF-1.21.1-2.5.aarch64.rpm"
RPM_HASH = "119733c18034b6f0275025b7d97e53a7c605ca16678881f1fec63ca48bdafa8d9afea78ef648f0e68b9b32280750a4224ee90ef9517f28c5538446e5798c7b26"

RPROVIDES:${PN} += "bundled-mupdf \
python3-PyMuPDF \
python3.11dist-pymupdf \
python311-PyMuPDF \
python3dist-pymupdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
