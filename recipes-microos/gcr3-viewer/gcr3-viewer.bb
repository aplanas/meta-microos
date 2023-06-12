SUMMARY = "Viewer for Crypto Files"
DESCRIPTION = "This packages provides the viewer for crypto files on the GNOME desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "gcr3-viewer-3.41.0-3.3.aarch64.rpm"
RPM_HASH = "d079a674a1faec9e6c082e301a49aaab7fd4b8ced6c1968eb2339f01657841c8babbfbb8520b63ecf2434a138ca0c8aaa6c06ec35e23479683bc442d93c7a891"

RPROVIDES:${PN} += "application() \
application(gcr-viewer.desktop) \
gcr-viewer \
gcr3-viewer \
gcr3-viewer(aarch-64) \
mimehandler(application/pkcs10) \
mimehandler(application/pkcs10+pem) \
mimehandler(application/pkcs12) \
mimehandler(application/pkcs12+pem) \
mimehandler(application/pkcs7-mime) \
mimehandler(application/pkcs7-mime+pem) \
mimehandler(application/pkcs8) \
mimehandler(application/pkcs8+pem) \
mimehandler(application/pkix-cert) \
mimehandler(application/pkix-cert+pem) \
mimehandler(application/pkix-crl) \
mimehandler(application/pkix-crl+pem) \
mimehandler(application/x-pem-file) \
mimehandler(application/x-pem-key) \
mimehandler(application/x-pkcs12) \
mimehandler(application/x-pkcs7-certificates) \
mimehandler(application/x-spkac) \
mimehandler(application/x-spkac+base64) \
mimehandler(application/x-x509-ca-cert) \
mimehandler(application/x-x509-user-cert)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcr-ui-3.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit)"

inherit rpm
