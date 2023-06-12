SUMMARY = "Modular statusbar for X11 and Wayland"
DESCRIPTION = "Simplistic and highly configurable status panel for X and Wayland."
LICENSE = "MIT"

PV = "1.9.0+g34"

RPM_NAME = "yambar-1.9.0+g34-1.3.aarch64.rpm"
RPM_HASH = "178f6e80d51deaedd8f63798f112f63c7c5aaca32e01aa9097a66532b624b98f35f062f16ea8c50de89239fff867c9919f18321dc49da25ee2bbad9d41151c13"

RPROVIDES:${PN} += "application() \
application(yambar.desktop) \
yambar \
yambar(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfcft.so.4()(64bit) \
libjson-c.so.5()(64bit) \
libjson-c.so.5(JSONC_0.14)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmpdclient.so.2()(64bit) \
libmpdclient.so.2(libmpdclient2)(64bit) \
libpipewire-0.3.so.0()(64bit) \
libpixman-1.so.0()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit) \
libxcb-cursor.so.0()(64bit) \
libxcb-errors.so.0()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb-render.so.0()(64bit) \
libxcb-util.so.1()(64bit) \
libxcb-xkb.so.1()(64bit) \
libxcb.so.1()(64bit) \
libyaml-0.so.2()(64bit)"

inherit rpm
