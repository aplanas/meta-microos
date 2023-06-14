SUMMARY = "A Wayland notification daemon"
DESCRIPTION = "A notification daemon for Wayland. Intended to be used with sway."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "mako-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "f2c8cc464f13907d55e7ebc59b5020d117c04f7ef1be4735601b7ce016a6b6f6126e08399fc718d03d1b762aa58534b9269f8da8c798b2f5c8035da87a0bc51b"

RPROVIDES:${PN} += "mako"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsystemd.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0"

inherit rpm
