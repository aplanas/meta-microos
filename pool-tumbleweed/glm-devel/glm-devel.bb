SUMMARY = "Header only C++ mathematics library for graphics"
DESCRIPTION = "OpenGL Mathematics (GLM) is a header only C++ mathematics library for graphics \
software based on the OpenGL Shading Language (GLSL) specification. \
 \
GLM provides classes and functions designed and implemented with the same naming \
conventions and functionalities than GLSL so that when a programmer knows GLSL, \
he knows GLM as well which makes it really easy to use."
LICENSE = "GPL-2.0-only & MIT"

PV = "0.9.9.8"

RPM_NAME = "glm-devel-0.9.9.8-2.8.aarch64.rpm"
RPM_HASH = "50125471464fae984e83ec2ac46b24a3cc22c1b901c549b3060456c3afaca46354b1a70ea31fcfb1d79182d9bdff3590630a50eca167b82ae02bce8c5626ef09"

RPROVIDES:${PN} += "cmake-glm \
glm-devel \
pkgconfig-glm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake"

inherit rpm
