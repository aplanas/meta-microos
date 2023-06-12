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

RPROVIDES:${PN} += "application() \
application(fedict-eid-viewer.desktop) \
eid-viewer \
eid-viewer(aarch-64) \
metainfo() \
metainfo(eid-viewer.appdata.xml)"
RDEPENDS:${PN} += "eid-mw \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libeidviewer.so.0()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libproxy.so.1()(64bit) \
libproxy.so.1(LIBPROXY_0.4.16)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
pcsc-ccid \
pcsc-lite"

inherit rpm
