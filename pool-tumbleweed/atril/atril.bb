SUMMARY = "MATE Desktop document viewer"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "atril-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "1f9cf948023da2192c3d575a9ac09172fe5864289361a37ff6a62d9fa980f82a02aee6a19752386c8d77326c3e9e1133575504d6eb6d8a09062e140e7018a8da"

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
