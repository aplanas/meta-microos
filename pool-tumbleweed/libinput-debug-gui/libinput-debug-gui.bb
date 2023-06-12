SUMMARY = "Graphical libinput debug tool"
DESCRIPTION = "This tool allows graphical libinput debugging. It visualizes \
all events processed by libinput."
LICENSE = "MIT"

PV = "1.23.0"

RPM_NAME = "libinput-debug-gui-1.23.0-1.1.aarch64.rpm"
RPM_HASH = "ef7749ab4328f5d5f386637cbd0625a1142b457b17b75b6cb45a470e036bd52790f1d07ec0234c089248369b07a5564c2241a0d8d72da401547dd25832737a1c"

RPROVIDES:${PN} += "libinput-debug-gui \
libinput-debug-gui(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libevdev.so.2()(64bit) \
libevdev.so.2(LIBEVDEV_1)(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libinput-tools \
libinput.so.10()(64bit) \
libinput.so.10(LIBINPUT_0.12.0)(64bit) \
libinput.so.10(LIBINPUT_0.14.0)(64bit) \
libinput.so.10(LIBINPUT_0.19.0)(64bit) \
libinput.so.10(LIBINPUT_0.20.0)(64bit) \
libinput.so.10(LIBINPUT_0.21.0)(64bit) \
libinput.so.10(LIBINPUT_1.1)(64bit) \
libinput.so.10(LIBINPUT_1.14)(64bit) \
libinput.so.10(LIBINPUT_1.15)(64bit) \
libinput.so.10(LIBINPUT_1.19)(64bit) \
libinput.so.10(LIBINPUT_1.2)(64bit) \
libinput.so.10(LIBINPUT_1.21)(64bit) \
libinput.so.10(LIBINPUT_1.23)(64bit) \
libinput.so.10(LIBINPUT_1.3)(64bit) \
libinput.so.10(LIBINPUT_1.5)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libwayland-client.so.0()(64bit)"

inherit rpm
