SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "libwlroots10-0.15.1-2.1.aarch64.rpm"
RPM_HASH = "9ddbfd9a0006a2ba4a96bd6b4b0df7a4a880d1726bbefea50f759956d0b75b98fe844b99d979206adafddbff9f897be0ee5d46625ac93586161d70ea72253be7"

RPROVIDES:${PN} += "libwlroots.so.10 \
libwlroots10"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libdrm.so.2 \
libgbm.so.1 \
libinput.so.10 \
libm.so.6 \
libpixman-1.so.0 \
libseat.so.1 \
libudev.so.1 \
libvulkan.so.1 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libxcb-composite.so.0 \
libxcb-dri3.so.0 \
libxcb-errors.so.0 \
libxcb-icccm.so.4 \
libxcb-present.so.0 \
libxcb-render-util.so.0 \
libxcb-render.so.0 \
libxcb-res.so.0 \
libxcb-shm.so.0 \
libxcb-xfixes.so.0 \
libxcb-xinput.so.0 \
libxcb.so.1 \
libxkbcommon.so.0"

inherit rpm
