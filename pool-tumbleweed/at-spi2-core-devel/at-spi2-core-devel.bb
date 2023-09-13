SUMMARY = "Development files for the Assistive Technology Service Provider Interface"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.4"

RPM_NAME = "at-spi2-core-devel-2.48.4-1.1.aarch64.rpm"
RPM_HASH = "552c11e653c18932bd250e5b49069498bca0793b7f2e5310a603dfd07f61d225a1ae354a0d6ced5c6bdda792de744ef23266b93cc9c1284e086300cb6d5940d9"

RPROVIDES:${PN} += "at-spi2-core-devel \
pkgconfig-atk \
pkgconfig-atk-bridge-2.0 \
pkgconfig-atspi-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
at-spi2-core \
libatk-1-0-0 \
libatk-bridge-2-0-0 \
libatspi0 \
pkgconfig-atk \
pkgconfig-atspi-2 \
pkgconfig-dbus-1 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-x11 \
pkgconfig-xi \
pkgconfig-xtst \
typelib-1-0-Atk-1-0 \
typelib-1-0-Atspi-2-0"

inherit rpm
