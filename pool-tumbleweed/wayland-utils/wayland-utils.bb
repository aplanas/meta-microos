SUMMARY = "Wayland diagnostic utilities"
DESCRIPTION = "A collection of wayland utilities, presently just wayland-info. \
 \
wayland-info displays information about the protocols supported by a \
Wayland compositor, and a subset of Wayland protocols it knows about, \
namely Linux DMABUF, presentation time, tablet and XDG output \
protocols."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "wayland-utils-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "0f138bd9242359414fa9a945016ac309b30e01bf21da331083aeab284a36d30815c8faf95d95cd43539af33160ebd312b7c9fa43d8f7d5d24b6d20a0c03c6f5c"

RPROVIDES:${PN} += "wayland-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libwayland-client.so.0"

inherit rpm
