SUMMARY = "OpenGL and OpenGL ES shader front end implementation"
DESCRIPTION = "glslang is a compiler front end for the OpenGL ES and OpenGL shading \
languages. It implements a strict interpretation of the \
specifications for these languages."
LICENSE = "BSD-3-Clause"

PV = "12.2.0"

RPM_NAME = "libglslang12-12.2.0-1.1.aarch64.rpm"
RPM_HASH = "cfea908116a4d18ec3fbe8d77db97ce1ab29dbd56cf5d4c1ce9df5bbe0a1e7459436fa1a799c3a85a05f55abdefdf575ddd5385d225fa89e004743bb3e465b4f"

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
