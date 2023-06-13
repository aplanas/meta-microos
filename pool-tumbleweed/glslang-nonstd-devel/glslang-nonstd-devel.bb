SUMMARY = "Secondary set of header files for glslang"
DESCRIPTION = "glslang is a compiler front end for the OpenGL ES and OpenGL shading \
languages. It implements a strict interpretation of the \
specifications for these languages. \
 \
This package contains additional headers that are not officially installed, \
but which some downstream packages rely on."
LICENSE = "BSD-3-Clause"

PV = "12.2.0"

RPM_NAME = "glslang-nonstd-devel-12.2.0-1.1.noarch.rpm"
RPM_HASH = "733a4004a9ccc0f0569d33149ebdfced7b77f27145f18e0344831f8707d21f80e614230041f01c48347184dfe8509d0892b6707a47899eb7a4f3859b414b81f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glslang-nonstd-devel"

RDEPENDS:${PN} += "libglslang12"

inherit rpm
