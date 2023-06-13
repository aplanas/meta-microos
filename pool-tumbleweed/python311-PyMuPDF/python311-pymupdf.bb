SUMMARY = "Python binding for MuPDF, a PDF and XPS viewer"
DESCRIPTION = "This is PyMuPDF, a Python binding for MuPDF, a PDF and XPS viewer. \
MuPDF can access files in PDF, XPS, OpenXPS, epub, comic and fiction \
book formats. PyMuPDF can also access files with extensions *.pdf, \
*.xps, *.oxps, *.epub, *.cbz or *.fb2 from Python scripts."
LICENSE = "AGPL-3.0-only"

PV = "1.21.1"

RPM_NAME = "python311-PyMuPDF-1.21.1-2.4.aarch64.rpm"
RPM_HASH = "1a9f8f2160f38c4215514cc4633a90665162ded6f585877a5b844cb8b55ff65942a783c01d458d2e8702f85d871ecde8d4cedfc1382ca8e347ffc91deb015d26"

RPROVIDES:${PN} += "bundled(mupdf) \
python3.11dist(pymupdf) \
python311-PyMuPDF \
python311-PyMuPDF(aarch-64) \
python3dist(pymupdf)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
