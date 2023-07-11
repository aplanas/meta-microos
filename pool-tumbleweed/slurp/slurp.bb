SUMMARY = "Wayland region selector"
DESCRIPTION = "Tool to select a region in a Wayland compositor. \
Meant to be used with a tool called grim."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "slurp-1.4.0-1.3.aarch64.rpm"
RPM_HASH = "5768665fbd0f8f72b2a420cfb27ec6e88e679096a398a29ca9855ee32314876a095c1f46746d6cf47b312a6c91ecf78da8e3e56ece64ef0de692b2f467152b76"

RPROVIDES:${PN} += "slurp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0"

inherit rpm
