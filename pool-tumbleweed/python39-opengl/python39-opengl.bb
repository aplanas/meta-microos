SUMMARY = "OpenGL bindings for Python"
DESCRIPTION = "OpenGL bindings for Python including support for GL extensions, GLU, \
WGL, GLUT, GLE, and Tk."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "python39-opengl-3.1.6-2.2.noarch.rpm"
RPM_HASH = "cc678ca6f12c0798a5b2888b005253b9da87cee6315dee26acb4d43c7a184a1c9d824e09a8e7ff8840d43d3478334b58eca883283ef84d1dedda6967a02522d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyopengl \
python39-PyOpenGL \
python39-opengl \
python3dist-pyopengl"

RDEPENDS:${PN} += "Mesa-dri \
python-abi"

inherit rpm
