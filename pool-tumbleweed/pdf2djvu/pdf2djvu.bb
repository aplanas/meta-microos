SUMMARY = "PDF to DjVu Converter"
DESCRIPTION = "pdf2djvu creates DjVu files from PDF files. It's able to extract: \
graphics, text layer, hyperlinks, document outline (bookmarks) and \
metadata (including XMP metadata)."
LICENSE = "GPL-2.0-only"

PV = "0.9.19"

RPM_NAME = "pdf2djvu-0.9.19-3.6.aarch64.rpm"
RPM_HASH = "43586d6af150afe15adec964725235dda25a0b7a97d239aca5b0c0b6172e69d52ed45441cabb0a9259d717d84580588fd1d9ac196333f3e530df73cf113e7b1f"

RPROVIDES:${PN} += "pdf2djvu \
pdf2djvu(aarch-64)"

RDEPENDS:${PN} += "djvulibre \
ld-linux-aarch64.so.1()(64bit) \
libGraphicsMagick++-Q16.so.12()(64bit) \
libGraphicsMagick-Q16.so.3()(64bit) \
libc.so.6()(64bit) \
libdjvulibre.so.21()(64bit) \
libexiv2.so.27()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libm.so.6()(64bit) \
libpoppler.so.128()(64bit) \
libstdc++.so.6()(64bit) \
libuuid.so.1()(64bit)"

inherit rpm
