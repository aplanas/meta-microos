SUMMARY = "Shared library for NetworkManager-applet"
DESCRIPTION = "Shared library for NetworkManager-applet."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma0-1.10.6-1.3.aarch64.rpm"
RPM_HASH = "ce5b296893de642210e492f2f5275e5418bdb8e9a0447489e11d4459c48dbd5ecd72490224bdeca515bca060524b473210f30ff0c960ec569e713201d2a5b267"

RPROVIDES:${PN} += "libnma \
libnma-data \
libnma.so.0 \
libnma0 \
nma-data"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgck-2.so.2 \
libgcr-4.so.4 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libnm.so.0 \
libnma-glib-schema \
mobile-broadband-provider-info"

inherit rpm
