SUMMARY = "Machine-readable files from the SPIR-V registry"
DESCRIPTION = "This repository contains machine-readable files from the SPIR-V \
registry. This includes: \
 \
* Header files for various languages. \
* JSON files describing the grammar for the SPIR-V core instruction \
  set, and for the GLSL.std.450 extended instruction set. \
* The XML registry file."
LICENSE = "MIT"

PV = "1.6.1+sdk250"

RPM_NAME = "spirv-headers-1.6.1+sdk250-1.1.noarch.rpm"
RPM_HASH = "fe0f4dd347b3c8731112f5da81775732d10a3d149cb011a9120c92e20a59dd35fe0c60dbd0824ff11f182c92765b2435f81b908033d5f432ac1cefd645a5bfa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake(SPIRV-Headers) \
pkgconfig(SPIRV-Headers) \
spirv-headers"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
