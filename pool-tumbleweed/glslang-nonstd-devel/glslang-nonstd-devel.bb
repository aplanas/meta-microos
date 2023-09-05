SUMMARY = "Secondary set of header files for glslang"
DESCRIPTION = "glslang is a compiler front end for the OpenGL ES and OpenGL shading \
languages. It implements a strict interpretation of the \
specifications for these languages. \
 \
This package contains additional headers that are not officially installed, \
but which some downstream packages rely on."
LICENSE = "BSD-3-Clause"

PV = "12.3.1+sdk261"

RPM_NAME = "glslang-nonstd-devel-12.3.1+sdk261-1.1.noarch.rpm"
RPM_HASH = "a1bc7460f9fd9148a9f363c3728134f5d4b338e71abe60aba35f7db45299ca4c996c73e4c86f9a6ecbeb7ddf633e2039222c4f9804f759102a2a7e7c070f84d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glslang-nonstd-devel"

RDEPENDS:${PN} += "libglslang12"

inherit rpm
