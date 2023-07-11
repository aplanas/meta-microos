SUMMARY = "Customizable Wayland bar for Sway and Wlroots based compositors"
DESCRIPTION = "A customizable Wayland bar for Sway and Wlroots based compositors. \
It comes with modules for pipewire, alsa, backlight, and bluetooth. \
Other modules can be found in the manpages of Waybar."
LICENSE = "MIT"

PV = "0.9.19"

RPM_NAME = "waybar-0.9.19-1.1.aarch64.rpm"
RPM_HASH = "e085f6fb9a09f23b872e8292b82810e702fc0fc7b1957c656636991c4b7d7aa9a4fa3d7f50969d8da33b865b3603eed1fb23cb7ed5b9a2872c418d2833100468"

RPROVIDES:${PN} += "waybar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libdate-tz.so.3 \
libdbusmenu-gtk3.so.4 \
libevdev.so.2 \
libfmt.so.9 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgio-2.0.so.0 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libgtkmm-3.0.so.1 \
libinput.so.10 \
libjack.so.0 \
libjsoncpp.so.25 \
libm.so.6 \
libmpdclient.so.2 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libplayerctl.so.2 \
libpulse.so.0 \
libsigc-2.0.so.0 \
libsndio.so.7.1 \
libspdlog.so.1.11 \
libstdc++.so.6 \
libudev.so.1 \
libupower-glib.so.3 \
libwayland-client.so.0 \
libwireplumber-0.4.so.0 \
libxkbregistry.so.0 \
waybar-branding"

inherit rpm
