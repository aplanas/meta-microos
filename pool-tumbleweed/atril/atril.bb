SUMMARY = "MATE Desktop document viewer"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "atril-1.26.1-1.2.aarch64.rpm"
RPM_HASH = "c9cee3acfa1c121faf2dc311f0f829c9b7f7f8035f56b9f46882362494be10163fbeb3773cbc4625748c83c05b87a196272491a165c2f30ccfe23a5bd36c42df"

RPROVIDES:${PN} += "atril \
mate-document-viewer"

RDEPENDS:${PN} += "atril-backends \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libatk-1.0.so.0 \
libatrildocument.so.3 \
libatrilview.so.3 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libsecret-1.so.0 \
libxml2.so.2 \
mate-desktop-gsettings-schemas"

inherit rpm
