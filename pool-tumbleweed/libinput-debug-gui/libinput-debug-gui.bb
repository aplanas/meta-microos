SUMMARY = "Graphical libinput debug tool"
DESCRIPTION = "This tool allows graphical libinput debugging. It visualizes \
all events processed by libinput."
LICENSE = "MIT"

PV = "1.24.0"

RPM_NAME = "libinput-debug-gui-1.24.0-1.1.aarch64.rpm"
RPM_HASH = "b2f6052be7b9d46848c10643a4fe4e22bfd8982aef738646483d742f52e4ce878229246fc472585bd28efb839c36de56f22966d84edba3210c7d10d18b6a1ee6"

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
