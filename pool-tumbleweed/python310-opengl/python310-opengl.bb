SUMMARY = "OpenGL bindings for Python"
DESCRIPTION = "OpenGL bindings for Python including support for GL extensions, GLU, \
WGL, GLUT, GLE, and Tk."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "python310-opengl-3.1.6-1.6.noarch.rpm"
RPM_HASH = "4780f744c718ebcafed29fc1b9b2d1730414b736c2dc393f997ba62de9230eb888fad2c76782318e3745cf98109e2c534d3b4de51359f27ab804d8b7204953b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyOpenGL \
python3-opengl \
python3.10dist-pyopengl \
python310-PyOpenGL \
python310-opengl \
python3dist-pyopengl"

RDEPENDS:${PN} += "Mesa-dri \
python-abi"

inherit rpm
