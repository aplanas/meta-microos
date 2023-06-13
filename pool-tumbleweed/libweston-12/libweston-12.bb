SUMMARY = "Weston rendering backend collection"
DESCRIPTION = "This subpackage contains backend renderer plugins, used by \
libweston-12-0."
LICENSE = "CC-BY-SA-3.0 & MIT"

PV = "12.0.1"

RPM_NAME = "libweston-12-12.0.1-1.1.aarch64.rpm"
RPM_HASH = "384f9b6021d69c41fed72372d109d628ff61495ee906c741613377c7423603713e06dc4f9027bb287c5737cc0ea1dd4a83aefee326fd14a81e9403688cb9b616"

RPROVIDES:${PN} += "libweston-12 \
libweston-12(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libX11-xcb.so.1()(64bit) \
libX11.so.6()(64bit) \
libXcursor.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libdrm.so.2()(64bit) \
libfreerdp-server2.so.2()(64bit) \
libfreerdp2.so.2()(64bit) \
libgbm.so.1()(64bit) \
libinput.so.10()(64bit) \
libinput.so.10(LIBINPUT_0.12.0)(64bit) \
libinput.so.10(LIBINPUT_0.21.0)(64bit) \
libinput.so.10(LIBINPUT_1.2)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpipewire-0.3.so.0()(64bit) \
libpixman-1.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libseat.so.1()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libva-drm.so.2()(64bit) \
libva.so.2()(64bit) \
libva.so.2(VA_API_0.33.0)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit) \
libwayland-egl.so.1()(64bit) \
libwayland-server.so.0()(64bit) \
libwebp.so.7()(64bit) \
libweston-12.so.0()(64bit) \
libwinpr2.so.2()(64bit) \
libxcb-composite.so.0()(64bit) \
libxcb-render.so.0()(64bit) \
libxcb-shm.so.0()(64bit) \
libxcb-xfixes.so.0()(64bit) \
libxcb-xkb.so.1()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
