SUMMARY = "OpenGL and OpenGL ES shader front end implementation"
DESCRIPTION = "glslang is a compiler front end for the OpenGL ES and OpenGL shading \
languages. It implements a strict interpretation of the \
specifications for these languages."
LICENSE = "BSD-3-Clause"

PV = "12.3.1+sdk261"

RPM_NAME = "libglslang12-12.3.1+sdk261-1.1.aarch64.rpm"
RPM_HASH = "ae49f93d49c269692fb12669b8cf9625b63f92ff0b627561349eed95bd86c607c4b27e285a7a71307f8dca3666c88dc456d2783592974b2254ca50d51d0831c3"

RPROVIDES:${PN} += "libHLSL.so.12 \
libSPIRV.so.12 \
libSPVRemapper.so.12 \
libglslang-default-resource-limits.so.12 \
libglslang.so.12 \
libglslang12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
