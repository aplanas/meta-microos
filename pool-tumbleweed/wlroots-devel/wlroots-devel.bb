SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.16.2"

RPM_NAME = "wlroots-devel-0.16.2-2.1.aarch64.rpm"
RPM_HASH = "cfa71e76430029a64655201b73e7b91b9838329c0d1ba047573dc2ffdb87706534b75ecd4483ce2558aae0c64293065dc8f791d295107498d54261b5d74c15ee"

RPROVIDES:${PN} += "pkgconfig-wlroots \
wlroots-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwlroots11 \
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
