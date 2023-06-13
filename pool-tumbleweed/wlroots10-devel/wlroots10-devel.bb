SUMMARY = "Modular Wayland compositor library"
DESCRIPTION = "Pluggable, composable modules for building a Wayland compositor."
LICENSE = "MIT"

PV = "0.15.1"

RPM_NAME = "wlroots10-devel-0.15.1-2.1.aarch64.rpm"
RPM_HASH = "d3ccaaa59eb1162b9f0f322f2c017643a5ff30c644f3b3b1b98cfc75c126ae93e53da76a0c7ae40bbdcdf2d440ef2ad921310279e5b6bc49709b301ebad18f86"

RPROVIDES:${PN} += "pkgconfig(wlroots) \
wlroots10-devel \
wlroots10-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwlroots10 \
pkgconfig(egl) \
pkgconfig(gbm) \
pkgconfig(glesv2) \
pkgconfig(libdrm) \
pkgconfig(libinput) \
pkgconfig(libseat) \
pkgconfig(libudev) \
pkgconfig(pixman-1) \
pkgconfig(vulkan) \
pkgconfig(wayland-client) \
pkgconfig(wayland-server) \
pkgconfig(xcb) \
pkgconfig(xcb-composite) \
pkgconfig(xcb-dri3) \
pkgconfig(xcb-errors) \
pkgconfig(xcb-icccm) \
pkgconfig(xcb-present) \
pkgconfig(xcb-render) \
pkgconfig(xcb-renderutil) \
pkgconfig(xcb-res) \
pkgconfig(xcb-shm) \
pkgconfig(xcb-xfixes) \
pkgconfig(xcb-xinput) \
pkgconfig(xkbcommon)"

inherit rpm
