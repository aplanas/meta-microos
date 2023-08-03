SUMMARY = "Hyprland application dock"
DESCRIPTION = "Configurable (w/ command line arguments and css) dock, written in Go, aimed \
exclusively at the Hyprland Wayland compositor. It features pinned buttons, \
client buttons and the launcher button."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "nwg-dock-hyprland-0.1.3-1.1.aarch64.rpm"
RPM_HASH = "27805cf6ecdf67ee0b861af167e879ccf49748c750163be3ae9955a67614d51c51c115d6b69ee044d63ce893c7f77a49552c380170e6bb75b0d04e321f0299c7"

RPROVIDES:${PN} += "nwg-dock-hyprland"

RDEPENDS:${PN} += "libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libfontconfig.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
