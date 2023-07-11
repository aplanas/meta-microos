SUMMARY = "LightDM GObject-based Client Library"
DESCRIPTION = "A GObject-based library for LightDM clients to use to interface \
with LightDM."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "liblightdm-gobject-1-0-1.32.0-2.3.aarch64.rpm"
RPM_HASH = "8abe22fd7c087608a64377129c1022f5b0658c01ae9f914f5fa2e5f76abd1f365b3a9ca5370749f0524517e0169d5e5a8d4044603d79d0264e334a159be13602"

RPROVIDES:${PN} += "liblightdm-gobject-1-0 \
liblightdm-gobject-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxklavier.so.16"

inherit rpm
