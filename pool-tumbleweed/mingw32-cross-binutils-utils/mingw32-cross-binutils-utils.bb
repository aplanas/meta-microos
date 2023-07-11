SUMMARY = "Utilities for packaging support"
DESCRIPTION = "Utilities (like strip and objdump) which are needed for generating package"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.39"

RPM_NAME = "mingw32-cross-binutils-utils-2.39-4.4.aarch64.rpm"
RPM_HASH = "f464795977dcbef3df62025fe991d57992846614fe3de41c87df38278a31ab0a1341b76b953d618b5e06848cd18b1b65461fd5146368c82bdc9daf8f121f56f4"

RPROVIDES:${PN} += "mingw32-cross-binutils-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
