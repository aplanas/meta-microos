SUMMARY = "Python3 runtime loader for libpeas"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility. \
 \
This package contains the python3 loader."
LICENSE = "LGPL-2.1-or-later"

PV = "1.36.0"

RPM_NAME = "libpeas-loader-python3-1.36.0-1.2.aarch64.rpm"
RPM_HASH = "ab4f363c8beca502ed0ef08dc356ccdd5ff68cd51284e1b074c604fdc4e2a1d00d687b9b2255d499e32372bf70db57ec67876cc7f09b45d85fb1e576b8fdf31f"

RPROVIDES:${PN} += "libpeas-loader-python3 \
libpython3loader.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpeas-1.0.so.0 \
libpython3.11.so.1.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
