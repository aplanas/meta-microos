SUMMARY = "GTK-based lockscreen for Wayland"
DESCRIPTION = "gtklock is a lockscreen based on gtkgreet. It uses the wlr-layer-shell and wlr-input-inhibitor Wayland protocols. Works on sway and other wlroots-based compositors."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "gtklock-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "bdf6a6885123f99c0a574ce046440435a1074d98c72c37f3262e0e239d530d32fccd3aa09dbaf09629168b40d7d6a3c6d4edac9c6bf21d56a2fdea743d254fb5"

RPROVIDES:${PN} += "gtklock \
gtklock(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtk-layer-shell.so.0()(64bit) \
libpam.so.0()(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
