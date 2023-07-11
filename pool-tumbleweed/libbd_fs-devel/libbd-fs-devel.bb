SUMMARY = "Development files for the libbd_fs plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_fs plugin/library.."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_fs-devel-2.28-1.6.aarch64.rpm"
RPM_HASH = "e838005e4e6a0e2061b0227a91d7b189858d823da33e50f18e3f107aae20018e00742893c544b9df711f14971479a6b7b6a00f7c637047509bebde5efb60f492"

RPROVIDES:${PN} += "libbd-fs-devel \
libblockdev-fs-devel"

RDEPENDS:${PN} += "dosfstools \
glib2-devel \
libbd-fs2 \
libbd-utils-devel \
xfsprogs"

inherit rpm
