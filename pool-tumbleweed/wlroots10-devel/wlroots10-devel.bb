SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "wlroots10-devel-0.15.1-2.2.aarch64.rpm"
RPM_HASH = "1674ffff0c9ecc842a0ca293b25e3c9433d53669bc671d02d34540b02d8ca5d9d9d77222881a4e4981c82f0f6ddea1afb8f1c9240d1e1076b1eb1219eab6b7e3"

RPROVIDES:${PN} += "pkgconfig-wlroots \
wlroots10-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwlroots10 \
pkgconfig-egl \
pkgconfig-gbm \
pkgconfig-glesv2 \
pkgconfig-libdrm \
pkgconfig-libinput \
pkgconfig-libseat \
pkgconfig-libudev \
pkgconfig-pixman-1 \
pkgconfig-vulkan \
pkgconfig-wayland-client \
pkgconfig-wayland-server \
pkgconfig-xcb \
pkgconfig-xcb-composite \
pkgconfig-xcb-dri3 \
pkgconfig-xcb-errors \
pkgconfig-xcb-icccm \
pkgconfig-xcb-present \
pkgconfig-xcb-render \
pkgconfig-xcb-renderutil \
pkgconfig-xcb-res \
pkgconfig-xcb-shm \
pkgconfig-xcb-xfixes \
pkgconfig-xcb-xinput \
pkgconfig-xkbcommon"

inherit rpm
