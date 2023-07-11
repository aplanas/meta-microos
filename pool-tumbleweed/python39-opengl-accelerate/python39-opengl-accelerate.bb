SUMMARY = "Acceleration for python-opengl"
DESCRIPTION = "This set of C (Cython) extensions provides acceleration of common \
operations for slow points in PyOpenGL 3.x. For code which uses large \
arrays extensively speed-up is around 10% compared to unaccelerated \
code."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "python39-opengl-accelerate-3.1.6-1.11.aarch64.rpm"
RPM_HASH = "06d8e6b893bf4c2918c67a15d843174c63070333607e393dea88b49402c460b47aab64b5249929848ff96d0e93b9af3a40c4252994033af497c12ca0c4349917"

RPROVIDES:${PN} += "python3.9dist-pyopengl-accelerate \
python39-PyOpenGL-accelerate \
python39-opengl-accelerate \
python3dist-pyopengl-accelerate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-opengl"

inherit rpm
