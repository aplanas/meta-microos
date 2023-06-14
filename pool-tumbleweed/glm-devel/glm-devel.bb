SUMMARY = "Header only C++ mathematics library for graphics"
DESCRIPTION = "OpenGL Mathematics (GLM) is a header only C++ mathematics library for graphics \
software based on the OpenGL Shading Language (GLSL) specification. \
 \
GLM provides classes and functions designed and implemented with the same naming \
conventions and functionalities than GLSL so that when a programmer knows GLSL, \
he knows GLM as well which makes it really easy to use."
LICENSE = "GPL-2.0-only & MIT"

PV = "0.9.9.8"

RPM_NAME = "glm-devel-0.9.9.8-2.7.aarch64.rpm"
RPM_HASH = "de086ed0e7705a16ee70c47406339588704162ba6d77714629ec1bc45a64e1c48eca8f1daa758a53d3867ae722288168669a72ce5b83a6516284ac799cf09518"

RPROVIDES:${PN} += "cmake-glm \
glm-devel \
pkgconfig-glm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake"

inherit rpm
