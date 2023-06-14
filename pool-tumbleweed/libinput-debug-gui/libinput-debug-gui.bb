SUMMARY = "Graphical libinput debug tool"
DESCRIPTION = "This tool allows graphical libinput debugging. It visualizes \
all events processed by libinput."
LICENSE = "MIT"

PV = "1.23.0"

RPM_NAME = "libinput-debug-gui-1.23.0-1.1.aarch64.rpm"
RPM_HASH = "ef7749ab4328f5d5f386637cbd0625a1142b457b17b75b6cb45a470e036bd52790f1d07ec0234c089248369b07a5564c2241a0d8d72da401547dd25832737a1c"

RPROVIDES:${PN} += "libinput-debug-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libevdev.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libinput-tools \
libinput.so.10 \
libudev.so.1 \
libwayland-client.so.0"

inherit rpm
