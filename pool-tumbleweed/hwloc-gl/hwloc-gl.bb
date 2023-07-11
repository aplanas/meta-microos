SUMMARY = "OpenGL Plugin for HWLOC (NVIDIA Only)"
DESCRIPTION = "Plugin for HWLOC to detect and enumerate OpenGL devices. This works only \
for NVIDIA devices running the proprietary driver by using the NV-CONTROL \
X Window System extension."
LICENSE = "BSD-3-Clause"

PV = "2.9.1"

RPM_NAME = "hwloc-gl-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "7c6edb457710dfddf93c70c50de6dd86eee7ee2ab69241cc07030615b94e16e48a636af7491cfddc000015d08b0af6baa817c30e434a99debf441fef70a64d6e"

RPROVIDES:${PN} += "hwloc-gl"

RDEPENDS:${PN} += "hwloc \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXNVCtrl.so.0 \
libc.so.6"

inherit rpm
