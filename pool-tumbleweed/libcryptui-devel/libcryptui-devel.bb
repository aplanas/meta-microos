SUMMARY = "Development files for libcryptui, a PGP key prompting library"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys."
LICENSE = "LGPL-2.1-or-later"

PV = "3.12.2"

RPM_NAME = "libcryptui-devel-3.12.2-10.3.aarch64.rpm"
RPM_HASH = "2450b6acbaf27d848a4f25b3bdd1464417e75e15d1a3d8514b007a854f4f68b141346d2d8db60cc1d34ab0406b7ff7408e89ac3cd08620a2612408a83bdba226"

RPROVIDES:${PN} += "libcryptui-devel \
pkgconfig-cryptui-0.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcryptui0 \
pkgconfig-dbus-glib-1 \
pkgconfig-gio-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-CryptUI-0-0"

inherit rpm
