SUMMARY = "A dynamic menu for Sway and wlroots-based Wayland compositors"
DESCRIPTION = "An dynamic menu for Sway and wlroots based Wayland compositors (requires \
wlr_layer_shell_v1 support)."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "wmenu-0.1.3-1.1.aarch64.rpm"
RPM_HASH = "8b122028b6705934136e067d1252489a5db2377eb50140a684969742cdf960250967c56189a4e654ff70f3e6f295ad4a0282837ae0d8ea2e4c9b3c06ac762d8b"

RPROVIDES:${PN} += "wmenu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
