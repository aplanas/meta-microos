SUMMARY = "Shared library for NetworkManager-applet"
DESCRIPTION = "Shared library for NetworkManager-applet."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma0-1.10.6-1.4.aarch64.rpm"
RPM_HASH = "847eb929ac4ca42b7352dd460c2d59644837f98bb2e9c7aa448a8fa07fb0fd0d962bee40cb8f640143a40b8e36137a44c25995d3d07dec291a35d7e0c2718e56"

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
