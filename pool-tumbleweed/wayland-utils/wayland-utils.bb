SUMMARY = "Wayland diagnostic utilities"
DESCRIPTION = "A collection of wayland utilities, presently just wayland-info. \
 \
wayland-info displays information about the protocols supported by a \
Wayland compositor, and a subset of Wayland protocols it knows about, \
namely Linux DMABUF, presentation time, tablet and XDG output \
protocols."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "wayland-utils-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "344724c7a75e85e4b08e1d70305c999e1ec79cd7233a089bd326ea7a1b8510361f2ed3e7b86ca9bb78615d6e5aa43030861f56ff78cf720d4e0fabf90f74ce47"

RPROVIDES:${PN} += "wayland-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm.so.2 \
libwayland-client.so.0"

inherit rpm
