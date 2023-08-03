SUMMARY = "The Ghostscript interpreter for PostScript and PDF"
DESCRIPTION = "Ghostscript is a package of software that provides: \
 \
An interpreter for the PostScript language, \
with the ability to convert PostScript language files \
to many raster formats, view them on displays, \
and print them on printers that don't have \
PostScript language capability built in. \
 \
An interpreter for Portable Document Format (PDF) files, \
with the same abilities. \
 \
The ability to convert PostScript language files \
to PDF (with some limitations) and vice versa. \
 \
A set of C procedures (the Ghostscript library) \
that implement the graphics and filtering \
(data compression / decompression / conversion) \
capabilities that appear as primitive operations \
in the PostScript language and in PDF. \
 \
For information how to use Ghostscript see \
/usr/share/ghostscript/9.56.1/doc/Use.htm"
LICENSE = "AGPL-3.0-only"

PV = "9.56.1"

RPM_NAME = "ghostscript-9.56.1-5.1.aarch64.rpm"
RPM_HASH = "34845feff6669ac8b7277fe140b4809b3d27df5edde259cdbe2265d7a2553ab2e0cdfd9d7330cc548f4d876be6273c8d42f65eff38e177528d130fca53ae595a"

RPROVIDES:${PN} += "9.56.1 \
config-ghostscript \
ghostscript \
ghostscript-any \
ghostscript-library \
gs \
gs-lib \
libgs.so.9 \
libijs-0.35.so \
pstoraster"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libfreetype.so.6 \
libjpeg.so.8 \
libm.so.6 \
libopenjp2.so.7 \
libpng16.so.16 \
libtiff.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
