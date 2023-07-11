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
LICENSE = "GPL-2.0-only"

PV = "0.5"

RPM_NAME = "odt2txt-0.5-2.1.aarch64.rpm"
RPM_HASH = "8d6810a56cc59cf2ef3fa17c0196503c8c457c9129bcd1dffbd71dad3fcbbc9e09de8b97a5ad3e998218c7073939c6e769fdc51b7426514be16a5a3f42a49c41"

RPROVIDES:${PN} += "odt2txt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
