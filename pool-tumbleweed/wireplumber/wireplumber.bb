SUMMARY = "Session / policy manager implementation for PipeWire"
DESCRIPTION = "WirePlumber is a modular session / policy manager for PipeWire and \
a GObject-based high-level library that wraps PipeWire's API, \
providing convenience for writing the daemon's modules as well as \
external tools for managing PipeWire."
LICENSE = "MIT"

PV = "0.4.14"

RPM_NAME = "wireplumber-0.4.14-2.1.aarch64.rpm"
RPM_HASH = "c0d256e9dafd42a2a4e74a6c5c8d37a5ced18cca08eca8e7b53011e6b79a3c96d844e648b8443d01c7e56d2b6cad69cd0d426067a82206ecbf381018f662fcf6"

RPROVIDES:${PN} += "libwireplumber-module-default-nodes-api.so \
libwireplumber-module-default-nodes.so \
libwireplumber-module-default-profile.so \
libwireplumber-module-file-monitor-api.so \
libwireplumber-module-logind.so \
libwireplumber-module-lua-scripting.so \
libwireplumber-module-metadata.so \
libwireplumber-module-mixer-api.so \
libwireplumber-module-portal-permissionstore.so \
libwireplumber-module-reserve-device.so \
libwireplumber-module-si-audio-adapter.so \
libwireplumber-module-si-audio-endpoint.so \
libwireplumber-module-si-node.so \
libwireplumber-module-si-standard-link.so \
pipewire-session-manager \
wireplumber"

RDEPENDS:${PN} += "-wireplumber-audio if (pipewire-pulseaudio or pipewire-jack) \
/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblua5.4.so.5 \
libm.so.6 \
libpipewire-0.3.so.0 \
libsystemd.so.0 \
libwireplumber-0.4.so.0 \
pipewire"

inherit rpm
