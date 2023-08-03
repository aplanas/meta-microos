SUMMARY = "OpenGL Plugin for HWLOC (NVIDIA Only)"
DESCRIPTION = "Plugin for HWLOC to detect and enumerate OpenGL devices. This works only \
for NVIDIA devices running the proprietary driver by using the NV-CONTROL \
X Window System extension."
LICENSE = "BSD-3-Clause"

PV = "2.9.2"

RPM_NAME = "hwloc-gl-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "ac58591c3ffdbb3bd4385957bf3f5a9adf657128e2ef089f47e5dedd2d6b0f0b618fe9346bafe9ce51e94e6081488407b845a08335d417230f47570021bcfd4e"

RPROVIDES:${PN} += "hwloc-gl"

RDEPENDS:${PN} += "hwloc \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXNVCtrl.so.0 \
libc.so.6"

inherit rpm
