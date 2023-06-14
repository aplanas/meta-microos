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

RPM_NAME = "ghostscript-9.56.1-3.1.aarch64.rpm"
RPM_HASH = "bdd657806557015682114989fa12a0c8d295be23b383a25b95c36fce3a6d8351db942304a7ea26ac63ce54b0205aae4a64c5eca8ec79b0b764913bf6db69d969"

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

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
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
