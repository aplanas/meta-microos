SUMMARY = "Development files for the Assistive Technology Service Provider Interface"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.3"

RPM_NAME = "at-spi2-core-devel-2.48.3-1.1.aarch64.rpm"
RPM_HASH = "d7269364359befa0759ea1a5fa176498c0c4c8ff89cbdd38b76e0f1bf791b3a5dcacf9073f3308e3da50cb6f4a31068d0ea3a38ba2fd3eef949280efcd675978"

RPROVIDES:${PN} += "at-spi2-core-devel \
at-spi2-core-devel(aarch-64) \
pkgconfig(atk) \
pkgconfig(atk-bridge-2.0) \
pkgconfig(atspi-2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
at-spi2-core \
libatk-1_0-0 \
libatk-bridge-2_0-0 \
libatspi0 \
pkgconfig(atk) \
pkgconfig(atspi-2) \
pkgconfig(dbus-1) \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(x11) \
pkgconfig(xi) \
pkgconfig(xtst) \
typelib-1_0-Atk-1_0 \
typelib-1_0-Atspi-2_0"

inherit rpm
