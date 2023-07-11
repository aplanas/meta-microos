SUMMARY = "OpenGL bindings for Python"
DESCRIPTION = "OpenGL bindings for Python including support for GL extensions, GLU, \
WGL, GLUT, GLE, and Tk."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "python310-opengl-3.1.6-2.2.noarch.rpm"
RPM_HASH = "2f431ea55dd66268b664741da5dfe5c3dcbb495837815c7ef08532d8bf140d321a833632561312baf3431b49194b76d3066d9b3bac5260d8e25bb7990b8bd9eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyopengl \
python310-PyOpenGL \
python310-opengl \
python3dist-pyopengl"

RDEPENDS:${PN} += "Mesa-dri \
python-abi"

inherit rpm
