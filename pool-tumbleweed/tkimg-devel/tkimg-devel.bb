SUMMARY = "Header Files and C API Documentation for tkimg"
DESCRIPTION = "Files needed to compile/link C code against tkimg."
LICENSE = "BSD-3-Clause"

PV = "1.4.14"

RPM_NAME = "tkimg-devel-1.4.14-1.1.aarch64.rpm"
RPM_HASH = "47d3ca4f9f40775abf4af6d3f17c1cf9f3024d112915b37689ed3bae2d64222e91fa81f3157a64685d1a6def2d0ca29b93736e79c055194f091b70e5e1672363"

RPROVIDES:${PN} += "tkimg-devel"

RDEPENDS:${PN} += ""

inherit rpm
