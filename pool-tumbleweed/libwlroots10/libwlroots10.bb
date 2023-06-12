SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "libwlroots10-0.15.1-2.1.aarch64.rpm"
RPM_HASH = "9ddbfd9a0006a2ba4a96bd6b4b0df7a4a880d1726bbefea50f759956d0b75b98fe844b99d979206adafddbff9f897be0ee5d46625ac93586161d70ea72253be7"

RPROVIDES:${PN} += "libwlroots.so.10()(64bit) \
libwlroots10 \
libwlroots10(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libGLESv2.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdrm.so.2()(64bit) \
libgbm.so.1()(64bit) \
libinput.so.10()(64bit) \
libinput.so.10(LIBINPUT_0.12.0)(64bit) \
libinput.so.10(LIBINPUT_0.20.0)(64bit) \
libinput.so.10(LIBINPUT_0.21.0)(64bit) \
libinput.so.10(LIBINPUT_1.2)(64bit) \
libinput.so.10(LIBINPUT_1.3)(64bit) \
libinput.so.10(LIBINPUT_1.4)(64bit) \
libinput.so.10(LIBINPUT_1.7)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpixman-1.so.0()(64bit) \
libseat.so.1()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libvulkan.so.1()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-server.so.0()(64bit) \
libxcb-composite.so.0()(64bit) \
libxcb-dri3.so.0()(64bit) \
libxcb-errors.so.0()(64bit) \
libxcb-icccm.so.4()(64bit) \
libxcb-present.so.0()(64bit) \
libxcb-render-util.so.0()(64bit) \
libxcb-render.so.0()(64bit) \
libxcb-res.so.0()(64bit) \
libxcb-shm.so.0()(64bit) \
libxcb-xfixes.so.0()(64bit) \
libxcb-xinput.so.0()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
