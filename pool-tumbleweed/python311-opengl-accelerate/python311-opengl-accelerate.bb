SUMMARY = "Acceleration for python-opengl"
DESCRIPTION = "This set of C (Cython) extensions provides acceleration of common \
operations for slow points in PyOpenGL 3.x. For code which uses large \
arrays extensively speed-up is around 10% compared to unaccelerated \
code."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "python311-opengl-accelerate-3.1.6-1.11.aarch64.rpm"
RPM_HASH = "3d296767564fad3e15f259aaeed0b95f921bc1ad24a17b86f2c3da8c69dd46de36fe88b734ce2d94d85500e09c2d8d6daeb12cdd783ad0fa6dc07d46597e4c85"

RPROVIDES:${PN} += "python3-PyOpenGL-accelerate \
python3-opengl-accelerate \
python3.11dist-pyopengl-accelerate \
python311-PyOpenGL-accelerate \
python311-opengl-accelerate \
python3dist-pyopengl-accelerate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-opengl"

inherit rpm
