SUMMARY = "Debuginfo dependencies for MicroOS installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "installation-images-debuginfodeps-MicroOS-17.90-1.26.aarch64.rpm"
RPM_HASH = "808897a094b07c73f8c8d5a87bbbf7015879b9af9ce86ced7f5762f2b50fb4330693c47c1499f99708da86d3aecaa4b10b3dd1d730055bbc64cf81897f539cd9"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-MicroOS"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
