SUMMARY = "Day/night gamma adjustments for Wayland compositors"
DESCRIPTION = "Day/night gamma adjustments for Wayland compositors supporting wlr-gamma-control-unstable-v1"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "wlsunset-0.3.0-1.1.aarch64.rpm"
RPM_HASH = "02dc8a83bb374f71f249a3a8432af2ce8fcbbf009a6641d06b9c863b8e197c1f19570f51c6759d0618869274a5b92cff96e408c15ef6a999a07c80b3dc23ad0b"

RPROVIDES:${PN} += "wlsunset"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libwayland-client.so.0"

inherit rpm
