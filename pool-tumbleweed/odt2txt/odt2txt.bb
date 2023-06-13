SUMMARY = "Converter from OpenDocument Text to plain text"
DESCRIPTION = "odt2txt is a command-line tool which extracts the text out \
of OpenDocument Texts produced by OpenOffice.org, StarOffice, \
KOffice and others. \
 \
odt2txt can also extract text from some file formats similar \
to OpenDocument Text, such as OpenOffice.org XML (*.sxw), \
which was used by OpenOffice.org version 1.x and older StarOffice \
versions. To a lesser extend, odt2txt may be useful to extract \
content from OpenDocument spreadsheets (*.ods) and OpenDocument \
presentations (*.odp)."
LICENSE = "GPL-2.0"

PV = "0.5"

RPM_NAME = "odt2txt-0.5-1.27.aarch64.rpm"
RPM_HASH = "683a78bdae6b25d181b5447baa4db52a2d0ec62644324cab936791eddfffa327f2232f73450e3dc947237cf16375db90df0b4ddcbfba1c1d24efb2ea8e17f291"

RPROVIDES:${PN} += "odt2txt \
odt2txt(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit)"

inherit rpm
