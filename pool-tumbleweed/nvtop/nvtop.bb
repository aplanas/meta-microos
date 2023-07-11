SUMMARY = "A (h)top like task monitor for NVIDIA and AMD GPUs"
DESCRIPTION = "Nvtop stands for NVidia TOP, a (h)top like task monitor for AMD, NVIDIA and \
now Intel GPUs. \
 \
It can handle multiple GPUs and print information about them in a htop familiar \
way."
LICENSE = "GPL-3.0-or-later"

PV = "3.0.2+2"

RPM_NAME = "nvtop-3.0.2+2-1.1.aarch64.rpm"
RPM_HASH = "4e0be26edcd5a8894e0507b10c5f9a0cce222b339bc18b360417c71682b85ed87de13cad09dc6dc2546402658ae9cd4fa90baae9caea7feb71c9e1547a955c28"

RPROVIDES:${PN} += "nvtop"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libsystemd.so.0 \
libtinfo.so.6"

inherit rpm
