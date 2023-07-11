SUMMARY = "Development files for libcryptui, a PGP key prompting library"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys."
LICENSE = "LGPL-2.1-or-later"

PV = "3.12.2"

RPM_NAME = "libcryptui-devel-3.12.2-10.4.aarch64.rpm"
RPM_HASH = "52763553504f4f8f47b1dbee6fc4a259d4b0619bfe5a2e87a74819350b3d0671c065490fdae6d4375a5a8cbaefd7bb9dd9ec843d31ac3f6b2c4c5f2c760d93d8"

RPROVIDES:${PN} += "libcryptui-devel \
pkgconfig-cryptui-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcryptui0 \
pkgconfig-dbus-glib-1 \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-CryptUI-0-0"

inherit rpm
