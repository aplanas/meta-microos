SUMMARY = "Utilities from xkbcommon"
DESCRIPTION = "xkbcommon tools for introspection and debugging."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libxkbcommon-tools-1.5.0-1.4.aarch64.rpm"
RPM_HASH = "f5b2d597024e222d498dd5949892f1cde53dc55b3b86d0e77d8d499652b094bb23bd8af8584328c9af25d0949861098c410a10a966c212f57c0fc4e8769f300f"

RPROVIDES:${PN} += "libxkbcommon-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwayland-client.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
libxkbregistry.so.0"

inherit rpm
