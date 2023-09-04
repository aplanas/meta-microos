SUMMARY = "Development files for the Assistive Technology Service Provider Interface"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "2.48.3"

RPM_NAME = "at-spi2-core-devel-2.48.3-2.1.aarch64.rpm"
RPM_HASH = "2fab1bb54eb5cdf373d5c8ddf8b98b2a9a3b11f9185d5c714d6532cab87c7652adee5282e54c4faa2806a9345254ebc74a79a5d668a87b6f41219135f7f1e0db"

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
