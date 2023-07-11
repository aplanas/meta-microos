SUMMARY = "Acceleration for python-opengl"
DESCRIPTION = "This set of C (Cython) extensions provides acceleration of common \
operations for slow points in PyOpenGL 3.x. For code which uses large \
arrays extensively speed-up is around 10% compared to unaccelerated \
code."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "python310-opengl-accelerate-3.1.6-1.11.aarch64.rpm"
RPM_HASH = "278d8764232e5903024b843f1f4e2ff09565d0d84a1d6f5fab58f0e678ee3055dae73feb8fcca3f5a085ae9cba44b5540baf28cd3fba2bbcc96b7f92a7d80937"

RPROVIDES:${PN} += "python3.10dist-pyopengl-accelerate \
python310-PyOpenGL-accelerate \
python310-opengl-accelerate \
python3dist-pyopengl-accelerate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python310-opengl"

inherit rpm
