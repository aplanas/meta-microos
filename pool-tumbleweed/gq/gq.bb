SUMMARY = "An LDAP Client for GTK"
DESCRIPTION = "An LDAP client for GTK."
LICENSE = "GPL-2.0+"

PV = "1.2.3"

RPM_NAME = "gq-1.2.3-92.20.aarch64.rpm"
RPM_HASH = "2243f1f8f981f41641f6ad72bedb798bdf84d18f88e0a69209f9e0f7490eae3c4460207cd0edef0a5c0e6db9030cb34317ce1643c05ab1e1f362e85f6a66ea43"

RPROVIDES:${PN} += "gq"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglade-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-keyring.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
liblber.so.2 \
libldap.so.2 \
libpango-1.0.so.0 \
libxml2.so.2"

inherit rpm
