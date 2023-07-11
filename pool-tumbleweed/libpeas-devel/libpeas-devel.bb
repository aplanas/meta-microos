SUMMARY = "Development files for libpeas, a GObject-based plugin engine"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility."
LICENSE = "LGPL-2.1-or-later"

PV = "1.36.0"

RPM_NAME = "libpeas-devel-1.36.0-1.2.aarch64.rpm"
RPM_HASH = "806d97daff28e113a260b825089c14784f1c2c679af07fe9056f09b21ee1b5b897baa259bd6b162ad52ff9521c906b9f73189dcdac197b7acf5d0af238d336e4"

RPROVIDES:${PN} += "libpeas-devel \
pkgconfig-libpeas-1.0 \
pkgconfig-libpeas-gtk-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpeas-1-0-0 \
libpeas-gtk-1-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gobject-introspection-1.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libpeas-1.0 \
typelib-1-0-Peas-1-0 \
typelib-1-0-PeasGtk-1-0"

inherit rpm
