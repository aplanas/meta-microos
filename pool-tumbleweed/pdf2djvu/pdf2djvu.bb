SUMMARY = "PDF to DjVu Converter"
DESCRIPTION = "pdf2djvu creates DjVu files from PDF files. It's able to extract: \
graphics, text layer, hyperlinks, document outline (bookmarks) and \
metadata (including XMP metadata)."
LICENSE = "GPL-2.0-only"

PV = "0.9.19"

RPM_NAME = "pdf2djvu-0.9.19-3.9.aarch64.rpm"
RPM_HASH = "365cc9e3d229fa94557a1a6906b5c775a719a3854e6909ed350654272dfc1df526b29c5a1e2b898d62b35a994684c39f6d63e82fed86a913c7cc4829ebbec2d5"

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
libpoppler.so.129 \
libstdc++.so.6 \
libuuid.so.1"

inherit rpm
