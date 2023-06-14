SUMMARY = "GNOME mouse settings tweaker"
DESCRIPTION = "The Mousetweaks package provides mouse accessibility enhancements for \
the GNOME desktop."
LICENSE = "GPL-3.0-only"

PV = "3.32.0"

RPM_NAME = "mousetweaks-3.32.0-3.8.aarch64.rpm"
RPM_HASH = "a5c0c8ed930915ed780b68b779c2a2fb231240c65d514b8e27e0d0fc8ca371fb983cf9e95e3b088f94a5aef764b656626e1f8fd91fb798e48f045bd60428f6ab"

RPROVIDES:${PN} += "mousetweaks"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXcursor.so.1 \
libXfixes.so.3 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
