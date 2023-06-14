SUMMARY = "Library with common API for various MATE modules"
DESCRIPTION = "This package contains the library with common API for various \
MATE modules."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.26.1"

RPM_NAME = "mate-desktop-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "df60ecb7ca272125080185d38ab1d5c1f35e2d1c2ed4f82724f036871dae43c1942ca372e20ad678d36f23a638f426bb5cd5b7181c7ce474d6766f980fce6f41"

RPROVIDES:${PN} += "mate-desktop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-desktop-2.so.17 \
xdg-user-dirs"

inherit rpm
