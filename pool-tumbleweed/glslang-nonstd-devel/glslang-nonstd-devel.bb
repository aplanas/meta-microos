SUMMARY = "Secondary set of header files for glslang"
DESCRIPTION = "glslang is a compiler front end for the OpenGL ES and OpenGL shading \
languages. It implements a strict interpretation of the \
specifications for these languages. \
 \
This package contains additional headers that are not officially installed, \
but which some downstream packages rely on."
LICENSE = "BSD-3-Clause"

PV = "13.0.0"

RPM_NAME = "glslang-nonstd-devel-13.0.0-1.1.noarch.rpm"
RPM_HASH = "4269fa77bfeb6f369e0504f4862778c78b57bf33e1394a5267af363d5b64b6be0495ea9aeba71fae012bb673f7502915e20a459ad2b9220c8eec122b02e9aecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glslang-nonstd-devel"

RDEPENDS:${PN} += "libglslang13"

inherit rpm
