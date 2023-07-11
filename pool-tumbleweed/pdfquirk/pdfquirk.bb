SUMMARY = "App to create PDFs from images or scans"
DESCRIPTION = "PDF Quirk helps to generate PDF files from images from storage \
or directly from the scanner."
LICENSE = "GPL-3.0-only"

PV = "0.95"

RPM_NAME = "pdfquirk-0.95-1.7.aarch64.rpm"
RPM_HASH = "85c58a8c4f373bafd8917e3cdcce52093213c11f5d2e1d8fd9ba1b3942707065514df3c4b8a004e732e202ed2f081a35050775b64d0bf37dd7665fa3bfb6d277"

RPROVIDES:${PN} += "pdfquirk"

RDEPENDS:${PN} += "ImageMagick \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
