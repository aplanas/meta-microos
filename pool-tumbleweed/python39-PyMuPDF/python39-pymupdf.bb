SUMMARY = "Python binding for MuPDF, a PDF and XPS viewer"
DESCRIPTION = "This is PyMuPDF, a Python binding for MuPDF, a PDF and XPS viewer. \
MuPDF can access files in PDF, XPS, OpenXPS, epub, comic and fiction \
book formats. PyMuPDF can also access files with extensions *.pdf, \
*.xps, *.oxps, *.epub, *.cbz or *.fb2 from Python scripts."
LICENSE = "AGPL-3.0-only"

PV = "1.21.1"

RPM_NAME = "python39-PyMuPDF-1.21.1-2.4.aarch64.rpm"
RPM_HASH = "82888fe2ee8df89bd55768ce4d909467259e24e0e668c67b7f9850ca72c046bdf41bcd9b029ad2421f8cbe165d35a3665346041d7eeb3d4c2342e61e9fabed68"

RPROVIDES:${PN} += "bundled(mupdf) \
python3.9dist(pymupdf) \
python39-PyMuPDF \
python39-PyMuPDF(aarch-64) \
python3dist(pymupdf)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
