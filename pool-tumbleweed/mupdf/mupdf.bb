SUMMARY = "PDF and XPS Viewer and Parser and Rendering Library"
DESCRIPTION = "MuPDF is a PDF and XPS viewer and parser/rendering library. \
 \
The renderer in MuPDF is tailored for anti-aliased graphics. It \
renders text with metrics and spacing accurate to within fractions of \
a pixel for reproducing the look of a printed page on screen. \
 \
MuPDF supports PDF 1.7 with transparency, encryption, hyperlinks, \
annotations and search. MuPDF can also read XPS documents \
(OpenXPS/ECMA-388)."
LICENSE = "AGPL-3.0-or-later"

PV = "1.22.1"

RPM_NAME = "mupdf-1.22.1-1.1.aarch64.rpm"
RPM_HASH = "0ae35715f46eb0a983463f8b4b6365c071356eeb1195753f18fd678429444510d6de2718a014807b074f6755a15cc6c41a0f1a1c36d8bbbc0fe8d2cfb9ef1cda"

RPROVIDES:${PN} += "bundled-freeglut \
bundled-freeglut-art \
bundled-gumbo-parser \
bundled-lcms2 \
bundled-lcms2-art \
bundled-mujs \
mupdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXext.so.6 \
libXrandr.so.2 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libfreetype.so.6 \
libharfbuzz.so.0 \
libjbig2dec.so.0 \
libjpeg.so.8 \
libm.so.6 \
libopenjp2.so.7 \
libz.so.1 \
xdg-utils"

inherit rpm
