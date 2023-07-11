SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.16.2"

RPM_NAME = "wlroots-devel-0.16.2-2.3.aarch64.rpm"
RPM_HASH = "64c73242785d2aae088c666ecddd91a4aaf166533956bf632e58780922247d08f46450726652a408b7cc039c7632acdbb7a8c7ad23c2699858bfb9a777f60c31"

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
