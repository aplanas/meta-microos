SUMMARY = "GNOME interface for gnupg"
DESCRIPTION = "Seahorse is a GNOME interface for gnupg. It uses gpgme as the backend."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "seahorse-43.0-3.4.aarch64.rpm"
RPM_HASH = "8aee4d058001a2eed091f3115e877cf45357d88db1cac28ec91a46194c54a6b10e860e0d1af93e10db284dacffb7c80f97d1d4b857754fa7232985a64a2cceb7"

RPROVIDES:${PN} += "application() \
application(org.gnome.seahorse.Application.desktop) \
metainfo() \
metainfo(org.gnome.seahorse.Application.appdata.xml) \
mimehandler(application/pgp-keys) \
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
mimehandler(application/x-ssh-key) \
mimehandler(application/x-x509-ca-cert) \
mimehandler(application/x-x509-user-cert) \
seahorse \
seahorse(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libavahi-glib.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgck-1.so.0()(64bit) \
libgcr-base-3.so.1()(64bit) \
libgcr-ui-3.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpgme.so.11()(64bit) \
libgpgme.so.11(GPGME_1.0)(64bit) \
libgpgme.so.11(GPGME_1.1)(64bit) \
libgtk-3.so.0()(64bit) \
libhandy-1.so.0()(64bit) \
libhandy-1.so.0(LIBHANDY_1_0)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libpwquality.so.1()(64bit) \
libpwquality.so.1(LIBPWQUALITY_1.0)(64bit) \
libsecret-1.so.0()(64bit) \
libsoup-3.0.so.0()(64bit)"

inherit rpm
