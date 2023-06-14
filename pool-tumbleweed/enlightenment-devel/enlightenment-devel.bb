SUMMARY = "Enightenment development files"
DESCRIPTION = "Development files of Enlightenment package."
LICENSE = "BSD-2-Clause"

PV = "0.25.4"

RPM_NAME = "enlightenment-devel-0.25.4-3.3.aarch64.rpm"
RPM_HASH = "8793ac7d75df6d202db11caa8ca5d83a4dcdc80204251bfa9132c653a838719d84f88a9fdeb52fe30b10be56fb6824a4d7dd4bb631d217eea30acf7d7b363ca6"

RPROVIDES:${PN} += "e17-devel \
enlightenment-devel \
pkgconfig-enlightenment \
pkgconfig-everything"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
efl-devel \
elementary-devel \
enlightenment \
freetype2-devel \
pam-devel \
pkgconfig \
pkgconfig-dbus-1 \
pkgconfig-ecore \
pkgconfig-ecore-con \
pkgconfig-ecore-drm2 \
pkgconfig-ecore-file \
pkgconfig-ecore-input \
pkgconfig-ecore-input-evas \
pkgconfig-ecore-ipc \
pkgconfig-ecore-wl2 \
pkgconfig-ecore-x \
pkgconfig-eet \
pkgconfig-eeze \
pkgconfig-efl-canvas-wl \
pkgconfig-efreet \
pkgconfig-efreet-mime \
pkgconfig-eina \
pkgconfig-eio \
pkgconfig-eldbus \
pkgconfig-elementary \
pkgconfig-emotion \
pkgconfig-enlightenment \
pkgconfig-evas \
pkgconfig-uuid \
pkgconfig-wayland-client \
pkgconfig-wayland-protocols \
pkgconfig-wayland-scanner \
pkgconfig-wayland-server \
pkgconfig-xkbcommon \
xorg-x11-libXext-devel"

inherit rpm
