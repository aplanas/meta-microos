SUMMARY = "Belgium electronic identity card viewer"
DESCRIPTION = "The eid-viewer application allows the user to read out any information from \
a Belgian electronic identity card. Both identity information and information \
about the stored cryptographic keys can be read in a user-friendly manner, \
and can easily be printed out or stored for later reviewal. \
 \
The application verifies the signature of the identity information, \
checks whether it was signed by a government-issued key, and optionally \
checks the certificate against the government's Trust Service."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.4"

RPM_NAME = "eid-viewer-5.1.4-1.4.aarch64.rpm"
RPM_HASH = "d44196cb1d796b795258f0df32f4bf0cee4afe834afad3f705b47e9f849d46ef499ad0dd2c06b01b196765c161f83b87422445d3b409abc08e8503254aaf3cf0"

RPROVIDES:${PN} += "eid-viewer"

RDEPENDS:${PN} += "eid-mw \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libeidviewer.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libproxy.so.1 \
libxml2.so.2 \
pcsc-ccid \
pcsc-lite"

inherit rpm
