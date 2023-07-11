SUMMARY = "Graphical libinput debug tool"
DESCRIPTION = "This tool allows graphical libinput debugging. It visualizes \
all events processed by libinput."
LICENSE = "MIT"

PV = "1.23.0"

RPM_NAME = "libinput-debug-gui-1.23.0-1.2.aarch64.rpm"
RPM_HASH = "81f1559ea2dd8dd0bb625628b178157cbc2736795f6e123d5c405a89518322b973c4dbc2bedd1c6340a94fbb33d3007ec8841ae226bedf47c6875d7480cde17a"

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
