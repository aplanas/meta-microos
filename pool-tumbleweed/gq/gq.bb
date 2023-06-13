SUMMARY = "An LDAP Client for GTK"
DESCRIPTION = "An LDAP client for GTK."
LICENSE = "GPL-2.0+"

PV = "1.2.3"

RPM_NAME = "gq-1.2.3-92.20.aarch64.rpm"
RPM_HASH = "2243f1f8f981f41641f6ad72bedb798bdf84d18f88e0a69209f9e0f7490eae3c4460207cd0edef0a5c0e6db9030cb34317ce1643c05ab1e1f362e85f6a66ea43"

RPROVIDES:${PN} += "application() \
application(gq.desktop) \
gq \
gq(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcrypt.so.20()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglade-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnome-keyring.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
libpango-1.0.so.0()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
