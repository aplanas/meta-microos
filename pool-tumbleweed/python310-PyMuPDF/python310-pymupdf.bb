SUMMARY = "Python binding for MuPDF, a PDF and XPS viewer"
DESCRIPTION = "This is PyMuPDF, a Python binding for MuPDF, a PDF and XPS viewer. \
MuPDF can access files in PDF, XPS, OpenXPS, epub, comic and fiction \
book formats. PyMuPDF can also access files with extensions *.pdf, \
*.xps, *.oxps, *.epub, *.cbz or *.fb2 from Python scripts."
LICENSE = "AGPL-3.0-only"

PV = "1.21.1"

RPM_NAME = "python310-PyMuPDF-1.21.1-2.4.aarch64.rpm"
RPM_HASH = "10c10e962d266074978d3c535e72ca9be2bec4df6ac7a6d49c4076068f78b9e558420cd13d1eeaac6d3bb2d289792f6773acbb0b5032ccd7c19ca67154c70e9b"

RPROVIDES:${PN} += "bundled(mupdf) \
python3-PyMuPDF \
python3.10dist(pymupdf) \
python310-PyMuPDF \
python310-PyMuPDF(aarch-64) \
python3dist(pymupdf)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
