SUMMARY = "Binaries of iPXE for ww4 installation"
DESCRIPTION = "For the boot of the nodes iPXE binaries are needed. As these package includes these files for \
x86, i386 and ARM. \
These are the binaries from the upstream project."
LICENSE = "BSD-3-Clause"

PV = "4.4.0"

RPM_NAME = "warewulf4-ipxe-4.4.0-6.5.noarch.rpm"
RPM_HASH = "ea47f9f952c60eb6531e9c7a601c623e6f79052e66c1ce86130e58c70f6c7bb6166362bedf8d881b7b9ec9da2e1a88857b97f8ba0c2bb28becbd27bdb2c17cf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf4-ipxe"

RDEPENDS:${PN} += ""

inherit rpm
