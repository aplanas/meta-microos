SUMMARY = "Machine-readable files from the SPIR-V registry"
DESCRIPTION = "This repository contains machine-readable files from the SPIR-V \
registry. This includes: \
 \
* Header files for various languages. \
* JSON files describing the grammar for the SPIR-V core instruction \
  set, and for the GLSL.std.450 extended instruction set. \
* The XML registry file."
LICENSE = "MIT"

PV = "1.6.1+sdk261"

RPM_NAME = "spirv-headers-1.6.1+sdk261-1.1.noarch.rpm"
RPM_HASH = "3cd5aef04d0f58eb8b61f1c717852c7bcdd95db634e1517dd6f8232c750dc99bfbc8b315765e9d129322420ce35ca912b999ba3743a54cd69cca1342592780bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake-SPIRV-Headers \
pkgconfig-SPIRV-Headers \
spirv-headers"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
