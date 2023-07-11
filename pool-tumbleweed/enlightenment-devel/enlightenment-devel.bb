SUMMARY = "Enightenment development files"
DESCRIPTION = "Development files of Enlightenment package."
LICENSE = "BSD-2-Clause"

PV = "0.25.4"

RPM_NAME = "enlightenment-devel-0.25.4-3.4.aarch64.rpm"
RPM_HASH = "c73c4392af26d419a0a493e990323d974d5d29514f9c6b7c5de01ff8157c4a55d61bcafb9025868308899865bcdeec14022310edca2dd8e7cbf79ac2c28464e3"

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
