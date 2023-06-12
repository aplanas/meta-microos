SUMMARY = "GNOME mouse settings tweaker"
DESCRIPTION = "The Mousetweaks package provides mouse accessibility enhancements for \
the GNOME desktop."
LICENSE = "GPL-3.0-only"

PV = "3.32.0"

RPM_NAME = "mousetweaks-3.32.0-3.8.aarch64.rpm"
RPM_HASH = "a5c0c8ed930915ed780b68b779c2a2fb231240c65d514b8e27e0d0fc8ca371fb983cf9e95e3b088f94a5aef764b656626e1f8fd91fb798e48f045bd60428f6ab"

RPROVIDES:${PN} += "mousetweaks \
mousetweaks(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libXfixes.so.3()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit)"

inherit rpm
