SUMMARY = "Python binding for MuPDF, a PDF and XPS viewer"
DESCRIPTION = "This is PyMuPDF, a Python binding for MuPDF, a PDF and XPS viewer. \
MuPDF can access files in PDF, XPS, OpenXPS, epub, comic and fiction \
book formats. PyMuPDF can also access files with extensions *.pdf, \
*.xps, *.oxps, *.epub, *.cbz or *.fb2 from Python scripts."
LICENSE = "AGPL-3.0-only"

PV = "1.21.1"

RPM_NAME = "python39-PyMuPDF-1.21.1-2.5.aarch64.rpm"
RPM_HASH = "af4211d7ce98453398083a97c96e80cc3f3265d21de1de62fcd8c7fda1bb4b967798141971892f2397a5b795c3a28f72c1a6b36728ab1d5ea60961a1076240df"

RPROVIDES:${PN} += "bundled-mupdf \
python3.9dist-pymupdf \
python39-PyMuPDF \
python3dist-pymupdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
