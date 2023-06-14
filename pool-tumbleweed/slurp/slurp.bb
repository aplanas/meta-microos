SUMMARY = "Wayland region selector"
DESCRIPTION = "Tool to select a region in a Wayland compositor. \
Meant to be used with a tool called grim."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "slurp-1.4.0-1.2.aarch64.rpm"
RPM_HASH = "327531d1c6c94a4da79d9ce2402115bb0023f09ad612b57d05f307c3ef4f625bed0d17930f2b540d0370b1f63e02562af0902f1cfdcdec0e453da4a4f4ae29d6"

RPROVIDES:${PN} += "slurp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0"

inherit rpm
