SUMMARY = "Development files for the libblockdev-swap plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_swap plugin/library."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_swap-devel-2.28-1.4.aarch64.rpm"
RPM_HASH = "6118431c8f2bd396fd97f85221a6f3a7c00d870ec18ba126cbd862ba71d4af9f0c6502c48a7a0b7ee271965626e1a58c5bdbea923ceb93d400d9cab4c4977afd"

RPROVIDES:${PN} += "libbd_swap-devel \
libbd_swap-devel(aarch-64) \
libblockdev-swap-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd_swap2 \
libbd_utils-devel"

inherit rpm
