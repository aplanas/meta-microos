SUMMARY = "Xdotool type for Wayland"
DESCRIPTION = "xdotool type for Wayland."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "wtype-0.4-1.4.aarch64.rpm"
RPM_HASH = "390dae629eb0db725f5fbf253115b494579b69c0d4948b19f9248f6ff203acb70a2722276f125038b335eb8edbe059c6389650ce11298fa41f26c671e0e7f55e"

RPROVIDES:${PN} += "wtype"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
libxkbcommon.so.0"

inherit rpm
