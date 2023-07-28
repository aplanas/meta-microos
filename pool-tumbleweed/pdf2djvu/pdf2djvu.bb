SUMMARY = "PDF to DjVu Converter"
DESCRIPTION = "pdf2djvu creates DjVu files from PDF files. It's able to extract: \
graphics, text layer, hyperlinks, document outline (bookmarks) and \
metadata (including XMP metadata)."
LICENSE = "GPL-2.0-only"

PV = "0.9.19"

RPM_NAME = "pdf2djvu-0.9.19-3.10.aarch64.rpm"
RPM_HASH = "264c3aa8389cc044a1a919e6fd62844fc28db8eb3e309842e812c1379f48ab7c28040313a9419a78e449ff4f1f9542fc4105f6ad33add9941d8f43d390155535"

RPROVIDES:${PN} += "pdf2djvu"

RDEPENDS:${PN} += "djvulibre \
ld-linux-aarch64.so.1 \
libGraphicsMagick++-Q16.so.12 \
libGraphicsMagick-Q16.so.3 \
libc.so.6 \
libdjvulibre.so.21 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libpoppler.so.130 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
