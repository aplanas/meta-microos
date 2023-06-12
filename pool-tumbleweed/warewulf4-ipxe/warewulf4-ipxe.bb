SUMMARY = "Binaries of iPXE for ww4 installation"
DESCRIPTION = "For the boot of the nodes iPXE binaries are needed. As these package includes these files for \
x86, i386 and ARM. \
These are the binaries from the upstream project."
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "warewulf4-ipxe-4.4.0-6.4.noarch.rpm"
RPM_HASH = "db153570e7c168ebf8c81e5597932163823175ecdc7c7ad9bfca36c1c52a4d400532f60173b41b308b0c5590b31fa8c2cefe8f71241aff6d7e72ad86ed6da05f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf4-ipxe"
RDEPENDS:${PN} += ""

inherit rpm
