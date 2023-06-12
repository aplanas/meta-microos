SUMMARY = "Acceleration for python-opengl"
DESCRIPTION = "This set of C (Cython) extensions provides acceleration of common \
operations for slow points in PyOpenGL 3.x. For code which uses large \
arrays extensively speed-up is around 10% compared to unaccelerated \
code."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "python311-opengl-accelerate-3.1.6-1.9.aarch64.rpm"
RPM_HASH = "2e74c61a0a2dd5d5017191c6b7a74d46246263445e5c43420d43dd49fb17d0b0d4708f9ec20039a92d293515047e67d570ffd9e0c26170b41a1b0a09b80bde7b"

RPROVIDES:${PN} += "python3.11dist(pyopengl-accelerate) \
python311-PyOpenGL_accelerate \
python311-opengl-accelerate \
python311-opengl-accelerate(aarch-64) \
python3dist(pyopengl-accelerate)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python311-opengl"

inherit rpm
