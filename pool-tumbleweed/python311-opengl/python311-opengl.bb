SUMMARY = "OpenGL bindings for Python"
DESCRIPTION = "OpenGL bindings for Python including support for GL extensions, GLU, \
WGL, GLUT, GLE, and Tk."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "python311-opengl-3.1.6-2.2.noarch.rpm"
RPM_HASH = "05b50c8e31f129587dc40abf8b7b88f556d140e809659098c452eb38e842e1ed0a7ede7a8427a6a1f909572b99fa9dfb2f4db5411373b7489da40912b7a9f494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyOpenGL \
python3-opengl \
python3.11dist-pyopengl \
python311-PyOpenGL \
python311-opengl \
python3dist-pyopengl"

RDEPENDS:${PN} += "Mesa-dri \
python-abi"

inherit rpm
